package com.hct.strategy;

import java.util.Arrays;

public class  Main {
    public static void main(String[] args) {
//        int[] a = {9,2,3,5,7,1,4};
        Cat[] a = {new Cat(3,3),new Cat(5,5),new Cat(1,8)};
        Sorter<Cat> sorter = new Sorter();
        sorter.sort(a,new CatHeightComparator());
        System.out.println(Arrays.toString(a));
    }
}
