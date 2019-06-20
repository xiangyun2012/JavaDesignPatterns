package com.demo.lib.proxypattern;

/**
 * Created by lushixiang on 2019/6/19
 */
public class Client {

    public static void  main(String[] str){
        Person subject = new ProxyPerson(new Farmer());
        subject.sellsApples();
    }
}
