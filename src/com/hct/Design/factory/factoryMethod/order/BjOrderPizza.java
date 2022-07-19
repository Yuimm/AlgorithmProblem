package com.hct.Design.factory.factoryMethod.order;

import com.hct.Design.factory.factoryMethod.pizza.BjCheesePizza;
import com.hct.Design.factory.factoryMethod.pizza.BjPepperPizza;
import com.hct.Design.factory.factoryMethod.pizza.Pizza;

public class BjOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new BjCheesePizza();
        }else if (orderType.equals("pepper")) {
            pizza = new BjPepperPizza();
        }
        
        return pizza;
    }
}
