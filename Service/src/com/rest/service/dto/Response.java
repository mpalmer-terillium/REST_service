package com.rest.service.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Response {
    
    private String name;
    private Integer errorCode;
    private List<String> messages;
    
    public Response() {}
    
    public Response(String name, Integer count) {
        this.name = name;
        this.errorCode = 100;
        
        List<String> messages = new ArrayList<>();
        
        for(int i = 0; i < count; i++) {
            messages.add("new message " + i + " for " + name);
        }
        this.messages = messages;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    public List<String> getMessages() {
        return messages;
    }
}
