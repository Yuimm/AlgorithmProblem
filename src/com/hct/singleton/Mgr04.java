package com.hct.singleton;

/**
 * 静态内部类的方式
 * JVM保证单例-线程安全
 * 加载外部类时不会加载内部类，实现懒加载
 */
public class Mgr04 {
    private Mgr04() {

    }
    private static class Mgr04Holder{
        private final static Mgr04 INSTANCE = new Mgr04();
    }
    public static Mgr04 getInstance() {
        return Mgr04Holder.INSTANCE;
    }
    public static void main(String[] args){
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println(Mgr03.getInstance().hashCode())).start();
        }
    }
}
