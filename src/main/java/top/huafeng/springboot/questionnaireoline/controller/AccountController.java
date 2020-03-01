package top.huafeng.springboot.questionnaireoline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import top.huafeng.springboot.questionnaireoline.dto.LoginDTO;
import top.huafeng.springboot.questionnaireoline.entity.Teacher;
import top.huafeng.springboot.questionnaireoline.service.impl.TeacherServiceImpl;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class AccountController {
    @Autowired
    private TeacherServiceImpl teacherService;
    /*
    **处理index.html登录请求
     */
    @PostMapping("/login")
    public String login(
            @RequestBody LoginDTO loginDTO,
            HttpServletRequest request,
            HttpServletResponse response){
        System.out.println("AccountController22：拿到loginDTO = " + loginDTO);
        String account = loginDTO.getAccount();
        String password = loginDTO.getPassword();
        Teacher teacher = teacherService.queryByEmailOrPhone(account, password);
//        System.out.println("teacher = " + teacher);
        if (teacher != null){
            request.getSession().setAttribute("teacherInfo", teacher);
            System.out.println("teacherInfo 的Session已经设置好");
            response.addCookie(new Cookie("teacherToken", teacher.getToken()));
            return "/teacher/coursemanagement/addstudentforcourse";
        }
        return "redirect:/";
    }
}
