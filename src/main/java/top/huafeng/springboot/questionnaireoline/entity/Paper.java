package top.huafeng.springboot.questionnaireoline.entity;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * 试卷表(Paper)实体类
 *
 * @author makejava
 * @since 2020-02-24 17:17:48
 */
@Data
@Builder
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


}