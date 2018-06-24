package com.tyyh.demo.controller;


import com.tyyh.demo.pojo.Student;
import com.tyyh.demo.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;


@Controller
@RequestMapping("/student")
public class StudentController {
    @Resource(name = "studentService")
    private StudentService studentService;

    /**
     * 显示页面
     * @param model
     * @return
     */
    @RequestMapping(value = "/list")
    public  String getlist(Model model){
        List<Student> studentList=studentService.getStudentlist();
        model.addAttribute("slist",studentList);
        return  "index";
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping(value = "/delInfo", produces = { "application/json;charset=utf-8" })
    public String getdelStudent(Integer id) {
        System.out.println(id);
        int result = studentService.delStudent(id);
        String str = "";
        if (result > 0) {
            str = "ok";
        } else {
            str = "on";
        }
        return str;
    }

    /**
     * 进入编辑页面
     * @return
     */
    @RequestMapping(value = "/addInfo")
    public  String addinfos(){
        return "/edit";
    }
    @RequestMapping(value="/addStudent",produces = {"text/html;charset=utf-8"})
    @ResponseBody
    public String editStudent(Student student) {
        int result=0;
        String data="";
        if (student.getId() == 0) {
            result=studentService.addStudent(student);
        }
        if (result>0) {
            data="ok";
        }else {
            data="no";
        }
        return data;
    }
};
