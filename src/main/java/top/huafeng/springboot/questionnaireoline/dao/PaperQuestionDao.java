package top.huafeng.springboot.questionnaireoline.dao;

import top.huafeng.springboot.questionnaireoline.entity.PaperQuestion;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 试卷-试题关系表(PaperQuestion)表数据库访问层
 *
 * @author makejava
 * @since 2020-02-24 17:17:49
 */
public interface PaperQuestionDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PaperQuestion queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<PaperQuestion> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param paperQuestion 实例对象
     * @return 对象列表
     */
    List<PaperQuestion> queryAll(PaperQuestion paperQuestion);

    /**
     * 新增数据
     *
     * @param paperQuestion 实例对象
     * @return 影响行数
     */
    int insert(PaperQuestion paperQuestion);

    /**
     * 修改数据
     *
     * @param paperQuestion 实例对象
     * @return 影响行数
     */
    int update(PaperQuestion paperQuestion);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}