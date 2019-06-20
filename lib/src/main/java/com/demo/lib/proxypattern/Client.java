package com.demo.lib.proxypattern;

import java.lang.reflect.Proxy;

/**
 * Created by lushixiang on 2019/6/19
 */
public class Client {

    public static void  main(String[] str){

        //静态代理
        Person subject = new ProxyPerson(new Farmer());
        subject.sellsApples();

        //动态代理
//        Farmer farmer = new Farmer();
//        LogHandler li = new LogHandler(farmer);  //创建一个Handerler对象
//        Person person = (Person)Proxy.newProxyInstance(farmer.getClass().getClassLoader(), farmer.getClass().getInterfaces(), li);
//        person.sellsApples();

    }
}
