package cn.cugb.Service;

import cn.cugb.model.Student;
import cn.cugb.service.ICalCulateStudentService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nawei on 2018/10/16.
 */
public class CalCulateStudentData implements ICalCulateStudentService {
    private static final String STUNAME = "test";
    private static final String ADDRESS="西北旺";


    @Override
    public List<Student> calculateAllStudentAges() {
        List<Student> resultList = new ArrayList<>();
        Student student = new Student();
        student.setAddress(STUNAME);
        student.setAddress(ADDRESS);
        resultList.add(student);
        return resultList;
    }


}
