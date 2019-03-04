package com.rongda.bean;



import java.util.ArrayList;
import java.util.List;

/**
 *  这是模块注释
 */
public class Customer extends Person{

    @Override
    public void eat(){
        System.out.println("客户吃饭...");
    }

    // 这是单行注释
    public static void main(String[] args){
        System.out.println("this is Customer !");
    }



}
