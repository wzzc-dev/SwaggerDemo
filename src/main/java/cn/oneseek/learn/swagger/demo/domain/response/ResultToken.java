package cn.oneseek.learn.swagger.demo.domain.response;

import java.util.List;

public class ResultToken {
    public Integer code;
    public String status; //告知操作结果是成功还是失败
    public String desc;

    public ResultToken() {
    }

    @Override
    public String toString() {
        return "ResultToken{" +
                "code=" + code +
                ", status='" + status + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
