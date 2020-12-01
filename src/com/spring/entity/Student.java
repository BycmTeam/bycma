package com.spring.entity;

public class Student{
    private Integer id;
    private String stuname;
    private Integer stuage;
    private String stuclass;
    private Integer stunumber;
    private Integer stu_id;

    public Student() {
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public Integer getStuage() {
        return stuage;
    }

    public void setStuage(Integer stuage) {
        this.stuage = stuage;
    }

    public String getStuclass() {
        return stuclass;
    }

    public void setStuclass(String stuclass) {
        this.stuclass = stuclass;
    }

    public Integer getStunumber() {
        return stunumber;
    }

    public void setStunumber(Integer stunumber) {
        this.stunumber = stunumber;
    }

    public Integer getStu_id() {
        return stu_id;
    }

    public void setStu_id(Integer stu_id) {
        this.stu_id = stu_id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", stuname='" + stuname + '\'' +
                ", stuage=" + stuage +
                ", stuclass='" + stuclass + '\'' +
                ", stunumber=" + stunumber +
                ", stu_id=" + stu_id +
                '}';
    }
}
