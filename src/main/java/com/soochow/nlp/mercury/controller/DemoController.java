package com.soochow.nlp.mercury.controller;

import com.soochow.nlp.mercury.mapper.TaMapper;
import com.soochow.nlp.mercury.model.Ta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private TaMapper taMapper;

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/test")
    public String test() {
        Ta ta = new Ta();
        ta.setName("ta");
        return String.valueOf(taMapper.insert(ta));
    }

}
