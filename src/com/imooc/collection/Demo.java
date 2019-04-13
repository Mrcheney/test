package com.imooc.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cheney <chendong992@gmail.com>
 * @date 2019/4/12 下午10:08
 */
public class Demo {

    public List ls;

    public Demo(){
        this.ls = new ArrayList();
    }
    public void test(){

        ls.add(0);
        System.out.println(ls);

    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.test();
    }

}
