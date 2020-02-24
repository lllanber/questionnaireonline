package top.huafeng.springboot.questionnaireoline.controller;

import top.huafeng.springboot.questionnaireoline.entity.Judgement;
import top.huafeng.springboot.questionnaireoline.service.JudgementService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 判断题表
(Judgement)表控制层
 *
 * @author makejava
 * @since 2020-02-24 17:17:49
 */
@RestController
@RequestMapping("judgement")
public class JudgementController {
    /**
     * 服务对象
     */
    @Resource
    private JudgementService judgementService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Judgement selectOne(Integer id) {
        return this.judgementService.queryById(id);
    }

}