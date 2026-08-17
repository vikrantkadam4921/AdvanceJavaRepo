package com.vikrant.Utility;

import java.util.ArrayList;

import com.vikrant.Controller.TeacherController;
import com.vikrant.Entity.Teacher;

public class Main {

    public static void main(String[] args) {

        TeacherController tc = new TeacherController();

        ArrayList<Teacher> t = new ArrayList<>();
        t.add(new Teacher(1, "Rahul", "IT", "Mumbai", 28));
        t.add(new Teacher(2, "Sneha", "Computer", "Pune", 32));
        t.add(new Teacher(3, "Amit", "Science", "Nashik", 35));
        t.add(new Teacher(4, "Pooja", "Maths", "Kolhapur", 29));
        t.add(new Teacher(5, "Rohit", "IT", "Sangli", 31));
        t.add(new Teacher(6, "Neha", "English", "Satara", 27));
        t.add(new Teacher(7, "Akash", "Physics", "Mumbai", 34));
        t.add(new Teacher(8, "Priya", "Chemistry", "Thane", 30));
        t.add(new Teacher(9, "Sagar", "Computer", "Solapur", 36));
        t.add(new Teacher(10, "Kiran", "Maths", "Nagpur", 33));

        // String msg = tc.saveall(t);
        // System.out.println(msg);

        // ========================================================================================

        // String msg = tc.saveone(new Teacher(11, "Raviraj", "CyberSecurity", "Pune",
        // 22));
        // System.out.println(msg);

        // =======================================================================================

        // tc.getall().stream().filter(i-> i.getAge()>25).map(i->
        // i.getId()).forEach(i->System.out.println(i));

        // ========================================================================================

        // Teacher tea= tc.getbyid(1);

        // // System.out.println(tea.getId());
        // System.out.println(tea.getName());
        // System.out.println(tea.getDept());
        // System.out.println(tea.getAddress());
        // System.out.println(tea.getAge());

        // ========================================================================================

        // Teacher tr = new Teacher();
        // tr.setName("Kirti");
        // tr.setDept("Economics");
        // tr.setAddress("Latur");
        // tr.setAge(27);

        // String m = tc.updatebyid(10, tr);

        // System.out.println(m);


        // ============================================================================================

        // String msg = tc.deletebyid(11);
        // System.out.println(msg);
        
    }
}
