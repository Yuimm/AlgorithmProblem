package com.hct.Design.factory.factoryMethod.pizza;

public class BjCheesePizza extends Pizza{
    @Override
    public void prepare() {
         setName("北京奶酪pizza");
        System.out.println("北京奶酪pizza准备原材料 ");
    }
}
