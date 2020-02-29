package top.huafeng.springboot.questionnaireoline.service.impl;

import top.huafeng.springboot.questionnaireoline.Utils.Md5_Utils;
import top.huafeng.springboot.questionnaireoline.entity.Teacher;
import top.huafeng.springboot.questionnaireoline.dao.TeacherDao;
import top.huafeng.springboot.questionnaireoline.service.TeacherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 老师表(Teacher)表服务实现类
 *
 * @author makejava
 * @since 2020-02-24 17:17:49
 */
@Service("teacherService")
public class TeacherServiceImpl implements TeacherService {
    @Resource
    private TeacherDao teacherDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Teacher queryById(Integer id) {
        return this.teacherDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Teacher> queryAllByLimit(int offset, int limit) {
        return this.teacherDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param teacher 实例对象
     * @return 实例对象
     */
    @Override
    public Teacher insert(Teacher teacher) {
        this.teacherDao.insert(teacher);
        return teacher;
    }

    /**
     * 修改数据
     *
     * @param teacher 实例对象
     * @return 实例对象
     */
    @Override
    public Teacher update(Teacher teacher) {
        this.teacherDao.update(teacher);
        return this.queryById(teacher.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.teacherDao.deleteById(id) > 0;
    }


    /*
     **通过email或者手机号查找teacher对象
     */
    @Override
    public Teacher queryByEmailOrPhone(String emailOrMobile, String pwd) {
        boolean isEmail = emailOrMobile.contains("@");
        if (isEmail){
            String email = emailOrMobile;
            Teacher teacher = this.teacherDao.queryByEmail(email);
            if (teacher.getPwd().equals(Md5_Utils.getMD5Value(pwd))){
                return teacher;
            }
            return null;
        }else {
            String mobile = emailOrMobile;
            Teacher teacher = this.teacherDao.queryByMobile(mobile);
            if (teacher.getPwd().equals(Md5_Utils.getMD5Value(pwd))){
                return teacher;
            }
            return null;
        }
    }
}