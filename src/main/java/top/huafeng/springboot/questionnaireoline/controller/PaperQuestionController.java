package top.huafeng.springboot.questionnaireoline.controller;

import top.huafeng.springboot.questionnaireoline.entity.PaperQuestion;
import top.huafeng.springboot.questionnaireoline.service.PaperQuestionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 试卷-试题关系表(PaperQuestion)表控制层
 *
 * @author makejava
 * @since 2020-02-24 17:17:49
 */
@RestController
@RequestMapping("paperQuestion")
public class PaperQuestionController {
    /**
     * 服务对象
     */
    @Resource
    private PaperQuestionService paperQuestionService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public PaperQuestion selectOne(Integer id) {
        return this.paperQuestionService.queryById(id);
    }

}