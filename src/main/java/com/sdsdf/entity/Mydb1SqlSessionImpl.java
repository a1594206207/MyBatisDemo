package com.sdsdf.entity;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Mydb1SqlSessionImpl {


    private static SqlSessionFactory sqlSessionFactory;
    private static final ThreadLocal<SqlSession> threadLocal=new InheritableThreadLocal<>();

    static {
        try {
            InputStream   is = Resources.getResourceAsStream("MyBatis-conflg.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {

            e.printStackTrace();
        }



    }

    public static SqlSession getSqlSession() {
        SqlSession sqlSession = threadLocal.get();
        if (sqlSession == null) {
            sqlSession = sqlSessionFactory.openSession();
            threadLocal.set(sqlSession);
        }
        return sqlSession;
    }

    public static <T> T getDAO(Class<T> Mapper) {

        SqlSession sqlSession=getSqlSession();
        T t=sqlSession.getMapper(Mapper);

        return t;
    }
    public static void commit(){
        getSqlSession().commit();
        close();
    }
    public static void close(){
        getSqlSession().close();
        threadLocal.remove();
    }
    public static void rollback(){
        getSqlSession().rollback();
        close();
    }

}
