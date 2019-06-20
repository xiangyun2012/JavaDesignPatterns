package com.demo.lib.proxypattern;

/**
 * Created by lushixiang on 2019/6/19
 */
public class ProxySubject implements Subject {

    Subject subject;

   public ProxySubject( Subject subject){
       this.subject = subject;
   }

    @Override
    public void visit() {
        System.out.println("start visit~~~~");
        subject.visit();
        System.out.println("end visit~~~~~");
    }
}
