package com.sdsdf.entity;

import java.util.Objects;

public class Employees {
    private int id;
    private String name;
    private long phone;
    private String sex;



    public Employees(int id, String name, long phone, String sex, Address address) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.sex = sex;

    }
    Employees(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employees)) return false;
        Employees employees = (Employees) o;
        return id == employees.id &&
                phone == employees.phone &&
                Objects.equals(name, employees.name) &&
                Objects.equals(sex, employees.sex) ;

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, phone, sex);
    }

    @Override
    public String toString() {
        return "Employees{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                ", sex='" + sex + '\'' +

                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }



}
