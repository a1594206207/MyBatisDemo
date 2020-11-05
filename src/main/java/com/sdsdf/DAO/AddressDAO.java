package com.sdsdf.DAO;

import com.sdsdf.entity.Address;
import org.apache.ibatis.annotations.Param;

public interface AddressDAO {

    public Address selecteEmployees(@Param("id") int id);
}
