package com.vikrant.Controller;

import java.util.ArrayList;
import java.util.List;

import com.vikrant.Entity.Teacher;
import com.vikrant.Service.TeacherService;

public class TeacherController {

    TeacherService ts = new TeacherService();

    public String saveall(ArrayList<Teacher> t) {
        return ts.saveall(t);
    }

    // ===========================================

    public String saveone(Teacher t) {
        return ts.saveone(t);
    }

    // ==============================================

    public List<Teacher> getall()
    {
        return ts.getall();
    }

    // ==============================================

    public Teacher getbyid(int id)
    {
        return ts.getId(id);
    }

    // ================================================

    public String updatebyid(int id,Teacher t)
    {
        return ts.updatebyid(id, t);
    }

    // =================================================

    public String deletebyid(int id)
    {
        return ts.deletebyid(id);
    }

}
