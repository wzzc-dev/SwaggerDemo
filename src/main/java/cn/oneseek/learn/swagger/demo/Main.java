package cn.oneseek.learn.swagger.demo;

import cn.oneseek.learn.swagger.demo.domain.response.ResultToken;
import cn.oneseek.learn.swagger.demo.httpClient.RJHttpClient;
import com.alibaba.fastjson.JSON;

public class Main {
    public static void main(String[] args) throws Exception {
        RJHttpClient rjHttpClient = new RJHttpClient();
        String token = rjHttpClient.getToken("http://oneseek.cn:6020/rest/login/root/taosdata","GET");

        ResultToken resultToken = JSON.parseObject(token,ResultToken.class);
        System.out.println(resultToken.toString());
        System.out.println(resultToken.status);
    }
}
