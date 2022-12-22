package com.kgisl.springmvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "addetails")


public class Adlist {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    public int id;

    @Column(name = "a_name")

    public String a_name;
    @Column(name = "phoneNo")

    public int phoneNo;

    @Column(name = "flatNo")
    public int flatNo;

    @Column(name = "street")
    public String street;

    @Column(name = "city")
    public String city;

    @Column(name = "state")
    public String state;

    @Column(name = "country")
    public String country;

    @Column(name = "pincode")
    public double pincode;

    @Column(name = "category")
    public String category;

    @Column(name = "sub_category")
    public String sub_category;

    @Column(name = "open_time")
    public String open_time;

    @Column(name = "close_time")
    public String close_time;

    @Column(name = "ratings")
    public int ratings;

    public Adlist(){
        
    }


    public Adlist(int id, String a_name, int phoneNo, int flatNo, String street, String city, String state,
            String country, double pincode, String category, String sub_category, String open_time, String close_time,
            int ratings) {
        this.id = id;
        this.a_name = a_name;
        this.phoneNo = phoneNo;
        this.flatNo = flatNo;
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
        this.category = category;
        this.sub_category = sub_category;
        this.open_time = open_time;
        this.close_time = close_time;
        this.ratings = ratings;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getA_name() {
        return a_name;
    }
    public void setA_name(String a_name) {
        this.a_name = a_name;
    }
    public int getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }
    public int getFlatNo() {
        return flatNo;
    }
    public void setFlatNo(int flatNo) {
        this.flatNo = flatNo;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
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
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public double getPincode() {
        return pincode;
    }
    public void setPincode(double pincode) {
        this.pincode = pincode;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getSub_category() {
        return sub_category;
    }
    public void setSub_category(String sub_category) {
        this.sub_category = sub_category;
    }
    public String getOpen_time() {
        return open_time;
    }
    public void setOpen_time(String open_time) {
        this.open_time = open_time;
    }
    public String getClose_time() {
        return close_time;
    }
    public void setClose_time(String close_time) {
        this.close_time = close_time;
    }
    public int getRatings() {
        return ratings;
    }
    public void setRatings(int ratings) {
        this.ratings = ratings;
    }


}
