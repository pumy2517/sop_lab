package com.example.demoeurakaaddress;

public class Student {

    private int studentid;

    @Override
    public String toString() {
        return "Student{" +
                "studentid=" + studentid +
                '}';
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }
}
