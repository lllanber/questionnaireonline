package top.huafeng.springboot.questionnaireoline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CourseController {
    /*
    **开设课程页面
     */
    @RequestMapping("/teacher/setupcourse")
    public String setUpCourse(){
        return "/teacher/coursemanagement/setupcourse";
    }

    /*
    **老师开设课程 界面
    */
    @RequestMapping("/teacher/mycourse")
    public String myCourse(){
        return "/teacher/coursemanagement/mycourse";
    }

    /*
    **给课程添加学生
     */
    @RequestMapping("/teacher/addstudentforcourse")
    public String addStudentForCourse(){
        return "/teacher/coursemanagement/addstudentforcourse";
    }
}
