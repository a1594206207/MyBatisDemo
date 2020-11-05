package com;

import com.sdsdf.DAO.userDAO;
import com.sdsdf.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class text01MyBatis {
    public static void main(String[] args) throws Exception{


        //加载配置文件
       InputStream is = Resources.getResourceAsStream("MyBatis-conflg.xml");
//       int coun=0;
//       byte[] b=new byte[1024];
//       while((coun=is.read(b))!=-1){
//           System.out.println(new String(b,0,coun));
//       }
       //构建sqlsessionFactory

        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
        //通过sqlsessionFactory创建sqlsession
        SqlSession sqlSession=sqlSessionFactory.openSession();
        //通过sqlsession获得DAO实现类对象
        userDAO DAO=sqlSession.getMapper(userDAO.class);
        //测试
        User user1=DAO.selectOne("0000111");
        System.out.println(user1);






    }
}
