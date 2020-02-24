package top.huafeng.springboot.questionnaireoline.controller;

import top.huafeng.springboot.questionnaireoline.entity.SingleChoice;
import top.huafeng.springboot.questionnaireoline.service.SingleChoiceService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 单选题表(SingleChoice)表控制层
 *
 * @author makejava
 * @since 2020-02-24 17:17:49
 */
@RestController
@RequestMapping("singleChoice")
public class SingleChoiceController {
    /**
     * 服务对象
     */
    @Resource
    private SingleChoiceService singleChoiceService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SingleChoice selectOne(Integer id) {
        return this.singleChoiceService.queryById(id);
    }

}