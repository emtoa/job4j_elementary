package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Ivanov Ivan Ivanovich");
        student.setGroup("First");
        student.setAdmission(new Date());

        System.out.println(student.getFio() +" the group is "+ student.getGroup()+" : "+student.getAdmission());
    }
}
