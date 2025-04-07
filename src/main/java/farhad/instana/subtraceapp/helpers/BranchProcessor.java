package farhad.instana.subtraceapp.helpers;

import java.util.Arrays;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ClassicHttpResponse;
import org.apache.hc.core5.http.io.HttpClientResponseHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BranchProcessor {
  protected static Logger logger = LoggerFactory.getLogger(BranchProcessor.class);

  static String serverURL = "http://127.0.0.1:8080";

  public static void processBranch(String traceBranch) {
    logger.debug("traceBranch is " + "\"" + traceBranch + "\"");

    String[] endpoints = traceBranch.split(",");
    callEndpoint(endpoints);
  }

  public static String callEndpoint(String[] endpoints) {
    logger.debug("endpoints is " + String.join(",", endpoints));

    logger.debug("endpoints length is " + endpoints.length);

    if (endpoints[0].length() == 0) {
      return ""; // Base case: Stop if the endpointList is empty
    }
    String nextEndpoint = EndpointFinder.getEndpoint(Integer.parseInt(endpoints[0]));
    String remainingEndpoints = String.join(",", Arrays.copyOfRange(endpoints, 1, endpoints.length));
    try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
      String url = serverURL + "/" + nextEndpoint + "?endpoints=" + remainingEndpoints;
      logger.debug("url is " + url);
      HttpGet request = new HttpGet(url);

      HttpClientResponseHandler<String> responseHandler = (ClassicHttpResponse response) -> {
        int status = response.getCode();
        if (status >= 200 && status < 300) {
          return response.getEntity() != null
              ? org.apache.hc.core5.http.io.entity.EntityUtils.toString(response.getEntity())
              : "";
        } else {
          throw new RuntimeException("Unexpected response status: " + status);
        }
      };

      // Execute request using response handler
      return httpClient.execute(request, responseHandler);
    } catch (Exception e) {
      e.printStackTrace();
      return "Error: " + e.getMessage();
    }
  }
}
