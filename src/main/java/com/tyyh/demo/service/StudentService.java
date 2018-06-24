package com.tyyh.demo.service;

import com.tyyh.demo.pojo.Student;

import java.util.List;

public interface StudentService {
    List<Student> getStudentlist();
    int addStudent(Student student);
    int delStudent(Integer id);
}
