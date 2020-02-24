package top.huafeng.springboot.questionnaireoline.entity;

import java.io.Serializable;

/**
 * 学生表(Student)实体类
 *
 * @author makejava
 * @since 2020-02-24 17:17:49
 */
public class Student implements Serializable {
    private static final long serialVersionUID = 233890405752796223L;
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
    * 班级
    */
    private String class;
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


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getClass() {
        return class;
    }

    public void setClass(String class) {
        this.class = class;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getVeriCode() {
        return veriCode;
    }

    public void setVeriCode(String veriCode) {
        this.veriCode = veriCode;
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