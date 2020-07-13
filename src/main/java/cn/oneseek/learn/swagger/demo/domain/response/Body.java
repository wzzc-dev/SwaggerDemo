package cn.oneseek.learn.swagger.demo.domain.response;

import java.util.List;

public class Body {
    String status; //告知操作结果是成功还是失败
    List<String> head; //表的定义，如果不返回结果集，仅有一列“affected_rows”
    List<List<Object>> data; //具体返回的数据，一排一排的呈现,如果不返回结果集，仅[[affected_rows]]
    Integer rows; //表明总共多少行数据
}
