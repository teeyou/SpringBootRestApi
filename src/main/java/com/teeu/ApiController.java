package com.teeu;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @RequestMapping(value = "/api/test", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public String getApiTest() {
        return "{\"result\":\"ok\"}";
    }

    @RequestMapping(value = "/api/test2", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public String getApiTest2() {
        return "{\"result\":\"Good\"}";
    }
}
