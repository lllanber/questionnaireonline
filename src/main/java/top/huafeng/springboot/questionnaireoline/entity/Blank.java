package top.huafeng.springboot.questionnaireoline.entity;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * 填空题表
(Blank)实体类
 *
 * @author makejava
 * @since 2020-02-24 17:17:49
 */
@Data
@Builder
public class Blank implements Serializable {
    private static final long serialVersionUID = 263651324332732194L;
    /**
    * 主键
    */
    private Integer id;
    /**
    * 创建者id
    */
    private Integer creator;
    /**
    * 0仅自己，1所有人可见
    */
    private int authority;
    /**
    * 题述
    */
    private String title;
    /**
    * 答案
    */
    private String answer;
    /**
    * 分析
    */
    private String parse;
    /**
    * 学科id
    */
    private Integer subjectId;
    /**
    * 难度
    */
    private String difficulty;
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