package com.hct.Design.factory.simpleFactory.pizza;

public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("制作奶酪pizza准备原材料");
    }
}
