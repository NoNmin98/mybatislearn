package com.lzy.mybatis.Service;

import com.lzy.mybatis.bean.Employee;
import com.lzy.mybatis.dao.EmployeeMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: lzy
 * @description:
 * @date: 2021-02-23-9:46
 */
@Service
public class EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

     public List<Employee> getEmps(){
        return employeeMapper.getEmps();
     }
}
