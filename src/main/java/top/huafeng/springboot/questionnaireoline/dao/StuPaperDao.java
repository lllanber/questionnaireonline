package top.huafeng.springboot.questionnaireoline.dao;

import top.huafeng.springboot.questionnaireoline.entity.StuPaper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 学生做试卷信息表(StuPaper)表数据库访问层
 *
 * @author makejava
 * @since 2020-02-24 17:17:49
 */
public interface StuPaperDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    StuPaper queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<StuPaper> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param stuPaper 实例对象
     * @return 对象列表
     */
    List<StuPaper> queryAll(StuPaper stuPaper);

    /**
     * 新增数据
     *
     * @param stuPaper 实例对象
     * @return 影响行数
     */
    int insert(StuPaper stuPaper);

    /**
     * 修改数据
     *
     * @param stuPaper 实例对象
     * @return 影响行数
     */
    int update(StuPaper stuPaper);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}