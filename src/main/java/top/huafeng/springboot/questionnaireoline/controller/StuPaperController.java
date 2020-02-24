package top.huafeng.springboot.questionnaireoline.controller;

import top.huafeng.springboot.questionnaireoline.entity.StuPaper;
import top.huafeng.springboot.questionnaireoline.service.StuPaperService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 学生做试卷信息表(StuPaper)表控制层
 *
 * @author makejava
 * @since 2020-02-24 17:17:49
 */
@RestController
@RequestMapping("stuPaper")
public class StuPaperController {
    /**
     * 服务对象
     */
    @Resource
    private StuPaperService stuPaperService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public StuPaper selectOne(Integer id) {
        return this.stuPaperService.queryById(id);
    }

}