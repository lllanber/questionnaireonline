package top.huafeng.springboot.questionnaireoline.entity;

import java.io.Serializable;

/**
 * 试卷-试题关系表(PaperQuestion)实体类
 *
 * @author makejava
 * @since 2020-02-24 17:17:49
 */
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


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPaperId() {
        return paperId;
    }

    public void setPaperId(Integer paperId) {
        this.paperId = paperId;
    }

    public int getQuestionType() {
        return questionType;
    }

    public void setQuestionType(int questionType) {
        this.questionType = questionType;
    }

    public Integer getQuestionNo() {
        return questionNo;
    }

    public void setQuestionNo(Integer questionNo) {
        this.questionNo = questionNo;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Object getQuestionScore() {
        return questionScore;
    }

    public void setQuestionScore(Object questionScore) {
        this.questionScore = questionScore;
    }

    public Integer getAccCount() {
        return accCount;
    }

    public void setAccCount(Integer accCount) {
        this.accCount = accCount;
    }

    public Integer getErrCount() {
        return errCount;
    }

    public void setErrCount(Integer errCount) {
        this.errCount = errCount;
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