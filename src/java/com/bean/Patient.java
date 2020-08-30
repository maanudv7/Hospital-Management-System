/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean;

//import java.sql.Date;

/**
 *
 * @author Himanshu Sharma
 */
public class Patient {
  String name;
    int age;
    String dateofadmission;
    String bedtype;
    String addr;
    String city;
    String state;
    int ssnid;

    public Patient() {
    }

    public Patient(String name, int age, String dateofadmission, String bedtype, String addr, String city, String state, int ssnid) {
        this.name = name;
        this.age = age;
        this.dateofadmission = dateofadmission;
        this.bedtype = bedtype;
        this.addr = addr;
        this.city = city;
        this.state = state;
        this.ssnid = ssnid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDateofadmission() {
        return dateofadmission;
    }

    public void setDateofadmission(String dateofadmission) {
        this.dateofadmission = dateofadmission;
    }

    public String getBedtype() {
        return bedtype;
    }

    public void setBedtype(String bedtype) {
        this.bedtype = bedtype;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getSsnid() {
        return ssnid;
    }

    public void setSsnid(int ssnid) {
        this.ssnid = ssnid;
    }
    
    
    
    
}
