package com.spring.entity;

public class Home {
    private Integer home_id;
    private String home_name;
    private String home_address;
    private Student student;

    public Home() {
    }

    public Integer getHome_id() {
        return home_id;
    }

    public void setHome_id(Integer home_id) {
        this.home_id = home_id;
    }

    public String getHome_name() {
        return home_name;
    }

    public void setHome_name(String home_name) {
        this.home_name = home_name;
    }

    public String getHome_address() {
        return home_address;
    }

    public void setHome_address(String home_address) {
        this.home_address = home_address;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Home{" +
                "home_id=" + home_id +
                ", home_name='" + home_name + '\'' +
                ", home_address='" + home_address + '\'' +
                ", student=" + student +
                '}';
    }

}
