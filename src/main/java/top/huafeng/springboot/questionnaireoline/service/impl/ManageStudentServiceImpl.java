package top.huafeng.springboot.questionnaireoline.service.impl;

import org.springframework.beans.BeanUtils;
import top.huafeng.springboot.questionnaireoline.dao.StudentDao;
import top.huafeng.springboot.questionnaireoline.dao.SubjectDao;
import top.huafeng.springboot.questionnaireoline.dto.SubjectWithStudentDTO;
import top.huafeng.springboot.questionnaireoline.entity.Student;
import top.huafeng.springboot.questionnaireoline.entity.Subject;
import top.huafeng.springboot.questionnaireoline.entity.TeaStuSubject;
import top.huafeng.springboot.questionnaireoline.dao.TeaStuSubjectDao;
import top.huafeng.springboot.questionnaireoline.service.ManageStudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 老师-学生-学科 关系表(TeaStuSubject)表服务实现类
 *
 * @author makejava
 * @since 2020-02-24 17:17:48
 */
@Service("ManageStudentService")
public class ManageStudentServiceImpl implements ManageStudentService {

    @Resource
    private TeaStuSubjectDao teaStuSubjectDao;

    @Resource
    private SubjectDao subjectDao;

    @Resource
    private StudentDao studentDao;

    /**
     *  按条件查询学生
     *
     * @param  subjectId 课程id 老师id（Session获取）
     * @return 课程信息+该课程的所有学生信息
     */
    @Override
    public SubjectWithStudentDTO findByCourseId(Integer subjectId, Integer teacherId) {
        //1.查询到课程信息
        Subject subject = this.subjectDao.queryById(subjectId);
        //System.out.println("课程信息查询 subject = " + subject);
        //2.查询到课程学生的信息
        List<Student> list = this.studentDao.queryBySubjectId(subjectId, teacherId);
        //System.out.println("学生信息查询list = " + list);

        //3.把课程信息和学生集合打包 ps: subjectWithStudentDTO 必须有全参和无参数构造器。否则报异常
        SubjectWithStudentDTO subjectWithStudentDTO = new SubjectWithStudentDTO();
        subjectWithStudentDTO.setSubject(subject);
        subjectWithStudentDTO.setList(list);

        return subjectWithStudentDTO;
    }

    /**
     * 按条件删除数据
     *
     * @param  subjectId 课程id teacherId 老师id studentId学生id
     * @return 删除的行数
     */
    @Override
    public int deleteByStudentId(Integer subjectId, Integer teacherId, Integer studentId) {
        teaStuSubjectDao.deleteByStudentId(subjectId, teacherId, studentId);
        return 1;
    }

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