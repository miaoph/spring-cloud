package com.miaoph.cn.controller;

import com.miaoph.cn.api.TeacherService;
import com.miaoph.cn.bean.Teacher;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController implements TeacherService {
    @Override
    public String getAllTeacher() {
        return "getAllTeacher-----";
    }

    @Override
    public String saveTeacher(Teacher Teacher) {
        return "saveTeacher-=====";
    }

    @Override
    public String getTeacherById(Integer id) {
        return "getTeacherById=="+id;
    }

    @Override
    public String getTeacherByName(String name) {
        return "getTeacherByName====="+name;
    }

    @Override
    public String errorMessage(Integer id) {
        return "errorMessage-----------"+id;
    }
}
