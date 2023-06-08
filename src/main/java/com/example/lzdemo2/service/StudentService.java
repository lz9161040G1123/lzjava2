package com.example.lzdemo2.service;

import com.example.lzdemo2.entity.Student;

import java.util.List;

public interface StudentService {

    default List<Student> select()
    {
        return null;
    }

    default int insert(Student student) {
        return 0;
    }

    default int update(Student student){
        return 0;
    }

    default int delete(Student student){
        return 0;
    }


}
