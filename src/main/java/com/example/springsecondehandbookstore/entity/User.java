package com.example.springsecondehandbookstore.entity;

public class User {
    private Integer id;
    private String username;
    private String password;
    private Integer grade;
    private String college;
    private String major;
    private String phone;
    private String school;
    private String address;

    public User(Integer id, String username, String password, Integer grade, String college, String major, String phone, String school, String address) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.grade = grade;
        this.college = college;
        this.major = major;
        this.phone = phone;
        this.school = school;
        this.address = address;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
