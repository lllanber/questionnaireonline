package top.huafeng.springboot.questionnaireoline.controller;

import top.huafeng.springboot.questionnaireoline.dto.SubjectWithStudentDTO;
import top.huafeng.springboot.questionnaireoline.entity.Student;
import top.huafeng.springboot.questionnaireoline.entity.TeaStuSubject;
import top.huafeng.springboot.questionnaireoline.service.ManageStudentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 老师-学生-学科 关系表(TeaStuSubject)表控制层
 *
 * @author makejava
 * @since 2020-02-24 17:17:48
 */
@RestController
@RequestMapping("ManageStudent")
public class ManageStudentController {
    /**
     * 服务对象
     */
    @Resource
    private ManageStudentService manageStudentService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TeaStuSubject selectOne(Integer id) {
        return this.manageStudentService.queryById(id);
    }

    /*
    **通过 课程id(前端传过来），老师id（Session获取） 查询学生
    * 未完成，没有从Session中获取teacher的id
     */
    @GetMapping("/{courseId}")
    public @ResponseBody SubjectWithStudentDTO findByCourseId(@PathVariable("courseId") Integer courseId){
        Integer teacherId = 1;
        SubjectWithStudentDTO subjectWithStudentDTO = manageStudentService.findByCourseId(courseId, teacherId);
        return subjectWithStudentDTO;
    }
}