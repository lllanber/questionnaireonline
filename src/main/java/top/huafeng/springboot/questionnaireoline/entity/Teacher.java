package top.huafeng.springboot.questionnaireoline.entity;

import java.io.Serializable;

/**
 * 老师表(Teacher)实体类
 *
 * @author makejava
 * @since 2020-02-24 17:17:49
 */
public class Teacher implements Serializable {
    private static final long serialVersionUID = 839282557867242169L;
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

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName;
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

    public String getVeriCode() {
        return veriCode;
    }

    public void setVeriCode(String veriCode) {
        this.veriCode = veriCode;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
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