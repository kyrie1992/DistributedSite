package cn.cugb.service;

import cn.cugb.model.Student;

import java.util.List;

/**
 * Created by nawei on 2018/10/16.
 */
public interface ICalCulateStudentService {
    /**
     * 得到所有的学生集合
     * @return
     */
    public List<Student> calculateAllStudentAges();
}
