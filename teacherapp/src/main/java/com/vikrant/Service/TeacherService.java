package com.vikrant.Service;

import java.util.ArrayList;
import java.util.List;

import com.vikrant.Dao.TeacherDao;
import com.vikrant.Entity.Teacher;

public class TeacherService {

    TeacherDao td = new TeacherDao();

    public String saveall(ArrayList<Teacher> t) {

        return td.saveall(t);
    }

    // ===================================================


    public String saveone(Teacher t)
    {
        return td.saveone(t);
    }

    // =======================================================

    public List<Teacher> getall()
    {
        return td.getall();
    }

    // =======================================================

    public Teacher getId(int id)
    {
        return td.getbyid(id);
    }

    // ===========================================================

    public String updatebyid(int id,Teacher t)
    {
        return td.updatebyid(id, t);
    }

    // ==========================================================

    public String deletebyid(int id)
    {
        return td.deletebyid(id);
    }

}
