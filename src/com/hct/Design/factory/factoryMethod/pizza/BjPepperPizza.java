package com.hct.Design.factory.factoryMethod.pizza;

public class BjPepperPizza extends Pizza{
    @Override
    public void prepare() {
        setName("北京的胡椒pizza");
        System.out.println("北京的胡椒pizza准备原材料");
    }
}
