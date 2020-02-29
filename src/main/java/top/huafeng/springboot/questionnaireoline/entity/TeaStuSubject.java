package top.huafeng.springboot.questionnaireoline.entity;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * 老师-学生-学科 关系表(TeaStuSubject)实体类
 *
 * @author makejava
 * @since 2020-02-24 17:17:48
 */
@Data
@Builder
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

}