package farhad.instana.subtraceapp.helpers;

import java.io.IOException;
import java.util.Arrays;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BranchProcessor {
  protected static Logger logger = LoggerFactory.getLogger(BranchProcessor.class);  


  public static void processBranch(int[] branch) {
    if (branch.length == 0) {
      return; // Base case: stop when the array is empty
    }

    String serverURL = "http://127.0.0.1:8080";
    int endpoint = branch[branch.length-1];
    String endpointStr;
    System.out.println("Processing endpoint: " + endpoint);

    // Recursive call with the rest of the array
    processBranch(Arrays.copyOfRange(branch, 0, branch.length-1));

    try {
    endpointStr = EndpointFinder.getEndpoint(endpoint);
    logger.debug(endpoint + " -> " + endpointStr);
    HttpGet httpget = new HttpGet(serverURL + "/" + endpointStr);
    CloseableHttpClient httpclient = HttpClients.createDefault();
    logger.debug("calling " + httpget.getURI().toString());
    HttpResponse httpresponse;
      httpresponse = httpclient.execute(httpget);
      logger.debug("reponse is: " + httpresponse.toString());
    } catch (IOException e) {
      logger.debug("IOException: " + e);
      e.printStackTrace();
    }
    //Thread.sleep(2000);



  }
}
