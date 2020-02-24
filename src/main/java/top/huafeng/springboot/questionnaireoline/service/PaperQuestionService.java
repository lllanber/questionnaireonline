package top.huafeng.springboot.questionnaireoline.service;

import top.huafeng.springboot.questionnaireoline.entity.PaperQuestion;
import java.util.List;

/**
 * 试卷-试题关系表(PaperQuestion)表服务接口
 *
 * @author makejava
 * @since 2020-02-24 17:17:49
 */
public interface PaperQuestionService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PaperQuestion queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<PaperQuestion> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param paperQuestion 实例对象
     * @return 实例对象
     */
    PaperQuestion insert(PaperQuestion paperQuestion);

    /**
     * 修改数据
     *
     * @param paperQuestion 实例对象
     * @return 实例对象
     */
    PaperQuestion update(PaperQuestion paperQuestion);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}