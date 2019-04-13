package com.imooc.collection;

import java.util.Objects;

/**
 * 课程类
 * @author Administrator
 *
 */
public class Course {

	public String id;
	
	public String name;
	
	public Course(String id, String name) {
		this.id = id ;
		this.name = name;
	}
	
	public Course() {
		
	}
     @Override
    /**
     * 重写 equals方法 需要特别留意其逻辑判断，以后的equals方法重写就可以照搬
     * @param obj
     * @return
     */
    public  boolean equals(Object obj){
       if(this == obj){
           return true;

    }
    if(this == null)
        return  false;

    if(!(obj instanceof Course))
        return  false;
    Course course = (Course) obj;
        if(this.name == null){
            if(course.name == null)
                return  false;
                 else return  true;
            }else {
                if(this.name.equals(course.name))
                    return true;
                else  return false;
            }
        }

    @Override
    /**
     * 重写hashCode方法
     */
    public int hashCode() {
        return Objects.hash(name);
    }
}


