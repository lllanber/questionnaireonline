package top.huafeng.springboot.questionnaireoline.service.impl;

import top.huafeng.springboot.questionnaireoline.entity.TeaStuSubject;
import top.huafeng.springboot.questionnaireoline.dao.TeaStuSubjectDao;
import top.huafeng.springboot.questionnaireoline.service.TeaStuSubjectService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 老师-学生-学科 关系表(TeaStuSubject)表服务实现类
 *
 * @author makejava
 * @since 2020-02-24 17:17:48
 */
@Service("teaStuSubjectService")
public class TeaStuSubjectServiceImpl implements TeaStuSubjectService {
    @Resource
    private TeaStuSubjectDao teaStuSubjectDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TeaStuSubject queryById(Integer id) {
        return this.teaStuSubjectDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TeaStuSubject> queryAllByLimit(int offset, int limit) {
        return this.teaStuSubjectDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param teaStuSubject 实例对象
     * @return 实例对象
     */
    @Override
    public TeaStuSubject insert(TeaStuSubject teaStuSubject) {
        this.teaStuSubjectDao.insert(teaStuSubject);
        return teaStuSubject;
    }

    /**
     * 修改数据
     *
     * @param teaStuSubject 实例对象
     * @return 实例对象
     */
    @Override
    public TeaStuSubject update(TeaStuSubject teaStuSubject) {
        this.teaStuSubjectDao.update(teaStuSubject);
        return this.queryById(teaStuSubject.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.teaStuSubjectDao.deleteById(id) > 0;
    }
}