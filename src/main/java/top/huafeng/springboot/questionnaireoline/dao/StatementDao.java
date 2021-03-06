package top.huafeng.springboot.questionnaireoline.dao;

import top.huafeng.springboot.questionnaireoline.entity.Statement;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 简答题表
(Statement)表数据库访问层
 *
 * @author makejava
 * @since 2020-02-24 17:17:48
 */
public interface StatementDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Statement queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Statement> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param statement 实例对象
     * @return 对象列表
     */
    List<Statement> queryAll(Statement statement);

    /**
     * 新增数据
     *
     * @param statement 实例对象
     * @return 影响行数
     */
    int insert(Statement statement);

    /**
     * 修改数据
     *
     * @param statement 实例对象
     * @return 影响行数
     */
    int update(Statement statement);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}