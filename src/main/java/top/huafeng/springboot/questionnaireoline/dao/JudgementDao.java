package top.huafeng.springboot.questionnaireoline.dao;

import top.huafeng.springboot.questionnaireoline.entity.Judgement;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 判断题表
(Judgement)表数据库访问层
 *
 * @author makejava
 * @since 2020-02-24 17:17:49
 */
public interface JudgementDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Judgement queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Judgement> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param judgement 实例对象
     * @return 对象列表
     */
    List<Judgement> queryAll(Judgement judgement);

    /**
     * 新增数据
     *
     * @param judgement 实例对象
     * @return 影响行数
     */
    int insert(Judgement judgement);

    /**
     * 修改数据
     *
     * @param judgement 实例对象
     * @return 影响行数
     */
    int update(Judgement judgement);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}