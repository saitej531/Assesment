package studentdemos;

import java.util.*;

public class StudentsMain {

	Set<Student> set = new HashSet<Student>();

	public static void main(String[] args) {

		StudentsMain demo = new StudentsMain();
		demo.runApp();
	}

public void runApp() {
	
	


		
		
	Student student1=new Student("de3e",20);
	set.add(student1);
	
	Student student2=new Student("dde4re",34);
	set.add(student2);
	
	Student student3=new Student("eddee",32);
	set.add(student3);
	
	Student student4=new Student("dddre",45);
	set.add(student4);
	
	
	Iterator<Student> iterator=set.iterator();
	
	while(iterator.hasNext()) {
		Student student=iterator.next();
		System.out.println("Age="+student.getage()+" "   +  "rollno"  +student.getroll());
	}
	}

	
	
}





	

	

	
	
