package top.huafeng.springboot.questionnaireoline.entity;

import java.io.Serializable;

/**
 * 老师-学生-学科 关系表(TeaStuSubject)实体类
 *
 * @author makejava
 * @since 2020-02-24 17:17:48
 */
public class TeaStuSubject implements Serializable {
    private static final long serialVersionUID = 300508460801973959L;
    
    private Integer id;
    /**
    * 学科id
    */
    private Integer subjectId;
    /**
    * 老师id
    */
    private Integer teacherId;
    /**
    * 学生id
    */
    private Integer studentId;
    /**
    * 学生状态（正常，重修...）
    */
    private String stuStatus;
    /**
    * 创建时间
    */
    private Long gmtCreate;
    /**
    * 修改时间
    */
    private Long gmtModified;
    /**
    * 是否删除
    */
    private int isDelete;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStuStatus() {
        return stuStatus;
    }

    public void setStuStatus(String stuStatus) {
        this.stuStatus = stuStatus;
    }

    public Long getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Long getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

}