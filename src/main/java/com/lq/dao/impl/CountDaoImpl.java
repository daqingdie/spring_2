package com.lq.dao.impl;

import com.lq.dao.CountDao;

public class CountDaoImpl implements CountDao {
    public void saveAll() {
        System.out.println("save news ");
    }

    public CountDaoImpl(){
        System.out.println("对象被构建");
    }
    public void init(){
        System.out.println("对象初始化");
    }
    public void destory(){
        System.out.println("对象销毁");
    }

}
