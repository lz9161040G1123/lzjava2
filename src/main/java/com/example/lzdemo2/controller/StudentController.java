package com.example.lzdemo2.controller;

import com.example.lzdemo2.entity.Student;
import com.example.lzdemo2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {


    @Autowired
    private StudentService studentService;

    @RequestMapping("/select/student")
    public List<Student> select(){
        return studentService.select();

    }
    @RequestMapping("/insert/student")
    public int insert(Student student){
        return studentService.insert(student);

    }

    @RequestMapping("/insert2/student")
    public int insert2(Student student){
        return studentService.insert2(student);

    }

    @RequestMapping("/update/student")
    public int update(Student student){
        return studentService.update(student);

    }

    @RequestMapping("/delate/student")
    public int delete(Student student){
        return studentService.delete(student);

    }

}
