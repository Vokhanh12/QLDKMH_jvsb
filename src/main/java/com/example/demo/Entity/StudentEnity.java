package com.example.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "dssv")
public class StudentEnity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id; // add this line

    @Column(name = "masv")
    private String masv;

    @Column(name = "tensv")
    private String tensv;

    // getters and setters
    public String getTensv(){
        return  tensv;
    }

    public void setTensv(String tensv) {
        this.tensv = tensv;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
}
