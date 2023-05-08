package com.example.demo.Model;

public class Student {

    public int ID;
    public String MaSV;
    public String TenSV;

    public Student(int ID, String maSV, String tenSV) {
        this.ID = ID;
        this.MaSV = maSV;
        this.TenSV = tenSV;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setMaSV(String maSV) {
        MaSV = maSV;
    }

    public void setTenSV(String tenSV) {
        TenSV = tenSV;
    }

    public int getID() {
        return ID;
    }

    public String getMaSV() {
        return MaSV;
    }

    public String getTenSV() {
        return TenSV;
    }
}
