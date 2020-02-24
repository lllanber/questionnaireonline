package top.huafeng.springboot.questionnaireoline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QuestionController {
    @RequestMapping("/teacher/questionanalysis")
    public String qustionAnalysis(){
        return "/teacher/analysis/questionanalysis.html";
    }
}
