package top.huafeng.springboot.questionnaireoline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import top.huafeng.springboot.questionnaireoline.service.SendByEmailTools;

@Controller
public class AccountController {
    @Autowired
    private SendByEmailTools sendByEmailTools;

    /*
    **老师个人信息界面
     */
    @RequestMapping("/teacher/teacherinfo")
    public String teacherInfo(){
        return "/teacher/personalcenter/teacherinfo";
    }

    /*
    **发送邮箱验证码接口
     */
    @GetMapping("/send")
    public String send(){
        String sender = "xindawy163@163.com";
        String receiver = "1246801578@qq.com";
        String title = "在线考试系统邮箱验证";
        String text = "这是待完成的验证码";
        String result = sendByEmailTools.send(sender, receiver, title, text);
        return result;
    }
}
