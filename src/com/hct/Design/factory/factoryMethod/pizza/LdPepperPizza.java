package com.hct.Design.factory.factoryMethod.pizza;

public class LdPepperPizza extends Pizza{
    @Override
    public void prepare() {
        setName("伦敦的胡椒pizza");
        System.out.println("伦敦的胡椒pizza准备原材料");
    }
}
