package com.miaoph.cn.controller;


import com.miaoph.cn.service.TeacherServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {
    @Autowired
    private TeacherServiceFeign teacherService;


    @GetMapping("/getAllTeacher")
    public String getAllTeacher() {
        return teacherService.getAllTeacher();
    }

    @GetMapping("/saveTeacher")
    public String saveTeacher( ){
        return teacherService.saveTeacher(null);
    }
    @GetMapping("/getTeacherById")
    public String getTeacherById() {
        return teacherService.getTeacherById(2);
    }

    @GetMapping("/getTeacherByName")
    public String getTeacherByName() {
        return teacherService.getTeacherByName(null);
    }
    @GetMapping("/errorMessage")
    public String errorMessage() {
        return teacherService.errorMessage(1);
    }


}
