package com.jm.yeonae.domain;


import java.util.Map;

public class ResponseBody {
    private Boolean result;
    private Map<String, ?> response;

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public Map<String, ?> getResponse() {
        return response;
    }

    public void setResponse(Map<String, ?> response) {
        this.response = response;
    }
}
