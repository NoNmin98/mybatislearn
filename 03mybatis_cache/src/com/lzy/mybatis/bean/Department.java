package com.lzy.mybatis.bean;

/**
 * @author: lzy
 * @description:
 * @date: 2021-02-21-19:55
 */
public class Department {
    private Integer id;
    private String deptName;

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", deptName='" + deptName + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
