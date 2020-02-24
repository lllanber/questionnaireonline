package top.huafeng.springboot.questionnaireoline.service;

import top.huafeng.springboot.questionnaireoline.entity.MultipleChoice;
import java.util.List;

/**
 * 多选题表(MultipleChoice)表服务接口
 *
 * @author makejava
 * @since 2020-02-24 17:17:48
 */
public interface MultipleChoiceService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MultipleChoice queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<MultipleChoice> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param multipleChoice 实例对象
     * @return 实例对象
     */
    MultipleChoice insert(MultipleChoice multipleChoice);

    /**
     * 修改数据
     *
     * @param multipleChoice 实例对象
     * @return 实例对象
     */
    MultipleChoice update(MultipleChoice multipleChoice);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}