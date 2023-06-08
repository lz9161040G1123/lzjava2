package com.example.lzdemo2.service.impl;

import com.example.lzdemo2.entity.Student;
import com.example.lzdemo2.entity.StudentExample;
import com.example.lzdemo2.mapper.StudentMapper;
import com.example.lzdemo2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    public StudentMapper studentMapper;

    @Override
    public List<Student> select(){
        StudentExample studentExample =  new StudentExample();
        studentExample.createCriteria().andAgeIsNotNull();
        return studentMapper.selectByExample(studentExample);


    }

    @Override
    public int insert(Student student){
        return studentMapper.insertSelective(student);
    }

    @Override
    public int update(Student student){
        StudentExample  studentExample = new StudentExample();
        studentExample.createCriteria().andAgeIsNotNull();
        return studentMapper.updateByExample(student, studentExample);
    }

    @Override
    public int delete(Student student){
        StudentExample studentExample = new StudentExample();
        studentExample.createCriteria().andIdEqualTo(1);
        return studentMapper.deleteByExample(studentExample);
    }
}
