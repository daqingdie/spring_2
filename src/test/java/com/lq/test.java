package com.lq;

import com.lq.dao.CountDao;
import com.lq.service.CountService;
import com.lq.service.impl.CountServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.applet.AppletContext;


public class test {
    @Test
    public void test(){
//        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//        CountService countService = (CountService)ac.getBean("countService");
//        countService.save();
//        CountDao countDao = (CountDao) ac.getBean("countDao");
//        countDao.saveAll();
//        CountService countService1=ac.getBean("countService",CountService.class);
//        countService1.save();
        Resource resource = new ClassPathResource("bean.xml");
        BeanFactory beanFactory =new  XmlBeanFactory(resource);
        CountService countService = (CountService) beanFactory.getBean("countService");
        countService.save();
        CountDao countDao = (CountDao) beanFactory.getBean("countDao2");
        countDao.saveAll();
//        countDao.saveAll();
    }

    @Test
    public void test_1(){
        ClassPathXmlApplicationContext cpac=new ClassPathXmlApplicationContext("bean.xml");
        CountDao countDao=(CountDao)cpac.getBean("countDao");
        countDao.saveAll();
        cpac.close();
    }


}
