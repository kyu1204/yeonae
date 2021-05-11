package com.jm.yeonae.controller;


import com.jm.yeonae.domain.ResponseBody;

public class YeonaeController {

    public ResponseBody getPost() {
        
        ResponseBody response = new ResponseBody();
        response.setResult(true);

        return response;
    }
}
