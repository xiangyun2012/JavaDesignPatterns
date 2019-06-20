package com.demo.lib.proxypattern;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * Created by lushixiang on 2019/6/20
 */
public class LogHandler implements InvocationHandler {
    // 持有被代理对象的引用（此引用可以有外部灵活制定的）
    private Object target;

    public LogHandler(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        // TODO Auto-generated method stub
        System.out.println("代理商介绍商品~~·``");
       int o = (int) method.invoke(target, args);
        System.out.println("代理商在商品的进货价中加2元卖出："+(o+2)+"￥");
        return o;
    }

}

