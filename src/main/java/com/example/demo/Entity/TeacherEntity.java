package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "dsgv")
public class TeacherEntity {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)// add xếp theo thứ tự
    @Column(name = "id")
    private Long inputID; // add this line

    @Column(name = "magv")
    private String inputMaGV;

    @Column(name = "tensv")
    private String inputTenGV;

    public void setInputID(Long inputID) {
        this.inputID = inputID;
    }

    public void setInputMaGV(String inputMaGV) {
        this.inputMaGV = inputMaGV;
    }

    public void setInputTenGV(String inputTenGV) {
        this.inputTenGV = inputTenGV;
    }

    public Long getInputID() {
        return inputID;
    }

    public String getInputMaGV() {
        return inputMaGV;
    }

    public String getInputTenGV() {
        return inputTenGV;
    }
}
