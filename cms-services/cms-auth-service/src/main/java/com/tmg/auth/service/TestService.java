package com.tmg.auth.service;

import com.tmg.auth.mapper.StudentMapper;
import com.tmg.model.auth.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Administrator
 * @version 1.0
 * @className TestService
 * @description TODO
 * @date 2021/4/28 10:37
 */
@Service
public class TestService {

    @Resource
    StudentMapper studentMapper;

    public void insertStu() {
        Student student = new Student();
        student.setId(100L);
        student.setStudentName("zs");

    }

}
