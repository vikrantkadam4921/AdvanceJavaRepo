package com.vikrant.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Teacher {

    @Id
    private int id;

    private String name;

    private String dept;

    private String address;

    private int age;

    public Teacher()
    {
        super();
    }

    public Teacher(int id, String name, String dept, String address, int age) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.address = address;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Teacher [id=" + id + ", name=" + name + ", dept=" + dept + ", address=" + address + ", age=" + age
                + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
                + ", getId()=" + getId() + ", getName()=" + getName() + ", getDept()=" + getDept() + ", getAddress()="
                + getAddress() + ", getAge()=" + getAge() + "]";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
}
