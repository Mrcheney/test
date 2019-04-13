package com.imooc.collection;

import java.util.Objects;

/**
 * �γ���
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
     * ��д equals���� ��Ҫ�ر��������߼��жϣ��Ժ��equals������д�Ϳ����հ�
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
     * ��дhashCode����
     */
    public int hashCode() {
        return Objects.hash(name);
    }
}


