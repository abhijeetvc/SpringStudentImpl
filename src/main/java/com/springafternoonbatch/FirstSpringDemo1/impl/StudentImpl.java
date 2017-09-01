package com.springafternoonbatch.FirstSpringDemo1.impl;

import com.springafternoonbatch.FirstSpringDemo1.model.Student;
import com.springafternoonbatch.FirstSpringDemo1.repository.StudentRepo;
import org.springframework.stereotype.Service;

/**
 * Created by abhi on 31/08/17.
 */

@Service
public class StudentImpl implements StudentRepo {
    @Override
    public Student getData() {

        Student s=new Student();
        s.setId(1);
        s.setName("abhijeet");
        return s;
    }
}
