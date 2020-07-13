package cn.oneseek.learn.swagger.demo.domain.response;

import java.util.Date;

public class Headers {

    private String connection;
    private String content_type;
    private Date date;
    private Date keep_alive;
    private String transfer_encoding;
    public void setConnection(String connection) {
        this.connection = connection;
    }
    public String getConnection() {
        return connection;
    }

    public void setContent_type(String content_type) {
        this.content_type = content_type;
    }
    public String getContent_type() {
        return content_type;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    public Date getDate() {
        return date;
    }

    public void setKeep_alive(Date keep_alive) {
        this.keep_alive = keep_alive;
    }
    public Date getKeep_alive() {
        return keep_alive;
    }

    public void setTransfer_encoding(String transfer_encoding) {
        this.transfer_encoding = transfer_encoding;
    }
    public String getTransfer_encoding() {
        return transfer_encoding;
    }

}
