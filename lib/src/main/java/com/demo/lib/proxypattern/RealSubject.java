package com.demo.lib.proxypattern;

/**
 * Created by lushixiang on 2019/6/19
 */
public class RealSubject implements Subject {
    @Override
    public void visit() {
        System.out.println("RealSubject->vist()");
    }
}
