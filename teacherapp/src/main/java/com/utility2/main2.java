package com.utility2;

import com.vikrant.Controller.TeacherController;

public class main2 {

    public static void main(String[] args) {
         
        TeacherController c = new TeacherController();

        String msg= c.deletebyid(10);
        System.out.println(msg);
    }
}
