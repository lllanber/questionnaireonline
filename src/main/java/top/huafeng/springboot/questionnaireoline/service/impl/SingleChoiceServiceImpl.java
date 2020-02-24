package top.huafeng.springboot.questionnaireoline.service.impl;

import top.huafeng.springboot.questionnaireoline.entity.SingleChoice;
import top.huafeng.springboot.questionnaireoline.dao.SingleChoiceDao;
import top.huafeng.springboot.questionnaireoline.service.SingleChoiceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 单选题表(SingleChoice)表服务实现类
 *
 * @author makejava
 * @since 2020-02-24 17:17:49
 */
@Service("singleChoiceService")
public class SingleChoiceServiceImpl implements SingleChoiceService {
    @Resource
    private SingleChoiceDao singleChoiceDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SingleChoice queryById(Integer id) {
        return this.singleChoiceDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SingleChoice> queryAllByLimit(int offset, int limit) {
        return this.singleChoiceDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param singleChoice 实例对象
     * @return 实例对象
     */
    @Override
    public SingleChoice insert(SingleChoice singleChoice) {
        this.singleChoiceDao.insert(singleChoice);
        return singleChoice;
    }

    /**
     * 修改数据
     *
     * @param singleChoice 实例对象
     * @return 实例对象
     */
    @Override
    public SingleChoice update(SingleChoice singleChoice) {
        this.singleChoiceDao.update(singleChoice);
        return this.queryById(singleChoice.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.singleChoiceDao.deleteById(id) > 0;
    }
}