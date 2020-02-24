package top.huafeng.springboot.questionnaireoline.controller;

import top.huafeng.springboot.questionnaireoline.entity.MultipleChoice;
import top.huafeng.springboot.questionnaireoline.service.MultipleChoiceService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 多选题表(MultipleChoice)表控制层
 *
 * @author makejava
 * @since 2020-02-24 17:17:48
 */
@RestController
@RequestMapping("multipleChoice")
public class MultipleChoiceController {
    /**
     * 服务对象
     */
    @Resource
    private MultipleChoiceService multipleChoiceService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public MultipleChoice selectOne(Integer id) {
        return this.multipleChoiceService.queryById(id);
    }

}