package top.huafeng.springboot.questionnaireoline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import top.huafeng.springboot.questionnaireoline.entity.Teacher;
import top.huafeng.springboot.questionnaireoline.service.SendByEmailTools;
import top.huafeng.springboot.questionnaireoline.service.TeacherService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 老师表(Teacher)表控制层
 *
 * @author makejava
 * @since 2020-02-24 17:17:49
 */
@RestController
@RequestMapping("teacher")
public class TeacherController {
    /**
     * 服务对象
     */
    @Resource
    private TeacherService teacherService;

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

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Teacher selectOne(Integer id) {
        return this.teacherService.queryById(id);
    }

}