package top.huafeng.springboot.questionnaireoline.entity;

import java.io.Serializable;

/**
 * 试卷表(Paper)实体类
 *
 * @author makejava
 * @since 2020-02-24 17:17:48
 */
public class Paper implements Serializable {
    private static final long serialVersionUID = -89820690139063336L;
    /**
    * 主键
    */
    private Integer id;
    /**
    * 试卷名
    */
    private String paperName;
    /**
    * 创建人主键
    */
    private Integer paperCreator;
    /**
    * 试卷总分
    */
    private Object paperScore;
    
    private Integer subjectId;
    /**
    * 限制答题时长
    */
    private Long limitTime;
    /**
    * 创建时间
    */
    private Long gmtCreate;
    /**
    * 修改时间
    */
    private Long gmtModified;
    /**
    * -1删除,0暂存未发布,1发布
    */
    private int status;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPaperName() {
        return paperName;
    }

    public void setPaperName(String paperName) {
        this.paperName = paperName;
    }

    public Integer getPaperCreator() {
        return paperCreator;
    }

    public void setPaperCreator(Integer paperCreator) {
        this.paperCreator = paperCreator;
    }

    public Object getPaperScore() {
        return paperScore;
    }

    public void setPaperScore(Object paperScore) {
        this.paperScore = paperScore;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Long getLimitTime() {
        return limitTime;
    }

    public void setLimitTime(Long limitTime) {
        this.limitTime = limitTime;
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}