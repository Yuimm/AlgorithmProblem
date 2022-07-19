package com.hct.Design.factory.simpleFactory.order;

import com.hct.Design.factory.simpleFactory.pizza.CheesePizza;
import com.hct.Design.factory.simpleFactory.pizza.GreekPizza;
import com.hct.Design.factory.simpleFactory.pizza.Pizza;

/**
 * 简单工厂类
 */
public class SimpleFactory {

    public Pizza createPizza(String orderType){
        Pizza pizza = null;
        if (orderType.equalsIgnoreCase("greek")){
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        }else if (orderType.equalsIgnoreCase("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        }
        return pizza;
    }

}
