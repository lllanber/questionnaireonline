package top.huafeng.springboot.questionnaireoline.controller;

import top.huafeng.springboot.questionnaireoline.entity.Paper;
import top.huafeng.springboot.questionnaireoline.service.PaperService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 试卷表(Paper)表控制层
 *
 * @author makejava
 * @since 2020-02-24 17:17:48
 */
@RestController
@RequestMapping("paper")
public class PaperController {
    /**
     * 服务对象
     */
    @Resource
    private PaperService paperService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Paper selectOne(Integer id) {
        return this.paperService.queryById(id);
    }

}