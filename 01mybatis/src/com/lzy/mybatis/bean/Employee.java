package com.lzy.mybatis.bean;

import org.apache.ibatis.type.Alias;

/**
 * @author: lzy
 * @description: 创建员工类
 * @date: 2021-02-18-14:32
 */
//这里的别名可以简化xml文件中的resultType
public class Employee {
    private Integer id;
    private String lastName;
    private String email;
    private String gender;
    private Department dept;

    public Employee() {
    }

    public Employee(Integer id, String lastName, String email, String gender, Department dept) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", dept=" + dept +
                '}';
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
