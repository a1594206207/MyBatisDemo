package com.sdsdf.entity;

import java.util.Objects;

public class Address {

    public Address(int address_id, String street, int house_number, Employees employees) {
        this.address_id = address_id;
        this.street = street;
        this.house_number = house_number;
        this.employees = employees;
    }

    private  int address_id;
    private String street;
    private int house_number;
    private Employees employees;


    Address(){
    }

    @Override
    public String toString() {
        return "Address{" +
                "address_id=" + address_id +
                ", street='" + street + '\'' +
                ", house_number=" + house_number +
                ", employees=" + employees +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        Address address = (Address) o;
        return address_id == address.address_id &&
                house_number == address.house_number &&
                Objects.equals(street, address.street) &&
                Objects.equals(employees, address.employees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address_id, street, house_number, employees);
    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse_number() {
        return house_number;
    }

    public void setHouse_number(int house_number) {
        this.house_number = house_number;
    }

    public Employees getEmployees() {
        return employees;
    }

    public void setEmployees(Employees employees) {
        this.employees = employees;
    }
}
