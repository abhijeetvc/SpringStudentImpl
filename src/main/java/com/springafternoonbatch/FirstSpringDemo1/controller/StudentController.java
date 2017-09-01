package com.springafternoonbatch.FirstSpringDemo1.controller;

import com.springafternoonbatch.FirstSpringDemo1.impl.StudentImpl;
import com.springafternoonbatch.FirstSpringDemo1.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by abhi on 31/08/17.
 */

@RestController
public class StudentController {

    @Autowired
    private StudentImpl studentImpl;

//    StudentController(StudentImpl studentImpl){
//        this.studentImpl=studentImpl;
//    }

    @Autowired
    public void setStudentImpl(StudentImpl studentImpl){
        this.studentImpl=studentImpl;
    }

    @GetMapping(value="/getdata")
    Student data(){

        Student st=studentImpl.getData();
        System.out.println(st);
        return st;

    }


}
