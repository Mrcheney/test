package com.imooc.collection;

import java.util.*;

/**
 * @author Cheney <chendong992@gmail.com>
 * @date 2019/4/12 下午4:23
 */
public class AmySetTest {


    public Set<Course> coursesToSelect;
    public Student student;


    /**
     * 重建构造方法 初始化变量
     */

      public AmySetTest() {
        this.coursesToSelect = new HashSet<>();

    }

    /**
     * 用于往coursesToSelect中添加备选课程
     */
    public void testAdd() {
        // 创建一个课程对象，并通过调用add方法，添加到备选课程List中
        Course cr1 = new Course("1", "数据结构");
        coursesToSelect.add(cr1);
       // Course temp = (Course) coursesToSelect.get(0);
        // System.out.println("添加了课程：" + temp.id + ":" + temp.name);

        Course cr2 = new Course("2", "C语言");
        coursesToSelect.add(cr2);


        Course[] course = { new Course("3", "离散数学"), new Course("4", "汇编语言") };
        coursesToSelect.addAll(Arrays.asList(course));

        // System.out.println("添加了两门课程：" + temp3.id + ":" +
        // temp3.name + ";" + temp4.id + ":" + temp4.name);

        Course[] course2 = { new Course("5", "高等数学"), new Course("6", "大学英语") };
        coursesToSelect.addAll(Arrays.asList(course2));


    }

    /**
     * 创建学生对象并选课
     * @param args
     */
    public  void  createStuAndSelectCours(){
        // 创建一个学生对象
        student = new Student("1","Cheney");
        System.out.println("欢迎学生：" + student.name + "选课！");
        Scanner sc = new Scanner(System.in);

        for (int i = 0 ; i < 3 ; i++){
            System.out.println("请输入课程ID：");
            String courseId = sc.next();
            for (Course  cr : coursesToSelect) {
                if(cr.id.equals(courseId)){
                    student.courses.add(cr);
                }
            }
        }


    }
    /**
     * 测试Set 的contains方法
     * @param args
     */
    public void  testSetContains(){
        System.out.println("请输入学生已选课程的名称：");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        // 创建一个新的课程对象
        Course cr2 = new Course();
        cr2.name = name;
        System.out.println("新创建课程："  + cr2.name);
        System.out.println("备选课程是否包含课程：" + cr2.name + '\t' + student.courses.contains(cr2));
        System.out.println("课程1的哈希值：" +  student.courses.hashCode());
        System.out.println("课程2的哈希值：" +  cr2.hashCode());


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
    public static void main(String[] args) {

         AmySetTest st = new AmySetTest();
         st.testAdd();
         st.testForeach();
         st.createStuAndSelectCours();
         st.testSetContains();
    }

}
