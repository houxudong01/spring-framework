package com.my.demo;

/**
 * @author:hxd
 * @date:2020/7/12
 */
public class Teacher {
	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Teacher{" +
				"student=" + student +
				'}';
	}
}
