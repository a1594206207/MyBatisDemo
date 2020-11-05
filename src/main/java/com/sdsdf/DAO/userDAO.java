package com.sdsdf.DAO;

import com.sdsdf.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface userDAO {

    public User selectOne(String id);
    public List<User> selecltFuzzy(@Param("name") String name);
    public Integer insert(User user);
    public Integer update(User user);
    public Integer delete(String number);
}
