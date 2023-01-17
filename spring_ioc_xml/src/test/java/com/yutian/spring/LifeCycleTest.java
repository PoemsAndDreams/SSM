package com.yutian.spring;

import com.yutian.spring.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleTest {

    @Test
    public void test(){

        /**
         * 1、实例化
         * 2、依赖注入
         * 3、后置处理器的postProcessBeforeInitialization
         * 4、初始化，需要通过bean的init-method属性指定初始化的方法
         * 5、后置处理器的postProcessAfterInitialization
         * 6、IOC容器关闭时销毁，需要通过bean的destroy-method属性指定销毁的方法
         *
         * bean的后置处理器会在生命周期的初始化前后添加额外的操作
         * 需要实现BeanPostProcessor接口且配置到IOC容器中
         * 需要注意的是，bean后置处理器不是单独针对某一个bean生效，而是针对IOC容器中所有bean都会执行
         *
         * 注意：
         * 若bean的作用域为单例时，生命周期的前三个步骤会在获取IOC容器时执行
         * 若bean的作用域为多例时，生命周期的前三个步骤会在获取bean时执行
         *         单例singleton的bean是容器初始化时创建的；
         *         多例prototype的是获取对象时才会创建。这里获取了IOC容器，
         *         也就是容器初始化了，所有单例的bean都会在此时创建并初始化。
         */

        ConfigurableApplicationContext ioc = new ClassPathXmlApplicationContext("spring-lifecycle.xml");
        User user = ioc.getBean(User.class);
        System.out.println(user);
        ioc.close();
    }
    
}
