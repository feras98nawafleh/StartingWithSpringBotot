package com.example.StartingWithSpringBoot.student;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(name = "student_sequence",
                    sequenceName = "student_sequence",
                    allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
                    generator = "student_sequence")
    private long id;
    private String Name;
    private String Email;
    private int Age;
    private LocalDate DOB;

    public Student() {
    }

    public Student(long ID, String name, String email, int age, LocalDate DOB) {
        this.id = ID;
        Name = name;
        Email = email;
        Age = age;
        this.DOB = DOB;
    }

    public Student(String name, String email, int age, LocalDate DOB) {
        Name = name;
        Email = email;
        Age = age;
        this.DOB = DOB;
    }

    public long getID() {
        return id;
    }

    public void setID(long ID) {
        this.id = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + id +
                ", Name='" + Name + '\'' +
                ", Email='" + Email + '\'' +
                ", Age=" + Age +
                ", DOB=" + DOB +
                '}';
    }
}
