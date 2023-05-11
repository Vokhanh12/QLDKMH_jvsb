package com.example.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "dsdaymonhoc")
public class CourseTeachEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)// add xếp theo thứ tự
    @Column(name = "id")
    private Long inputID; // add this line

    @Column(name = "maMH")
    private String maMH;

    @Column(name ="tenMH")
    private String subject;

    @Column(name = "magv")
    private String maGV;

    @Column(name="TC")
    private int tc;

    //Getter and setter

    public Long getInputID() {
        return inputID;
    }

    public String getMaMH() {
        return maMH;
    }

    public String getSubject() {
        return subject;
    }

    public String getMaGV() {
        return maGV;
    }

    public int getTc() {
        return tc;
    }

    public void setInputID(Long inputID) {
        this.inputID = inputID;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public void setTc(int tc) {
        this.tc = tc;
    }
}
