package com.sdsdf.entity;

import java.util.List;
import java.util.Objects;

public class Address2 {
    private Integer address_id;
    private String street;
    private  Integer house_number;
    private List<Employees2> employees2s;

    Address2(){

    }
    public Address2(Integer address_id, String street, Integer house_number, List<Employees2> employees2s) {
        this.address_id = address_id;
        this.street = street;
        this.house_number = house_number;
        this.employees2s = employees2s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address2)) return false;
        Address2 address2 = (Address2) o;
        return Objects.equals(address_id, address2.address_id) &&
                Objects.equals(street, address2.street) &&
                Objects.equals(house_number, address2.house_number) &&
                Objects.equals(employees2s, address2.employees2s);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address_id, street, house_number, employees2s);
    }

    @Override

    public String toString() {
        return "Address2{" +
                "address_id=" + address_id +
                ", street='" + street + '\'' +
                ", house_number=" + house_number +
                ", employees2s=" + employees2s +
                '}';
    }

    public Integer getAddress_id() {
        return address_id;
    }

    public void setAddress_id(Integer address_id) {
        this.address_id = address_id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getHouse_number() {
        return house_number;
    }

    public void setHouse_number(Integer house_number) {
        this.house_number = house_number;
    }

    public List<Employees2> getEmployees2s() {
        return employees2s;
    }

    public void setEmployees2s(List<Employees2> employees2s) {
        this.employees2s = employees2s;
    }
}
