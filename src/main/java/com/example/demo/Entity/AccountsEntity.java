package com.example.demo.Entity;

import jakarta.persistence.*;


@Entity
@Table(name = "account")
public class AccountsEntity {

    @Id
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password" )
    private String password;

    @Column(name = "matk")
    private String matk;

    public String get_matk(){
        return matk;
    }
    public void setMatk(String matk) {
        this.matk = matk;
    }

}
