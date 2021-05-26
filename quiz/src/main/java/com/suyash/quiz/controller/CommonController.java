package com.suyash.quiz.controller;

import com.suyash.quiz.pojo.Question;
import com.suyash.quiz.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class CommonController {

    @Autowired
    private CommonService commonService;

    @GetMapping(path = "/health")
    public String healthApi() {
        System.out.println("Inside health controller");
        return commonService.sendHealth();
    }

    @GetMapping(path = "/get/categories")
    public List<String> getCategories() {
        return commonService.getCategories();
    }

    @PostMapping(path = "/get/questions")
    public List<Question> getQuestions(@RequestBody Map<String, String> map) {
        System.out.println("map:" + map);
        return commonService.getQuestions();
    }

}
