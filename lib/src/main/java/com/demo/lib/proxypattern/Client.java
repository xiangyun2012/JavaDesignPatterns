package com.demo.lib.proxypattern;

import java.lang.reflect.Proxy;

/**
 * Created by lushixiang on 2019/6/19
 */
public class Client {

    public static void  main(String[] str){

        //��̬����
        Person subject = new ProxyPerson(new Farmer());
        subject.sellsApples();

        //��̬����
//        Farmer farmer = new Farmer();
//        LogHandler li = new LogHandler(farmer);  //����һ��Handerler����
//        Person person = (Person)Proxy.newProxyInstance(farmer.getClass().getClassLoader(), farmer.getClass().getInterfaces(), li);
//        person.sellsApples();

    }
}
