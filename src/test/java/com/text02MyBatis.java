package com;

import com.sdsdf.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;

import java.io.InputStream;
import java.util.List;

public class text02MyBatis {
    public static void main(String[] args) throws Exception{
        //加载Mybatis
        InputStream is=Resources.getResourceAsStream("MyBatis-conflg.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        com.sdsdf.DAO.userDAO dao=sqlSession.getMapper(com.sdsdf.DAO.userDAO.class);

        //测试
        User user1=dao.selectOne("0000111");
        System.out.println(user1);
//增加
//        User user2=new User("2222221","123456","李三",
//                "广西","nv",1231234123);
//
//        Integer resoult1=dao.insert(user2);
        //模糊查询



//        //删除
//        Integer result2=dao.delete("2222221");

        //修改
        Integer result3=dao.update(new User("2222221","123123","王三三",
                "广东","女",1231231));


        sqlSession.commit();
        List<User> users=dao.selecltFuzzy("三");
        for (User user3:users) {
            System.out.println(user3);
        }
       System.out.println(result3);

    }
}
