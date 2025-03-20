package com.demo.CRUD.APIResponse;

public class APIResponse<T> {
    private String message;
    private int codeStatus;
    private T data;

    public APIResponse() {}
    public APIResponse(String message, int codeStatus, T data) {
        this.message = message;
        this.codeStatus = codeStatus;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCodeStatus() {
        return codeStatus;
    }

    public void setCodeStatus(int codeStatus) {
        this.codeStatus = codeStatus;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
