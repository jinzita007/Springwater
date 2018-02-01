package com.zyl.water.dao;

/**
 * Created by woaitianwen on 2018/2/1.
 */
public class User {

    private Long id;                 //用户ID
    private String username;         //用户名
    private String password;         //密码
    private String email;            //用户电子邮箱
    private String mobile;           //用户手机
    private String reg_time;         //注册时间
    private String reg_ip;           //注册IP
    private String last_login_time;  //最后登录时间
    private String last_login_ip;    //最后登录IP
    private String update_time;      //更新时间
    private Boolean status;           //用户状态

    //无参数构造器
    public User() {
        super();
    }
    //有参数构造器
    public User(Long id, String username, String password, String email, String mobile, String reg_time, String reg_ip, String last_login_time, String last_login_ip, String update_time, Boolean status) {
        super();
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.mobile = mobile;
        this.reg_time = reg_time;
        this.reg_ip = reg_ip;
        this.last_login_time = last_login_time;
        this.last_login_ip = last_login_ip;
        this.update_time = update_time;
        this.status = status;
    }

    // setter和getter方法
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getReg_time() {
        return reg_time;
    }

    public void setReg_time(String reg_time) {
        this.reg_time = reg_time;
    }

    public String getReg_ip() {
        return reg_ip;
    }

    public void setReg_ip(String reg_ip) {
        this.reg_ip = reg_ip;
    }

    public String getLast_login_time() {
        return last_login_time;
    }

    public void setLast_login_time(String last_login_time) {
        this.last_login_time = last_login_time;
    }

    public String getLast_login_ip() {
        return last_login_ip;
    }

    public void setLast_login_ip(String last_login_ip) {
        this.last_login_ip = last_login_ip;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", reg_time='" + reg_time + '\'' +
                ", reg_ip='" + reg_ip + '\'' +
                ", last_login_time='" + last_login_time + '\'' +
                ", last_login_ip='" + last_login_ip + '\'' +
                ", update_time='" + update_time + '\'' +
                ", status=" + status +
                '}';
    }
}

