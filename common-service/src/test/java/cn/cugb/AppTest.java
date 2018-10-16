package cn.cugb;

import cn.cugb.Service.CalCulateStudentData;
import cn.cugb.service.ICalCulateStudentService;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        int count = iCalCulateStudentService.calculateAllStudentAges().size();
        assertTrue( "结果正确" ,count==1);
    }
}
