package top.huafeng.springboot.questionnaireoline.entity;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * 老师表(Teacher)实体类
 *
 * @author makejava
 * @since 2020-02-26 10:40:21
 */
@Data
@Builder
public class Teacher implements Serializable {
    private static final long serialVersionUID = 625458762560994269L;
    /**
    * 主键
    */
    private Integer id;
    /**
    * 工号
    */
    private Integer accountId;
    /**
    * 老师工号
    */
    private String teacherId;
    /**
    * 用户名
    */
    private String teaName;
    /**
    * M-男，W-女
    */
    private String teaSex;
    /**
    * 邮箱
    */
    private String email;
    /**
    * 电话
    */
    private String mobile;
    /**
    * 登录秘钥
    */
    private String token;
    /**
    * 验证码
    */
    private String veriCode;
    /**
    * 密码
    */
    private String pwd;
    /**
    * 创建时间
    */
    private Long gmtCreate;
    /**
    * 修改时间
    */
    private Long gmtModified;
    /**
    * 账号状态0注销，1登录，2删除
    */
    private int status;


}