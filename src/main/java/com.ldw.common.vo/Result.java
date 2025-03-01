package com.ldw.common.vo;
public class Result<T> {
    private int code;
    private String message;
    private T data;

    public Result(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public int getCode() { return code; }
    public String getMessage() { return message; }
    public T getData() { return data; }

    public static Result<String> success(String data) {
        return new Result<String>(200, "Success", data);
    }
}