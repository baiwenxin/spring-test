package com.tyyh.demo.service.lmpl;

import com.tyyh.demo.dao.StudentMapper;
import com.tyyh.demo.pojo.Student;
import com.tyyh.demo.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;

    @Override
    public List<Student> getStudentlist() {
        return studentMapper.listStudents();
    }

    @Override
    public int addStudent(Student student) {
        return studentMapper.addStudent(student);
    }

    @Override
    public int delStudent(Integer id) {
        return studentMapper.delStudent(id);
    }
}
