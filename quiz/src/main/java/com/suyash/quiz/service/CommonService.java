package com.suyash.quiz.service;

import com.suyash.quiz.pojo.Question;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
public class CommonService {

    public String sendHealth() {
        return "Health OKAY";
    }

    public List<String> getCategories() {
        List<String> categories = new ArrayList<>();
        categories.add("C++");
        categories.add("Java");
        categories.add("Python");
        categories.add("JavaScript");
        categories.add("SQL");
        categories.add("Operating Systems");
        categories.add("Networks");
        categories.add("Database");

        return categories;
    }

    public List<Question> getQuestions() {
        List<Question> getQuestions = new ArrayList<>();
        return getQuestions;
    }

}
