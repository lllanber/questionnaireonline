package top.huafeng.springboot.questionnaireoline.service.impl;

import top.huafeng.springboot.questionnaireoline.entity.Paper;
import top.huafeng.springboot.questionnaireoline.dao.PaperDao;
import top.huafeng.springboot.questionnaireoline.service.PaperService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 试卷表(Paper)表服务实现类
 *
 * @author makejava
 * @since 2020-02-24 17:17:48
 */
@Service("paperService")
public class PaperServiceImpl implements PaperService {
    @Resource
    private PaperDao paperDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Paper queryById(Integer id) {
        return this.paperDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Paper> queryAllByLimit(int offset, int limit) {
        return this.paperDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param paper 实例对象
     * @return 实例对象
     */
    @Override
    public Paper insert(Paper paper) {
        this.paperDao.insert(paper);
        return paper;
    }

    /**
     * 修改数据
     *
     * @param paper 实例对象
     * @return 实例对象
     */
    @Override
    public Paper update(Paper paper) {
        this.paperDao.update(paper);
        return this.queryById(paper.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.paperDao.deleteById(id) > 0;
    }
}