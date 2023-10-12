package com.Springpro.Springrpo.Service;

import com.Springpro.Springrpo.Repository.StudentRepo;
import com.Springpro.Springrpo.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;
/*
    public void StudentRepoSetter(){
        this.studentRepo = studentRepo;
    }*/

    public Student saveDetails(Student student){
        return studentRepo.save(student);
    }
}
