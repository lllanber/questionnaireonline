package top.huafeng.springboot.questionnaireoline.entity;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * 学生做试卷信息表(StuPaper)实体类
 *
 * @author makejava
 * @since 2020-02-24 17:17:49
 */
@Data
@Builder
public class StuPaper implements Serializable {
    private static final long serialVersionUID = -43475569618876700L;
    /**
    * 主键
    */
    private Integer id;
    /**
    * 学生id
    */
    private Integer stuId;
    /**
    * 试卷id
    */
    private Integer paperId;
    /**
    * 当前试卷得分
    */
    private Object stuScore;
    /**
    * 单选答案
    */
    private String singleAnswer;
    /**
    * 单选得分
    */
    private Object singleScore;
    /**
    * 多选答案
    */
    private String multipleAnswer;
    /**
    * 多选得分
    */
    private Object multipleScore;
    /**
    * 判断答案
    */
    private String judementAnswer;
    /**
    * 判断得分
    */
    private Object judementScore;
    /**
    * 简答答案
    */
    private String statementAnswer;
    /**
    * 简答得分
    */
    private Object statementScore;
    /**
    * 试卷总分
    */
    private Object totalScore;
    /**
    * 多长时间内答完题
    */
    private Long limitTime;
    /**
    * 开始答卷时间
    */
    private Long gmtStart;
    /**
    * 完成答卷时间
    */
    private Long gmtFinish;


}