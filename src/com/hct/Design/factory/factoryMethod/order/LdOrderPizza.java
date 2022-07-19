package com.hct.Design.factory.factoryMethod.order;

import com.hct.Design.factory.factoryMethod.pizza.*;

public class LdOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new LdCheesePizza();
        }else if (orderType.equals("pepper")) {
            pizza = new LdPepperPizza();
        }
        return pizza;
    }
}
