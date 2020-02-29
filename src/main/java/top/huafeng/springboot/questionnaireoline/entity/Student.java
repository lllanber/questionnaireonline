package top.huafeng.springboot.questionnaireoline.entity;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * 学生表(Student)实体类
 *
 * @author makejava
 * @since 2020-02-26 10:40:21
 */
@Data
@Builder
public class Student implements Serializable {
    private static final long serialVersionUID = 924623656362567328L;
    /**
    * 主键
    */
    private Integer id;
    /**
    * 学号
    */
    private Integer accountId;
    /**
    * 学号
    */
    private String studentId;
    /**
    * 用户名
    */
    private String stuName;
    /**
    * M-男，W-女
    */
    private String stuSex;
    /**
    * 班级
    */
    private String classes;
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
    * 密码
    */
    private String pwd;
    /**
    * 验证码
    */
    private String veriCode;
    /**
    * 创建时间
    */
    private Long gmtCreate;
    /**
    * 修改时间
    */
    private Long gmtModified;
    /**
    * 0注销，1登录，2删除
    */
    private int status;


}