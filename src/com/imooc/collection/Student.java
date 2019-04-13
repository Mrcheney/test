package com.imooc.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * Ñ§ÉúÀà
 * @author Administrator
 *
 */
public class Student {

	public String id;
	
	public String name;
	
	public Set<Course> courses;

	public Student(String id, String name) {
		this.id = id;
		this.name = name;
		this.courses = new HashSet<>();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Student student = (Student) o;

		return name.equals(student.name);
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}
}
