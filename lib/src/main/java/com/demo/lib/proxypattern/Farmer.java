package com.demo.lib.proxypattern;

/**
 * Created by lushixiang on 2019/6/19
 */
public class Farmer implements Person {


    @Override
    public int sellsApples() {
        System.out.println("Farmer sellsApples:"+5);
        return 5;
    }
}
