package com.example.lzdemo2.entity;

public class Response {
    public Integer errno;
    public Integer code;
    public String  msg;

    public Integer getErrno() {
        return errno;
    }

    public Response() {
    }

    public void setErrno(Integer errno) {
        this.errno = errno;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Response(Integer errno, Integer code, String msg) {
        this.errno = errno;
        this.code = code;
        this.msg = msg;
    }
}
