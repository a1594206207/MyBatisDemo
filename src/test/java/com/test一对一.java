package com;

import com.sdsdf.DAO.AddressDAO;
import com.sdsdf.DAO.EmployeesDAO;
import com.sdsdf.entity.Address;
import com.sdsdf.entity.Employees;
import com.sdsdf.entity.Mydb1SqlSessionImpl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class test一对一 {
    public static void main(String[] args) throws Exception{
//        InputStream is=Resources.getResourceAsStream("MyBatis-conflg.xml");
//        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
//        SqlSession sqlSession=sqlSessionFactory.openSession();
//        EmployeesDAO dao=sqlSession.getMapper(EmployeesDAO.class);
//        AddressDAO dao1=sqlSession.getMapper(AddressDAO.class);
        EmployeesDAO dao= Mydb1SqlSessionImpl.getDAO(EmployeesDAO.class);
        AddressDAO dao1=Mydb1SqlSessionImpl.getDAO(AddressDAO.class);


        Employees employees=dao.selectAddress(1);
        System.out.println(employees.toString());
        Address address=dao1.selecteEmployees(1);
        System.out.println(address.toString());



    }
}
