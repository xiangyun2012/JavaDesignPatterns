package com.demo.lib;

import com.demo.lib.proxypattern.ProxySubject;
import com.demo.lib.proxypattern.RealSubject;
import com.demo.lib.proxypattern.Subject;

public class MyClass {


    public static void main(String[] str){
        Subject subject = new ProxySubject(new RealSubject());
        subject.visit();
    }
}
