package com.yutian.spring;

import com.yutian.spring.pojo.Clazz;
import com.yutian.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCByXMLTest {

    @Test
    public void testIOC(){

        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
//        Student studentOne = (Student) ioc.getBean("studentOne");
        Student studentOne = ioc.getBean(Student.class);
        System.out.println(studentOne);

    }


    @Test
    public void testID(){

        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
//        Student student = (Student) ioc.getBean("studentFive",Student.class);
        Student student = (Student) ioc.getBean("studentSix",Student.class);
        System.out.println(student);

//        Clazz clazzTwo = ioc.getBean("clazzTwo", Clazz.class);
//        System.out.println(clazzTwo);
    }
}
