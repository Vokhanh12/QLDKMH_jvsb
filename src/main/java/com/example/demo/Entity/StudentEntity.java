package com.example.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "dssv")
public class StudentEntity {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)// add xếp theo thứ tự
    @Column(name = "id")
    private Long inputID; // add this line

    @Column(name = "masv")
    private String inputMaSV;

    @Column(name = "tensv")
    private String inputTenSV;

    // getters and setters


    public Long getInputID() {
        return inputID;
    }

    public String getInputMaSV() {
        return inputMaSV;
    }

    public String getInputTenSV() {
        return inputTenSV;
    }

    public void setInputID(Long inputID) {
        this.inputID = inputID;
    }

    public void setInputMaSV(String inputMaSV) {
        this.inputMaSV = inputMaSV;
    }

    public void setInputTenSV(String inputTenSV) {
        this.inputTenSV = inputTenSV;
    }
}
