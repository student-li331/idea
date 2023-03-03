package com.first.ljf.controller;

import com.first.ljf.obj.Teacher;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
@RequestMapping("/teacher")
@RestController
public class TeacherController {
    @RequestMapping("/list")
    public List<Teacher> list(){

        List<Teacher> teacherList = new ArrayList<>();
        Teacher teacher = new Teacher();
        teacher.setId(1);
        teacher.setName("ljf");
        teacherList.add(teacher);

        List<Teacher> teacherList1 = new ArrayList<>();
        Teacher teacher1 = new Teacher();
        teacher.setId(1);
        teacher.setName("WWK");
        teacherList.add(teacher);

        return teacherList;
    }



        @RequestMapping("/info")
        public Teacher  info(
                @RequestParam("id") Integer id){


           Teacher teacher = new Teacher();
           teacher.setId(1);
           teacher.setName("wwk");
           teacher.setAge(33);

            return teacher;
    }

}
