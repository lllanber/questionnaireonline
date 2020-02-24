package top.huafeng.springboot.questionnaireoline.controller;

import top.huafeng.springboot.questionnaireoline.entity.Statement;
import top.huafeng.springboot.questionnaireoline.service.StatementService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 简答题表
(Statement)表控制层
 *
 * @author makejava
 * @since 2020-02-24 17:17:48
 */
@RestController
@RequestMapping("statement")
public class StatementController {
    /**
     * 服务对象
     */
    @Resource
    private StatementService statementService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Statement selectOne(Integer id) {
        return this.statementService.queryById(id);
    }

}