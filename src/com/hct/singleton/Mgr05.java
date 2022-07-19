package com.hct.singleton;

/**
 * 不仅可以解决线程安全，还可以防止反序列化
 */
public enum Mgr05 {
    INSTANCE;

    public static void main(String[] args){
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println(Mgr05.INSTANCE.hashCode())).start();
        }
    }

}
