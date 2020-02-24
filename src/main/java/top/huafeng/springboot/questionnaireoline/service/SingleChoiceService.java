package top.huafeng.springboot.questionnaireoline.service;

import top.huafeng.springboot.questionnaireoline.entity.SingleChoice;
import java.util.List;

/**
 * 单选题表(SingleChoice)表服务接口
 *
 * @author makejava
 * @since 2020-02-24 17:17:49
 */
public interface SingleChoiceService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SingleChoice queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SingleChoice> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param singleChoice 实例对象
     * @return 实例对象
     */
    SingleChoice insert(SingleChoice singleChoice);

    /**
     * 修改数据
     *
     * @param singleChoice 实例对象
     * @return 实例对象
     */
    SingleChoice update(SingleChoice singleChoice);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}