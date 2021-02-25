package com.lzy.mybatis.Controller;

import com.lzy.mybatis.Service.EmployeeService;
import com.lzy.mybatis.bean.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * @author: lzy
 * @description:
 * @date: 2021-02-23-9:43
 */
@Controller
public class controller {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/emps")
    public String emps(Map<String,Object> map){
        List<Employee> emps=employeeService.getEmps();
        map.put("allEmps",emps);
//        这里只的是返回到哪一个页面,并且这里已经通过了spring-servlet.xml视图解析器完成了解析
        return "list";
    }

}
