package com.first.ljf.controller;

import com.first.ljf.obj.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sun.plugin.javascript.navig.Array;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/student")
@RestController
public class HelloWorldController {

    @RequestMapping("/list")
    public List<Student>   list(){

        List<Student> studentList = new ArrayList<>();
        Student student = new Student();
        student.setId(1);
        student.setName("ljf");
        studentList.add(student);

        Student student1 = new Student();
        student1.setId(1);
        student1.setName("wwk");
        studentList.add(student1);

        return studentList;
    }

    @RequestMapping("/info")
    public Student  info(
            @RequestParam("id") Integer id
    ){


        Student student = new Student();
        student.setId(id);
        student.setName("ljf");

        return student;
    }
}
