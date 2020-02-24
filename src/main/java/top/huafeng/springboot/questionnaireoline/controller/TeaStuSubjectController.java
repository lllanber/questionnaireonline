package top.huafeng.springboot.questionnaireoline.controller;

import top.huafeng.springboot.questionnaireoline.entity.TeaStuSubject;
import top.huafeng.springboot.questionnaireoline.service.TeaStuSubjectService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 老师-学生-学科 关系表(TeaStuSubject)表控制层
 *
 * @author makejava
 * @since 2020-02-24 17:17:48
 */
@RestController
@RequestMapping("teaStuSubject")
public class TeaStuSubjectController {
    /**
     * 服务对象
     */
    @Resource
    private TeaStuSubjectService teaStuSubjectService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TeaStuSubject selectOne(Integer id) {
        return this.teaStuSubjectService.queryById(id);
    }

}