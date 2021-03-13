package com.wdc.model;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
    private static final long serialVersionUID = -4676966771024362154L;

    private Integer id;
    private String username;
    private String date;
    private Integer price;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", date='" + date + '\'' +
                ", price=" + price +
                '}';
    }

    public User(Integer id, String username, String date, Integer price) {

        this.id = id;
        this.username = username;
        this.date = date;
        this.price = price;
    }

    public User() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
