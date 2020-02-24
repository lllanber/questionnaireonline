package top.huafeng.springboot.questionnaireoline.dao;

import top.huafeng.springboot.questionnaireoline.entity.TeaStuSubject;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 老师-学生-学科 关系表(TeaStuSubject)表数据库访问层
 *
 * @author makejava
 * @since 2020-02-24 17:17:48
 */
public interface TeaStuSubjectDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TeaStuSubject queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TeaStuSubject> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param teaStuSubject 实例对象
     * @return 对象列表
     */
    List<TeaStuSubject> queryAll(TeaStuSubject teaStuSubject);

    /**
     * 新增数据
     *
     * @param teaStuSubject 实例对象
     * @return 影响行数
     */
    int insert(TeaStuSubject teaStuSubject);

    /**
     * 修改数据
     *
     * @param teaStuSubject 实例对象
     * @return 影响行数
     */
    int update(TeaStuSubject teaStuSubject);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}