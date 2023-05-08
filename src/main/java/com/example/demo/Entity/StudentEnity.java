package com.example.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "dssv")
public class StudentEnity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long inputID; // add this line

    @Column(name = "masv")
    private String inputMaGV;

    @Column(name = "tensv")
    private String inputTenGV;

    // getters and setters

    public Long getInputID() {
        return inputID;
    }

    public String getInputMaGV() {
        return inputMaGV;
    }

    public String getInputTenGV() {
        return inputTenGV;
    }

    public void setInputID(Long inputID) {
        this.inputID = inputID;
    }

    public void setInputMaGV(String inputMaGV) {
        this.inputMaGV = inputMaGV;
    }

    public void setInputTenGV(String inputTenGV) {
        this.inputTenGV = inputTenGV;
    }
}
