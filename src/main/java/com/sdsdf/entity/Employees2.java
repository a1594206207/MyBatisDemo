package com.sdsdf.entity;

import java.util.List;
import java.util.Objects;

public class Employees2 {
    private Integer id;
    private String name;
    private long phone;
    private String sex;
    private List<Address2> address2s;


    Employees2() {

    }
    @Override


    public String toString() {
        return "Employees2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                ", sex='" + sex + '\'' +
                ", address2s=" + address2s +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employees2)) return false;
        Employees2 that = (Employees2) o;
        return phone == that.phone &&
                Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(sex, that.sex) &&
                Objects.equals(address2s, that.address2s);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, phone, sex, address2s);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public List<Address2> getAddress2s() {
        return address2s;
    }

    public void setAddress2s(List<Address2> address2s) {
        this.address2s = address2s;
    }

    public Employees2(Integer id, String name, long phone, String sex, List<Address2> address2s) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.sex = sex;
        this.address2s = address2s;
    }
}
