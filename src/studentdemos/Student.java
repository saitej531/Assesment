package studentdemos;

import java.util.*;

public class Student {

	private String rollno;

	private int age;

	public Student(String rollno, int age) {
		this.rollno = rollno;
		this.age = age;

	}

	public String getroll() {
		return rollno;
	}

	public void setroll(String roll) {
		this.rollno = roll;
	}

	public int getage() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int hashcode() {
		int hash = rollno.hashCode();

		return hash;

	}

	

	public boolean equals(Student arg) {
		if (this == arg) {
			return true;
		}

		Student that = (Student) arg;
		boolean isequal = this.rollno == that.rollno;
		return isequal;

	}

}
