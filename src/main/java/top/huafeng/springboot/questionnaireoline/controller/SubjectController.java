package top.huafeng.springboot.questionnaireoline.controller;

import top.huafeng.springboot.questionnaireoline.entity.Subject;
import top.huafeng.springboot.questionnaireoline.service.SubjectService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 学科(Subject)表控制层
 *
 * @author makejava
 * @since 2020-02-24 17:17:49
 */
@RestController
@RequestMapping("subject")
public class SubjectController {
    /**
     * 服务对象
     */
    @Resource
    private SubjectService subjectService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Subject selectOne(Integer id) {
        return this.subjectService.queryById(id);
    }

}