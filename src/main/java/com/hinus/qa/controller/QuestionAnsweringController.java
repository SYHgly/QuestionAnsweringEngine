package com.hinus.qa.controller;

import com.hinus.qa.data.Question2AnswerData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by hzlidandan1 on 2017/9/21.
 */
@Controller
@RequestMapping("/qa")
public class QuestionAnsweringController {
    @RequestMapping("/service")
    @ResponseBody
    public String service(@RequestParam("question") String question) {
        if (question != null) {
            Question2AnswerData question2AnswerData = Question2AnswerData.getInstance();
            return question2AnswerData.getAnswer(question);
        } else {
            return null;
        }
    }
}
