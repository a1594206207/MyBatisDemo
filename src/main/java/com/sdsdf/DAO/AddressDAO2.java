package com.sdsdf.DAO;

import com.sdsdf.entity.Address2;
import org.apache.ibatis.annotations.Param;

public interface AddressDAO2 {
    public Address2 selectEmployees(@Param("id") int id);
}
