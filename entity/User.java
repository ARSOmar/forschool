package com.example.demooo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Users")
public class User {
    private String name ;
    private String password ;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id ;

    @Column(unique = true, name = "email", nullable = false)
    private String email ;

    private int Creditcard;

    private String Address;

    private String City;

    private String Country;

    public User(){}
    public User(String name, String password, String email) {
        this.name = name;
        this.password = password;
        this.email = email;
    }

    public User(String name, String password, long id, String email, int creditcard, String address, String city, String country) {
        this.name = name;
        this.password = password;
        this.id = id;
        this.email = email;
        this.Creditcard = creditcard;
        this.Address = address;
        this.City = city;
        this. Country = country;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCreditcard() {
        return Creditcard;
    }

    public void setCreditcard(int creditcard) {
        Creditcard = creditcard;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", Creditcard=" + Creditcard +
                ", Address='" + Address + '\'' +
                ", City='" + City + '\'' +
                ", Country='" + Country + '\'' +
                '}';
    }

}
