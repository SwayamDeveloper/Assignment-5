import java.util.*;
class Employee  implements Comparable<Employee>
{
    String Employee_name;
	int age;
	int Salary;
	int Employee_id;
	
	Employee( String Employee_name,int age, int Salary,	int Employee_id )
	{
		 this.Employee_name = Employee_name;
         this.age = age;
         this.Salary = Salary;
         this.Employee_id = Employee_id;
		
	}
	public int campareTo(Employee o) {
	   if(Salary==o.Salary)
		   return 0;
	   else if(Salary >o.Salary)
		   return 1;
	   else
		   return -1;
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
public class main {
public static void main(String[] args) {
		// TODO Auto-generated method stub
           List<Employee> number = new ArrayList<>();
           number.add(new Employee("Swayam",18,15000,4));
           number.add(new Employee("Ravi",20,20000,5));
           number.add(new Employee("Satyam",24,10000,2));
           number.add(new Employee("Ram",23,30000,3));
           Collections.sort(number);
           for(Employee s1:number)
           System.out.println("Employee name:" + ""+ s1.Employee_name+ " age:"+""+ s1.age+ " Salary: "+""+s1.Salary+ " Employee_id:"+""+s1.Employee_id );
	}
}