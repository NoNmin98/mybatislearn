package com.lzy.mybatis.dao;

import com.lzy.mybatis.bean.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: lzy
 * @description:
 * @date: 2021-02-18-16:36
 */
@Component
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public List<Employee> getEmps();

}
