package com.sdsdf.DAO;

import com.sdsdf.entity.Employees;
import org.apache.ibatis.annotations.Param;

public interface EmployeesDAO {

    public Employees selectAddress(@Param("id") int id);
}
