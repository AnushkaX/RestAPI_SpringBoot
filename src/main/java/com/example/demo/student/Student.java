package com.example.demo.student;

import javax.persistence.*;

@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )

    private Long id;
    private String lastName;
    private String initials;
    private Character gender;
    private String address;
    private String mobile;

    public Student() {
    }

    public Student(Long id, String lastName, String initials, Character gender, String address, String mobile) {
        this.id = id;
        this.lastName = lastName;
        this.initials = initials;
        this.gender = gender;
        this.address = address;
        this.mobile = mobile;
    }

    public Student(String lastName, String initials, Character gender, String address, String mobile) {
        this.lastName = lastName;
        this.initials = initials;
        this.gender = gender;
        this.address = address;
        this.mobile = mobile;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", initials='" + initials + '\'' +
                ", gender=" + gender +
                ", address='" + address + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
