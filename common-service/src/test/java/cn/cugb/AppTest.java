package cn.cugb;

import cn.cugb.Service.CalCulateStudentData;
import cn.cugb.model.Student;
import cn.cugb.service.ICalCulateStudentService;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
        ICalCulateStudentService iCalCulateStudentService = (CalCulateStudentData)factory.getBean("calCulateStudentData");
        Student student = iCalCulateStudentService.calculateAllStudentAges().get(0);
        System.err.println(student.getName()+student.getAddress());
        int count = iCalCulateStudentService.calculateAllStudentAges().size();
        assertTrue( "结果正确" ,count==1);
    }


}
