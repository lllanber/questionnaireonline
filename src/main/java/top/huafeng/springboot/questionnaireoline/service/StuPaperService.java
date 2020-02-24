package top.huafeng.springboot.questionnaireoline.service;

import top.huafeng.springboot.questionnaireoline.entity.StuPaper;
import java.util.List;

/**
 * 学生做试卷信息表(StuPaper)表服务接口
 *
 * @author makejava
 * @since 2020-02-24 17:17:49
 */
public interface StuPaperService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    StuPaper queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<StuPaper> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param stuPaper 实例对象
     * @return 实例对象
     */
    StuPaper insert(StuPaper stuPaper);

    /**
     * 修改数据
     *
     * @param stuPaper 实例对象
     * @return 实例对象
     */
    StuPaper update(StuPaper stuPaper);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}