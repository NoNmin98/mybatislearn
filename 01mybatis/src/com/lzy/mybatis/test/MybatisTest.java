package com.lzy.mybatis.test;

import com.lzy.mybatis.bean.Employee;
import com.lzy.mybatis.dao.EmployeeMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author: lzy
 * @description:
 * @date: 2021-02-18-14:50
 */

/*
*1.根据xml配置文件，创建一个SqlSessionFactory对象
*/
public class MybatisTest {

    @Test
    public void test() throws IOException {
        String resource = "mybatis-conf.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);
//获取sqlSession实例，能直接执行已经映射的sql语句
        SqlSession openSession=sqlSessionFactory.openSession();
        //两个参数：sql唯一标识，sql参数,
        //这里我们推荐使用namespace+id的方法，防止其他地方的id重复
        Employee employee = openSession.selectOne("com.lzy.mybatis.EmployeeMapper.selectEmp", 1);
        System.out.println(employee.toString());
        //关闭session,推荐使用try catch
        openSession.close();
    }

    @Test
    public void test1() throws IOException {
        //1.获取sqlSessionFactory对象
        String resource = "mybatis-conf.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);
        //2.获取sqlSession对象
        SqlSession openSession = sqlSessionFactory.openSession();
        //3.获取接口的实现类对象
        EmployeeMapper mapper = openSession.getMapper(EmployeeMapper.class);
        Employee empById = mapper.getEmpById(1);
        System.out.println(empById);
        //4.关闭资源
        openSession.close();
    }
    //测试增删改
//    @Test
//    public void test2() throws IOException {
//        //1.获取sqlSessionFactory对象
//        String resource = "mybatis-conf.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory sqlSessionFactory =
//                new SqlSessionFactoryBuilder().build(inputStream);
//        //2.获取sqlSession对象
//        //使用这个openSession不会自动提交我们需要手动提交
//        SqlSession openSession = sqlSessionFactory.openSession();
//
//        try {
//            EmployeeMapper mapper = openSession.getMapper(EmployeeMapper.class);
//            Employee employee = new Employee(null, "lue", "897@qq.com", "1");
//            mapper.addEmp(employee);
//            //需要自动提交
//            openSession.commit();
//        }finally{
//            openSession.close();
//        }
//    }

    @Test
    public void test3() throws IOException {
        String resource = "mybatis-conf.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession openSession = sqlSessionFactory.openSession();
        EmployeeMapper mapper = openSession.getMapper(EmployeeMapper.class);
        Employee empById = mapper.getEmpById(1);
        System.out.println(empById);
        openSession.close();
    }

    @Test
    public void test4() throws IOException {
        String resource = "mybatis-conf.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession openSession = sqlSessionFactory.openSession();
        EmployeeMapper mapper = openSession.getMapper(EmployeeMapper.class);
        Employee empById = mapper.getEmpAndDept(1);
        System.out.println(empById);
        System.out.println(empById.getDept());
        openSession.close();
    }
}
