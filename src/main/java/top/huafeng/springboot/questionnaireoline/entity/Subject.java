package top.huafeng.springboot.questionnaireoline.entity;

import java.io.Serializable;

/**
 * 学科(Subject)实体类
 *
 * @author makejava
 * @since 2020-02-24 17:17:49
 */
public class Subject implements Serializable {
    private static final long serialVersionUID = -71190014697974573L;
    /**
    * 学科id
    */
    private Integer id;
    /**
    * 学科名
    */
    private String subjectName;
    /**
    * 学科描述
    */
    private String description;
    /**
    * 创建时间
    */
    private Long gmtCreate;
    /**
    * 修改时间
    */
    private Long gmtModified;
    /**
    * 是否有效
    */
    private int isDelete;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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