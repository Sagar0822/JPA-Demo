package com.platinum.jpademo1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_info")  //change table name
public class User {
    @Id   //This is for primary key
    @Column(name="id")
    int admnNo;
    String name;
    int age;
    String mobileNo;

    public User(int admnNo, String name, int age, String mobileNo) {
        this.admnNo = admnNo;
        this.name = name;
        this.age = age;
        this.mobileNo = mobileNo;
    }

    public int getAdmnNo() {
        return admnNo;
    }

    public void setAdmnNo(int admnNo) {
        this.admnNo = admnNo;
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

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
}
