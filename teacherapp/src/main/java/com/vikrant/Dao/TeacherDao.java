package com.vikrant.Dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.vikrant.Configuration.HibernateConfig;
import com.vikrant.Entity.Teacher;

public class TeacherDao {

    SessionFactory sf = HibernateConfig.getConnection();

    Session ss = sf.openSession();

    Transaction tr = ss.beginTransaction();

    public String saveall(ArrayList<Teacher> t) {

        // SessionFactory sf = HibernateConfig.getConnection();

        // Session ss = sf.openSession();

        // Transaction tr = ss.beginTransaction();

        t.stream().forEach(i -> System.out.println(ss.save(i)));

        tr.commit();
        ;

        ss.close();

        return "Data all Saved Succ...";
    }

    // ===================================================================================

    public String saveone(Teacher t) {
        ss.save(t);

        tr.commit();

        ss.close();

        return "Data One Saved Succ";
    }

    // =====================================================================================

    public List<Teacher> getall() {

        List<Teacher> t = ss.createQuery("From Teacher").list();

        ss.close();

        return t;
    }

    // =====================================================================================

    public Teacher getbyid(int id) {
        Teacher t = ss.get(Teacher.class, id);

        ss.close();

        return t;
    }

    // ====================================================================================

    public String updatebyid(int id, Teacher t) {
        Teacher t1 = ss.get(Teacher.class, id);

        t1.setName(t.getName());
        t1.setDept(t.getDept());
        t1.setAddress(t.getAddress());
        t1.setAge(t.getAge());

        ss.update(t1);

        tr.commit();

        ss.close();

        return "Data Updated Succc...";

    }

    // ===========================================================================

    public String deletebyid(int id)
    {
        Teacher t= ss.get(Teacher.class, id);

        ss.delete(t);

        tr.commit();

        ss.close();

        return "Data Del Succ of ID : "+id;
    }

}
