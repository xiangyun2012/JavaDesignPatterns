package com.demo.lib.proxypattern;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * Created by lushixiang on 2019/6/20
 */
public class LogHandler implements InvocationHandler {
    // ���б������������ã������ÿ������ⲿ����ƶ��ģ�
    private Object target;

    public LogHandler(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        // TODO Auto-generated method stub
        System.out.println("�����̽�����Ʒ~~��``");
       int o = (int) method.invoke(target, args);
        System.out.println("����������Ʒ�Ľ������м�2Ԫ������"+(o+2)+"��");
        return o;
    }

}

