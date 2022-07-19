package com.hct.singleton;

/**
 * 懒汉式
 * 线程不安全
 */
public class Mgr02 {
    private static Mgr02 INSTANCE;
    private Mgr02(){

    }
    public static Mgr02 getInstance(){
        if (INSTANCE == null){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            INSTANCE = new Mgr02();
        }
        return INSTANCE;
    }

    // 测试线程不安全
    public static void main(String[] args){
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println(Mgr02.getInstance().hashCode())).start();
        }
    }
}
