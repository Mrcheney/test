package com.imooc.collection;

import javax.swing.plaf.ComponentInputMapUIResource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @author Cheney <chendong992@gmail.com>
 * @date 2019/4/12 上午11:38
 */
public class AmyListTest {
    /**
     * 存放课程List
     */
    public List coursesToSelect;

    // 重建构造方法 初始化变量
    public AmyListTest() {
        this.coursesToSelect = new ArrayList();

    }

    /**
     * 用于往coursesToSelect中添加备选课程
     */
    public void testAdd() {
        //创建一个课程对象，并通过调用add方法，添加到备选课程List中
        Course cr1 = new Course("1", "数据结构");
        coursesToSelect.add(cr1);
        Course cr2 = new Course("2", "C语言");
        coursesToSelect.add(cr2);
        System.out.println(coursesToSelect.get(0));
        System.out.println(coursesToSelect.get(1));
        System.out.println("添加的元素：" + cr1.id + '\t' + cr1.name);
        System.out.println("添加的元素：" + cr2.id + '\t' + cr2.name);
    }


    /**
     * 使用迭代器遍历List
     * @param args
     */
    public void testIterator(){
        // 取得迭代器示例
        Iterator<Course> it = coursesToSelect.iterator();
        while (it.hasNext()){

             Course cr = it.next();
             System.out.println("参数传递方式：" + cr);
           //  System.out.println("直接输出方式：" + it.next().id + '\t' + it.next().name);  next()使用两次
            System.out.println("迭代器输出：" + cr.id  + '\t' + cr.name);
        }

    }

    /**
     * 使用foreach遍历List
     * @param args
     */
    public  void testForeach(){
        for(Object obj : coursesToSelect){
            Course cr = (Course) obj;
            System.out.println(cr.id + '\t' + cr.name);
        }
    }

    /**
     * 使用for 循环遍历
     * @param args
     */
    public void testFor(){
        for(int i = 0 ; i< coursesToSelect.size();i++){
            Course cr = (Course) coursesToSelect.get(i);
            System.out.println(cr.id + cr.name);

        }

    }

    /**
     * 测试List 的contains方法
     * @param args
     */
    public  void testListContains(){
         Course cr = (Course) coursesToSelect.get(0);
        System.out.println("输出：" + cr.name);
        System.out.println("判断是否包含课程：" + cr.name + "成功如否：" +  coursesToSelect.contains(cr));
        Course cr2 = new Course(cr.id,cr.name);
        System.out.println("判断是否包含课程：" + cr2.name + "成功如否：" +  coursesToSelect.contains(new Course("1","数据结构")));

        // 通过课程名称判断 List是否包含该课程名称的课程
        System.out.println("请输入课程名称：");
        Scanner sc = new Scanner(System.in);
        Course course3 = new Course();
        course3.name = sc.next();
        System.out.println("新创建课程:" + course3.name);
        System.out.println("备选课程表是否包含课程：" + course3.name + '\t' + coursesToSelect.contains(course3));

        // 如果包含便输出该课程的索引位置
        System.out.println("该课程的索引位置：" + coursesToSelect.indexOf(course3));

    }

    public static void main(String[] args) {
        AmyListTest mlt = new AmyListTest();
        mlt.testAdd();
//        mlt.testIterator();
//        mlt.testForeach();
       // mlt.testFor();
        mlt.testListContains();
    }
}