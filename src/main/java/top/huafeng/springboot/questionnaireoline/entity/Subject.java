package top.huafeng.springboot.questionnaireoline.entity;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * 学科(Subject)实体类
 *
 * @author makejava
 * @since 2020-02-24 17:17:49
 */
@Data
@Builder
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

}