package com.imooc.collection;

import java.util.*;

/**
 * @author Cheney <chendong992@gmail.com>
 * @date 2019/4/13 下午5:53
 */
public class AmyCollectionsTest {
    List<Integer> integerList ;

    public AmyCollectionsTest(){
        this.integerList = new ArrayList<>();
    }
    public void testSort01() {

        // integerList = new ArrayList<Integer>();
        Random random = new Random();
        Integer k;
        for (int i = 0; i < 10; i++) {

            do {
                k = random.nextInt(100);
            } while (integerList.contains(k));

            integerList.add(k);

        }
            // 遍历输出后的List
            System.out.println("----- 排序前：---------");
            testForeach();

            //Collections.sort排序操作
            Collections.sort(integerList);
            // 遍历排序后的List
            System.out.println("----- 排序后：---------");
            testForeach();
    }

    public void testForeach(){
        for (Integer list :integerList) {
            System.out.println("元素：" + list);
        }

    }
        public static void main (String[]args){
            AmyCollectionsTest act = new AmyCollectionsTest();
            act.testSort01();
        }

    }

