package top.huafeng.springboot.questionnaireoline.service.impl;

import top.huafeng.springboot.questionnaireoline.entity.PaperQuestion;
import top.huafeng.springboot.questionnaireoline.dao.PaperQuestionDao;
import top.huafeng.springboot.questionnaireoline.service.PaperQuestionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 试卷-试题关系表(PaperQuestion)表服务实现类
 *
 * @author makejava
 * @since 2020-02-24 17:17:49
 */
@Service("paperQuestionService")
public class PaperQuestionServiceImpl implements PaperQuestionService {
    @Resource
    private PaperQuestionDao paperQuestionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PaperQuestion queryById(Integer id) {
        return this.paperQuestionDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<PaperQuestion> queryAllByLimit(int offset, int limit) {
        return this.paperQuestionDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param paperQuestion 实例对象
     * @return 实例对象
     */
    @Override
    public PaperQuestion insert(PaperQuestion paperQuestion) {
        this.paperQuestionDao.insert(paperQuestion);
        return paperQuestion;
    }

    /**
     * 修改数据
     *
     * @param paperQuestion 实例对象
     * @return 实例对象
     */
    @Override
    public PaperQuestion update(PaperQuestion paperQuestion) {
        this.paperQuestionDao.update(paperQuestion);
        return this.queryById(paperQuestion.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.paperQuestionDao.deleteById(id) > 0;
    }
}