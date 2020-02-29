package top.huafeng.springboot.questionnaireoline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import top.huafeng.springboot.questionnaireoline.dto.LoginDTO;
import top.huafeng.springboot.questionnaireoline.entity.Teacher;
import top.huafeng.springboot.questionnaireoline.service.impl.TeacherServiceImpl;

@Controller
public class AccountController {
    @Autowired
    private TeacherServiceImpl teacherService;
    /*
    **处理index.html登录请求
     */
    @PostMapping("/login")
    public @ResponseBody Teacher login(@RequestBody LoginDTO loginDTO){
        System.out.println("loginDTO = " + loginDTO);
        String account = loginDTO.getAccount();
        String password = loginDTO.getPassword();
        System.out.println("account = " + account);
        System.out.println("password = " + password);
        Teacher teacher = teacherService.queryByEmailOrPhone(account, password);
        System.out.println("teacher = " + teacher);
        if (teacher != null){
            return teacher;
        }
        return null;
    }
}
