package com;

import com.service.EmpService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class aaaaa {

    @Test
    public void s(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-core.xml");
        EmpService bean = applicationContext.getBean(EmpService.class);

    }
}
