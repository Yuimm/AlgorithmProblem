package com.hct.Design.factory.factoryMethod.pizza;

public class LdCheesePizza extends Pizza{
    @Override
    public void prepare() {
        setName("伦敦奶酪pizza");
        System.out.println("伦敦奶酪pizza准备原材料 ");
    }
}
