package com.imooc.collection;

import java.util.*;

public class TestIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Tom");
        list.add("Bob");
        list.add("Marry");
        //构造list 的迭代器
        Iterator it = list.iterator();
        // 通过迭代器遍历元素
        while (it.hasNext()){

            Object obj = it.next();
            System.out.println(obj);
        }


    }



}
