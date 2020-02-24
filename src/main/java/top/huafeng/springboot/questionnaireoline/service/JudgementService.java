package top.huafeng.springboot.questionnaireoline.service;

import top.huafeng.springboot.questionnaireoline.entity.Judgement;
import java.util.List;

/**
 * 判断题表
(Judgement)表服务接口
 *
 * @author makejava
 * @since 2020-02-24 17:17:49
 */
public interface JudgementService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Judgement queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Judgement> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param judgement 实例对象
     * @return 实例对象
     */
    Judgement insert(Judgement judgement);

    /**
     * 修改数据
     *
     * @param judgement 实例对象
     * @return 实例对象
     */
    Judgement update(Judgement judgement);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}