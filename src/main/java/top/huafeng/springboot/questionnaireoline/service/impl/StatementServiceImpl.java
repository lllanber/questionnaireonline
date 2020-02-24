package top.huafeng.springboot.questionnaireoline.service.impl;

import top.huafeng.springboot.questionnaireoline.entity.Statement;
import top.huafeng.springboot.questionnaireoline.dao.StatementDao;
import top.huafeng.springboot.questionnaireoline.service.StatementService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 简答题表
(Statement)表服务实现类
 *
 * @author makejava
 * @since 2020-02-24 17:17:48
 */
@Service("statementService")
public class StatementServiceImpl implements StatementService {
    @Resource
    private StatementDao statementDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Statement queryById(Integer id) {
        return this.statementDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Statement> queryAllByLimit(int offset, int limit) {
        return this.statementDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param statement 实例对象
     * @return 实例对象
     */
    @Override
    public Statement insert(Statement statement) {
        this.statementDao.insert(statement);
        return statement;
    }

    /**
     * 修改数据
     *
     * @param statement 实例对象
     * @return 实例对象
     */
    @Override
    public Statement update(Statement statement) {
        this.statementDao.update(statement);
        return this.queryById(statement.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.statementDao.deleteById(id) > 0;
    }
}