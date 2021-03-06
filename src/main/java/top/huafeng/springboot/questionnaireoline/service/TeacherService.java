package top.huafeng.springboot.questionnaireoline.service;

import top.huafeng.springboot.questionnaireoline.entity.Teacher;
import java.util.List;

/**
 * 老师表(Teacher)表服务接口
 *
 * @author makejava
 * @since 2020-02-24 17:17:49
 */
public interface TeacherService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Teacher queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Teacher> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param teacher 实例对象
     * @return 实例对象
     */
    Teacher insert(Teacher teacher);

    /**
     * 修改数据
     *
     * @param teacher 实例对象
     * @return 实例对象
     */
    Teacher update(Teacher teacher);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    /*
    **通过email或者手机号查找teacher对象
     */
    Teacher queryByEmailOrPhone(String emailOrMobile, String pwd);


}