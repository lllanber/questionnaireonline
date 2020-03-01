package top.huafeng.springboot.questionnaireoline.controller;

import top.huafeng.springboot.questionnaireoline.Utils.ApiResultHandler;
import top.huafeng.springboot.questionnaireoline.dto.SubjectWithStudentDTO;
import top.huafeng.springboot.questionnaireoline.entity.ApiResult;
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

    /*
    **通过 课程id(前端传过来），老师id（Session获取） 查询学生
    * 未完成，没有从Session中获取teacher的id
     */
    @GetMapping("/{subjectId}")
    public @ResponseBody SubjectWithStudentDTO findByCourseId(@PathVariable("subjectId") Integer subjectId){
        //模拟Session传入
        Integer teacherId = 1;
        SubjectWithStudentDTO subjectWithStudentDTO = manageStudentService.findByCourseId(subjectId, teacherId);
        return subjectWithStudentDTO;
    }

    /*
    **将学生从该课程中删除，操作的是tea_stu_sub表，非student表
    * @Param: courseId:课程id 前端传入。  studentId学生id  前端传入。  teacherId老师id Session获取
     */
    @DeleteMapping("/{subjectId}/{studentId}")
    public @ResponseBody
    ApiResult deleteByStudentId(
            @PathVariable("subjectId") Integer subjectId,
            @PathVariable("studentId") Integer studentId){
        //模拟Session传入
        Integer teacherId = 1;
        int res = manageStudentService.deleteByStudentId(subjectId, teacherId, studentId);
        return ApiResultHandler.buildApiResult(200, "删除成功", res);
    }
}