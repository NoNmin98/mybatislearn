package com.lzy.mybatis.test;

import com.lzy.mybatis.bean.Employee;
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
}
