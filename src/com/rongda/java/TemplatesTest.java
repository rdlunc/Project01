package com.rongda.java;

import com.rongda.bean.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.IDEA中代码模版所处的位置：setting - Editor - Live Templates / Postfix Completion
 * 2.常用的模版
 *
 * @author lunrongda
 * @create 2019-02-28 21:36
 */
public class TemplatesTest {

    //模版六：prsf 可生成 private static final
    private static final Customer CUST = new Customer();
    //变形：psf
    public static final int NUM = 1;
    //变形：psfi
    public static final int NUM2 = 2;
    //变形：psfs
    public static final String NATION = "China";

    //模版一：psvm
    public static void main(String[] args) {

        //模版二：sout
        System.out.println("hello");
        //变形：soutp / soutm / soutv / "xxx".sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");

        int num = 10;
        System.out.println("num = " + num);

        System.out.println(num);

        //模版三：fori
        String[] arr = new String[]{"Tom","Jerry","Alen","Dada"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        //变形：iter
        for (String s : arr) {
            System.out.println(s);
        }

        //模版四：list.for
        List<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(456);
        list.add(678);
        for (Integer i : list) {

        }
        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {
            
        }
        //变形：list.forr  倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
    }

    public void methiod(){
        System.out.println("TemplatesTest.methiod");

        List<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(456);
        list.add(678);
        //模版五：ifn
        if (list == null) {
            
        }
        //变形：inn
        if (list != null) {
            
        }

        //变形：xxx.null / xxx.nn
        if (list == null) {

        }
        if (list != null) {

        }


    }









}
