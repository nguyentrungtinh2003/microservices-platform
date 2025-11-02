package com.TrungTinhBackend.user_service.dto;

import java.time.LocalDateTime;

public class ApiResponse {

    private Long statusCode;
    private String message;
    private Object data;
    private String token;
    private LocalDateTime timestamp;

    public ApiResponse() {
    }

    public ApiResponse(Long statusCode, String message, Object data, String token, LocalDateTime timestamp) {
        this.statusCode = statusCode;
        this.message = message;
        this.data = data;
        this.token = token;
        this.timestamp = timestamp;
    }

    public Long getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Long statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
