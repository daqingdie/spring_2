package com.lq.service.impl;

import com.lq.dao.CountDao;
import com.lq.dao.impl.CountDaoImpl;
import com.lq.fuction.BeanFactory;
import com.lq.service.CountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CountServiceImpl implements CountService {
   /* public CountServiceImpl(){
        System.out.println("make");
    }*/




    public void save() {
        System.out.println("haha");
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        CountDao countDao = (CountDao) ac.getBean("countDao");

        countDao.saveAll();

    }

    public CountDaoImpl getCountServiceImpl(){
        return  new CountDaoImpl();
    }
}
