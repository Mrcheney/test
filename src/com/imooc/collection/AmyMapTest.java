package com.imooc.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Cheney <chendong992@gmail.com>
 * @date 2019/4/12 上午11:37
 */
public class AmyMapTest {


    public Map<String,Student> students;

    public AmyMapTest(){
        this.students = new HashMap<String,Student>();
    }

    public  void testPut(){


        Scanner sc = new Scanner(System.in);
        int i = 0;
        while(i < 3) {

            System.out.println("请输入学生ID：");
            String ID = sc.next();
            // 判断该ID是否被占用
            Student st = students.get(ID);
            if(st == null){
                //提示输入学生姓名
                System.out.println("请输入学生名称：");
                String name = sc.next();
                //创建新的学生对象
                Student newStudent = new Student(ID,name);
                //通过调用students的put方法，添加学生对象
                students.put(ID,newStudent);
                i++;
                System.out.println("成功添加学生：" + students.get(ID).name);

            }else{
                System.out.println("该学生ID已被占用");
                continue;
            }

        }

    }

    // 测试Map 的keySet方法
    public void testKeySet(){
        Set<String> keySet = students.keySet();
        System.out.println("总共有：" + students.size() + "个学生！");
        for (String stuId:keySet) {
            Student  st = students.get(stuId);

            if(st != null){
                System.out.println("学生ID：" + stuId + "\t" +  "学生name：" + st.name);
            }
        }

    }

    /**
     * 测试Map 的删除方法
     */
    public  void testRemove() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要删除的学生ID：");
            String ID = sc.next();
            Student st = students.get(ID);
            if (st == null) {
                System.out.println("提示输入的学生ID不存在！");
                continue;
            } else {
                students.remove(ID);

            }
            System.out.println("成功删除学生：" + st.name);
            break;
        }


    }

    // 通过EntrySet()方法，返回Map中的所有键值对
    public  void  testEntrySet(){
        Set<Map.Entry<String,Student>> entrySet = students.entrySet();
        for(Map.Entry<String,Student>  entry : entrySet){
            System.out.println(entry.getKey() + '\t' + entry.getValue().name);
        }
    }

    // 利用put方法修改Map中的已有映射
    public  void  testModify(){
        // 输入需要修改的学生的ID

        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入需要修改的学生ID：");
            String stuId = sc.next();
            Student st = students.get(stuId);
            if(st == null){
                System.out.println("输入的学生ID不存在，请重新输入！");
                continue;
            }else{
                System.out.println("提示当前对应的学生的名称：" + students.get(stuId).name);
                System.out.println("请输入需要新的学生名称：");
                String name = sc.next();
                Student newStudent = new Student(stuId,name);
                // 唯一关键代码
                students.put(stuId,newStudent);
                System.out.println("修改成功！");
                break;
            }
        }
    }

    /**
     * 测试Map中是否包含某个Key值或Value值
     * @param args
     */
    public void testContainKeyOrValue(){
        // containsKey() 和containsValue 返回boolean
       // System.out.println("输入需要判断的学生ID：");
       // Scanner sr = new Scanner(System.in);
       // String id = sr.next();
        System.out.println("输入需要判断的学生名称：");
        Scanner sc2 = new Scanner(System.in);
        String string2 = sc2.next();
        System.out.println(
//                "该学生ID是否存在：" + students.containsKey(id) + '\n'+
                "该学生名称是否存在：" + students.containsValue(string2));
        System.out.println();
        System.out.println("输入的该学生" + string2 + "是否存在：" + students.containsValue(new Student(null,string2)) );

    }

    public static void main(String[] args) {
        AmyMapTest mt = new AmyMapTest();

        mt.testPut();
        // mt.testKeySet();
        // mt.testRemove();
        // mt.testModify();
        mt.testContainKeyOrValue();
        mt.testEntrySet();

    }

}
