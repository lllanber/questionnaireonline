package top.huafeng.springboot.questionnaireoline.entity;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * 试卷-试题关系表(PaperQuestion)实体类
 *
 * @author makejava
 * @since 2020-02-24 17:17:49
 */
@Data
@Builder
public class PaperQuestion implements Serializable {
    private static final long serialVersionUID = 702358284545766649L;
    /**
    * 主键
    */
    private Integer id;
    /**
    * 试卷id
    */
    private Integer paperId;
    /**
    * 1单选，2判断，3多选，4简答
    */
    private int questionType;
    /**
    * 当前试卷的第几题
    */
    private Integer questionNo;
    /**
    * 问题id
    */
    private Integer questionId;
    /**
    * 问题分数
    */
    private Object questionScore;
    /**
    * 做对人数
    */
    private Integer accCount;
    /**
    * 做错人数
    */
    private Integer errCount;
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