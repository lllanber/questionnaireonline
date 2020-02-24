package top.huafeng.springboot.questionnaireoline.entity;

import java.io.Serializable;

/**
 * 学生做试卷信息表(StuPaper)实体类
 *
 * @author makejava
 * @since 2020-02-24 17:17:49
 */
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


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public Integer getPaperId() {
        return paperId;
    }

    public void setPaperId(Integer paperId) {
        this.paperId = paperId;
    }

    public Object getStuScore() {
        return stuScore;
    }

    public void setStuScore(Object stuScore) {
        this.stuScore = stuScore;
    }

    public String getSingleAnswer() {
        return singleAnswer;
    }

    public void setSingleAnswer(String singleAnswer) {
        this.singleAnswer = singleAnswer;
    }

    public Object getSingleScore() {
        return singleScore;
    }

    public void setSingleScore(Object singleScore) {
        this.singleScore = singleScore;
    }

    public String getMultipleAnswer() {
        return multipleAnswer;
    }

    public void setMultipleAnswer(String multipleAnswer) {
        this.multipleAnswer = multipleAnswer;
    }

    public Object getMultipleScore() {
        return multipleScore;
    }

    public void setMultipleScore(Object multipleScore) {
        this.multipleScore = multipleScore;
    }

    public String getJudementAnswer() {
        return judementAnswer;
    }

    public void setJudementAnswer(String judementAnswer) {
        this.judementAnswer = judementAnswer;
    }

    public Object getJudementScore() {
        return judementScore;
    }

    public void setJudementScore(Object judementScore) {
        this.judementScore = judementScore;
    }

    public String getStatementAnswer() {
        return statementAnswer;
    }

    public void setStatementAnswer(String statementAnswer) {
        this.statementAnswer = statementAnswer;
    }

    public Object getStatementScore() {
        return statementScore;
    }

    public void setStatementScore(Object statementScore) {
        this.statementScore = statementScore;
    }

    public Object getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Object totalScore) {
        this.totalScore = totalScore;
    }

    public Long getLimitTime() {
        return limitTime;
    }

    public void setLimitTime(Long limitTime) {
        this.limitTime = limitTime;
    }

    public Long getGmtStart() {
        return gmtStart;
    }

    public void setGmtStart(Long gmtStart) {
        this.gmtStart = gmtStart;
    }

    public Long getGmtFinish() {
        return gmtFinish;
    }

    public void setGmtFinish(Long gmtFinish) {
        this.gmtFinish = gmtFinish;
    }

}