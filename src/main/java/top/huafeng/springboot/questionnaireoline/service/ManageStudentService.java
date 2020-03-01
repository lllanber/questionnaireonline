package top.huafeng.springboot.questionnaireoline.service;

import top.huafeng.springboot.questionnaireoline.dto.SubjectWithStudentDTO;
import top.huafeng.springboot.questionnaireoline.entity.Student;
import top.huafeng.springboot.questionnaireoline.entity.TeaStuSubject;
import java.util.List;

/**
 * 老师-学生-学科 关系表(TeaStuSubject)表服务接口
 *
 * @author makejava
 * @since 2020-02-24 17:17:48
 */
public interface ManageStudentService {

    /**
     *  按条件查询学生
     *
     * @param  subjectId 课程id 老师id（Session获取）
     * @return 课程信息+该课程的所有学生信息
     */
    SubjectWithStudentDTO findByCourseId(Integer subjectId, Integer teacherId);

    /**
     * 按条件删除数据
     *
     * @param  courseId 课程id teacherId 老师id studentId学生id
     * @return 删除的行数
     */
    int deleteByStudentId(Integer courseId, Integer teacherId, Integer studentId);

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TeaStuSubject queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TeaStuSubject> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param teaStuSubject 实例对象
     * @return 实例对象
     */
    TeaStuSubject insert(TeaStuSubject teaStuSubject);

    /**
     * 修改数据
     *
     * @param teaStuSubject 实例对象
     * @return 实例对象
     */
    TeaStuSubject update(TeaStuSubject teaStuSubject);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}