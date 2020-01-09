import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;

import java.io.IOException;

public class ClientUtil {

    private static RestHighLevelClient client;


    public static RestHighLevelClient getInstance() {

        if (client == null) {

            client = new RestHighLevelClient(RestClient.builder(new HttpHost("192.168.3.240", 9200, "http"),
                    new HttpHost("192.168.3.240", 9201, "http"),
                    new HttpHost("192.168.3.240", 9202, "http")));
        }
        return client;

    }

    public static void close() {

        try {
            if (client != null) {
                client.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
