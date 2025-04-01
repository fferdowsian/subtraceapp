package farhad.instana.subtraceapp.other;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.EntityUtils;
import org.apache.http.impl.client.HttpClients;
import java.io.IOException;
import java.util.List;

public class SequentialHttpClient {
    public static void main(String[] args) {
        List<String> urls = List.of(
            "https://example.com/api/1",
            "https://example.com/api/2",
            "https://example.com/api/3"
        );
        
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            for (String url : urls) {
                makeRequest(httpClient, url);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private static void makeRequest(CloseableHttpClient httpClient, String url) {
        HttpGet request = new HttpGet(url);
        
        try (CloseableHttpResponse response = httpClient.execute(request)) {
            String responseBody = EntityUtils.toString(response.getEntity());
            System.out.println("Response from " + url + ": " + responseBody);
        } catch (IOException e) {
            System.out.println("Error calling " + url + ": " + e.getMessage());
        }
    }
}
