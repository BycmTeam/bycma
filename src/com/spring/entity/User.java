package com.spring.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * 实体类对象，私有属性，封装方法，构造函数，序列化，toString
 * 在web项目中核心应用价值，是和非jdk协议机制交互映射
 * 和DB的table字段呼应(mybatis mapper配置)，
 * 和前端ajax json和 form input name呼应的
 * @author Administrator
 * mybatis 持久层-- 持久--呼应的序列化
 * cloumn 字段 usn   MySQL游标
 *
 *<input type="text" name="usn" id="usn" class="" value="" size=""> HTML5 http
 */
public class User implements Serializable{
    private String uname,pwd;  //java jdk
    private int id, uage;

    public User() {
        // com.spring.entity.User.<init>()  反射也是通过空构造执行的。也不是new
    }
    //insert
    public User(String usn,String pwd,int uid,int  uage) {
        // TODO Auto-generated constructor stub
        this.uage=uage;
        this.pwd=pwd;
        this.uname=usn;
        this.id=uid;
    }
    //udpate insert
    public String getUsn() {
        return uname;
    }
    //	http://localhost:8088/MVC_Params/user/list4.action?id=16&uname=方式
    public void setUsn(String usn) {
        this.uname = usn;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getUid() {
        return id;
    }
    //id=16-->  setId()方法，
    public void setUid(int uid) {
        //setter方法呼应的是 第一前端提交的参数封装模式，第二mybatis xml配置的格式
        this.id = uid;
    }

    public int getUage() {
        return uage;
    }

    public void setUage(int uage) {
        this.uage = uage;
    }



}
