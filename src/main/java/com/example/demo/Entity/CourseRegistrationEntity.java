package com.example.demo.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "dsdangkymonhoc")
public class CourseRegistrationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)// add xếp theo thứ tự
    @Column(name = "id")
    private Long inputID; // add this line

    @Column(name = "maMH")
    private String maMH;

    @Column(name ="tenMH")
    private String subject;

    @Column(name = "masv")
    private String maSV;

    @Column(name="TC")
    private int tc;

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getMaSV() {
        return maSV;
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



    public Long getInputID() {
        return inputID;
    }

    public String getMaMH() {
        return maMH;
    }

    public String getSubject() {
        return subject;
    }

    public void setTc(int tc) {
        this.tc = tc;
    }

    public int getTc() {
        return tc;
    }
}
