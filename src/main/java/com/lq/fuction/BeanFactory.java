package com.lq.fuction;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class BeanFactory {
    private static Properties properties;
    private static Map<String, Object> beanMap = new HashMap<String, Object>();

    static {

        try {
            properties = new Properties();
            InputStream inputStream = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
            properties.load(inputStream);
        } catch (IOException e) {
            throw new ExceptionInInitializerError("初始化异常");
        }
    }

    /*  public static void main(String[] args) {
            Set<Map.Entry<Object, Object>> set = properties.entrySet();
            for (Map.Entry<Object, Object> entry : set) {
                System.out.println(entry.getKey());
                System.out.println(entry.getValue());
            }
     }*/


    /**
     *根据bean的名称获取bean对象
     * @param beanName bean的名字
     * @return bean名称对应的实例对象
     */
    public static Object getBean(String beanName){
        Object bean=null;
        if(beanMap.containsKey(beanName))
            return beanMap.get(beanName);
        try {
            String beanPath=properties.getProperty(beanName);
            bean=Class.forName(beanPath).newInstance();
            beanMap.put(beanName, bean);
        }catch (Exception e){
            e.printStackTrace();
        }

        return bean;
    }


}
