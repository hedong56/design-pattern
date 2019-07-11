package com.test.singleton;

/**
 * @author hedong
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2019/7/11 14:09
 * @updateDate 2019/7/11 14:09
 **/
public class Singleton {

    private static final Singleton st = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return st;
    }

    public void doService(){
        System.out.println("业务方法");
    }


}
