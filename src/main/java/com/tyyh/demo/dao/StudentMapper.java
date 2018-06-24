package com.tyyh.demo.dao;


import com.tyyh.demo.pojo.Student;

import java.util.List;

public interface StudentMapper {
    List<Student> listStudents();
    int addStudent(Student student);
    int delStudent(Integer id);



}
