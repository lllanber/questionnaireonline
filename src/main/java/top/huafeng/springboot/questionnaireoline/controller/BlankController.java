package top.huafeng.springboot.questionnaireoline.controller;

import top.huafeng.springboot.questionnaireoline.entity.Blank;
import top.huafeng.springboot.questionnaireoline.service.BlankService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 填空题表
(Blank)表控制层
 *
 * @author makejava
 * @since 2020-02-24 17:17:49
 */
@RestController
@RequestMapping("blank")
public class BlankController {
    /**
     * 服务对象
     */
    @Resource
    private BlankService blankService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Blank selectOne(Integer id) {
        return this.blankService.queryById(id);
    }

}