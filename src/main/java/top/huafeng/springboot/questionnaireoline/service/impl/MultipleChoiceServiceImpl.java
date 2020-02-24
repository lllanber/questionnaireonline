package top.huafeng.springboot.questionnaireoline.service.impl;

import top.huafeng.springboot.questionnaireoline.entity.MultipleChoice;
import top.huafeng.springboot.questionnaireoline.dao.MultipleChoiceDao;
import top.huafeng.springboot.questionnaireoline.service.MultipleChoiceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 多选题表(MultipleChoice)表服务实现类
 *
 * @author makejava
 * @since 2020-02-24 17:17:48
 */
@Service("multipleChoiceService")
public class MultipleChoiceServiceImpl implements MultipleChoiceService {
    @Resource
    private MultipleChoiceDao multipleChoiceDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MultipleChoice queryById(Integer id) {
        return this.multipleChoiceDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<MultipleChoice> queryAllByLimit(int offset, int limit) {
        return this.multipleChoiceDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param multipleChoice 实例对象
     * @return 实例对象
     */
    @Override
    public MultipleChoice insert(MultipleChoice multipleChoice) {
        this.multipleChoiceDao.insert(multipleChoice);
        return multipleChoice;
    }

    /**
     * 修改数据
     *
     * @param multipleChoice 实例对象
     * @return 实例对象
     */
    @Override
    public MultipleChoice update(MultipleChoice multipleChoice) {
        this.multipleChoiceDao.update(multipleChoice);
        return this.queryById(multipleChoice.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.multipleChoiceDao.deleteById(id) > 0;
    }
}