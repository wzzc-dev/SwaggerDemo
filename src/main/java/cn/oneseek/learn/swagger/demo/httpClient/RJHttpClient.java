package cn.oneseek.learn.swagger.demo.httpClient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class RJHttpClient {
    public String getToken() throws Exception{
        String url = "http://oneseek.cn:6020/rest/login/root/taosdata";
        URL serverUrl = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) serverUrl.openConnection();
        connection.setRequestMethod("GET");
        if (connection.getResponseCode() != 200) {
            throw new RuntimeException(
                    "HTTP GET Request Failed with Error code : "
                            + connection.getResponseCode());
        }
        BufferedReader responseBuffer = new BufferedReader(
                new InputStreamReader((connection.getInputStream())));
        String output;
        System.out.println("Output from Server:  \n");
        StringBuffer result = new StringBuffer();
        while ((output = responseBuffer.readLine()) != null) {
            result.append(output);
        }
        connection.disconnect();
        return new String(result);
    }
}
