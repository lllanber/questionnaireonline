package top.huafeng.springboot.questionnaireoline.service.impl;

import top.huafeng.springboot.questionnaireoline.entity.StuPaper;
import top.huafeng.springboot.questionnaireoline.dao.StuPaperDao;
import top.huafeng.springboot.questionnaireoline.service.StuPaperService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 学生做试卷信息表(StuPaper)表服务实现类
 *
 * @author makejava
 * @since 2020-02-24 17:17:49
 */
@Service("stuPaperService")
public class StuPaperServiceImpl implements StuPaperService {
    @Resource
    private StuPaperDao stuPaperDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public StuPaper queryById(Integer id) {
        return this.stuPaperDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<StuPaper> queryAllByLimit(int offset, int limit) {
        return this.stuPaperDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param stuPaper 实例对象
     * @return 实例对象
     */
    @Override
    public StuPaper insert(StuPaper stuPaper) {
        this.stuPaperDao.insert(stuPaper);
        return stuPaper;
    }

    /**
     * 修改数据
     *
     * @param stuPaper 实例对象
     * @return 实例对象
     */
    @Override
    public StuPaper update(StuPaper stuPaper) {
        this.stuPaperDao.update(stuPaper);
        return this.queryById(stuPaper.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.stuPaperDao.deleteById(id) > 0;
    }
}