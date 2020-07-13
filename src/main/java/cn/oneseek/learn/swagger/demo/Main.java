package cn.oneseek.learn.swagger.demo;

import cn.oneseek.learn.swagger.demo.domain.response.ResultToken;
import cn.oneseek.learn.swagger.demo.httpClient.RJHttpClient;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class Main {
    public static void main(String[] args) throws Exception {
        RJHttpClient rjHttpClient = new RJHttpClient();
        String token = rjHttpClient.getToken();

        ResultToken resultToken = JSON.parseObject(token,ResultToken.class);
        System.out.println(resultToken.toString());
        System.out.println(resultToken.status);
    }
}
