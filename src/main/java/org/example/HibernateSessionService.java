package org.example;

import org.example.crud.GroupDao;
import org.example.crud.StudentDao;
import org.example.crud.EntityManagerStudentDao;
import org.example.entities.Group;
import org.example.entities.Student;
import org.hibernate.SessionFactory;

import java.util.List;

public class HibernateSessionService {
    private final GroupDao groupDao;
    private final StudentDao studentDao;

    public HibernateSessionService() {
        SessionFactory sessionFactory = HibernateConfiguration.getFactory();
        studentDao = new EntityManagerStudentDao(sessionFactory);
        groupDao = new GroupDao(sessionFactory);
    }

    public void exec() {
        Student student = studentDao.findById(1L);
        List<Student> students = studentDao.findAll();

        Group group = groupDao.findById(1L);

        Student newStudent = new Student();
        newStudent.setName("Захар");
        newStudent.setSurname("Литвинчук");
        newStudent.setGroup(group);
        studentDao.save(newStudent);
    }
}
