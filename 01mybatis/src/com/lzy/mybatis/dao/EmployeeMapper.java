package com.lzy.mybatis.dao;

import com.lzy.mybatis.bean.Employee;

/**
 * @author: lzy
 * @description:
 * @date: 2021-02-18-16:36
 */
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);
    public Employee getEmpById2(Integer id);
    public void addEmp(Employee employee);
    public void updateEmp(Employee employee);
    public void deleteEmpById(Integer id);
    public Employee getEmpAndDept(Integer id);

}
