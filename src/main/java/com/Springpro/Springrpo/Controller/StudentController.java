package com.Springpro.Springrpo.Controller;

import com.Springpro.Springrpo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.Springpro.Springrpo.Entity.Student;

@RestController
public class StudentController {
@Autowired
private StudentService studentService;

@PostMapping("/addStudent")
public Student postDetails(@RequestBody Student student){
    return studentService.saveDetails(student);
}
}
