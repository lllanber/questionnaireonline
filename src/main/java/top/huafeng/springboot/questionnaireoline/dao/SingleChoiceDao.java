package top.huafeng.springboot.questionnaireoline.dao;

import top.huafeng.springboot.questionnaireoline.entity.SingleChoice;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 单选题表(SingleChoice)表数据库访问层
 *
 * @author makejava
 * @since 2020-02-24 17:17:49
 */
public interface SingleChoiceDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SingleChoice queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SingleChoice> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param singleChoice 实例对象
     * @return 对象列表
     */
    List<SingleChoice> queryAll(SingleChoice singleChoice);

    /**
     * 新增数据
     *
     * @param singleChoice 实例对象
     * @return 影响行数
     */
    int insert(SingleChoice singleChoice);

    /**
     * 修改数据
     *
     * @param singleChoice 实例对象
     * @return 影响行数
     */
    int update(SingleChoice singleChoice);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}