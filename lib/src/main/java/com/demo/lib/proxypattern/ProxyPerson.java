package com.demo.lib.proxypattern;

/**
 * Created by lushixiang on 2019/6/19
 */
public class ProxyPerson implements Person {

    Person person;

   public ProxyPerson(Person person){
       this.person = person;
   }

    @Override
    public int sellsApples() {
        int money = 0;
        System.out.println("代理商介绍商品~~·``");
        money = person.sellsApples()+2;
        System.out.println("代理商在商品的进货价中加2元卖出："+money+"￥");
        return money;
    }
}
