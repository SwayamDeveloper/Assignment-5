import java.util.*;
import java.util.stream.Collectors;

class Student{
	int id;
	String name;
	int age;
	float marks;
	public Student (int id, String name,int age,float marks) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	
}
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            List<Student> student = new ArrayList<Student>();
            student.add(new Student(1,"Swayam jugran",18,70f));
            student.add(new Student(3,"ram",11,80f));
            student.add(new Student(3,"mukesh",12,82f));
            student.add(new Student(4,"suraj",19,92f));
	}
      List<Float> newStudent = Student.Stream().filter(p ->p.marks>60f && p.marks<80f).map(m->m.marks).collect(Collectors.toList());
}
