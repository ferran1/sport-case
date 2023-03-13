package com.example.sport.data.payloads.response;

public class MemberResponse {
    private String message;

    public MemberResponse(String message){
        this.message = message;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
