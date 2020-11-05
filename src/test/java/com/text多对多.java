package com;

import com.sdsdf.DAO.AddressDAO2;
import com.sdsdf.entity.Address2;
import com.sdsdf.entity.Mydb1SqlSessionImpl;

public class text多对多 {
    public static void main(String[] args) {
        AddressDAO2 dao2= Mydb1SqlSessionImpl.getDAO(AddressDAO2.class);
        Address2 address2=dao2.selectEmployees(1);
        System.out.println(address2.toString());

    }
}
