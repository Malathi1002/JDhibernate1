package com.kgisl.springmvc.entity;

import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
@Table(name = "data")

public class Content {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "company_name")

    private String company_name;

    @Column(name = "title")
    private String title;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "mobile_no")
    private int mobile_no;

    @Column(name = "landline_no")
    private int landline_no;

    @Column(name = "data")
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Content(){
        
    }
    
    public Content(String company_name, String title, String firstname, String lastname, int mobile_no,
            int landline_no) {
        this.company_name = company_name;
        this.title = title;
        this.firstname = firstname;
        this.lastname = lastname;
        this.mobile_no = mobile_no;
        this.landline_no = landline_no;
    }
    public String getCompany_name() {
        return company_name;
    }
    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public int getMobile_no() {
        return mobile_no;
    }
    public void setMobile_no(int mobile_no) {
        this.mobile_no = mobile_no;
    }
    public int getLandline_no() {
        return landline_no;
    }
    public void setLandline_no(int landline_no) {
        this.landline_no = landline_no;
    }
   
    
}
