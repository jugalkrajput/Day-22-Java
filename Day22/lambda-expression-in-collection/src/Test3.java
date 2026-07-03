import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;

public class Test3 
{
	public static void main(String[] args) 
	{
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(101,"Rakesh", "Sales", 67890));
		list.add(new Employee(102,"Hemant", "Marketing", 78000));
		list.add(new Employee(103,"Abhishek", "Training", 80000));
		list.add(new Employee(104,"Manoj", "Sales", 56000));
		list.add(new Employee(105,"Imran", "Marketing", 69000));
		list.add(new Employee(106,"David", "Sales", 89120));
		
		//Iterate employees in the ascending order of name
		Collections.sort(list,(e1, e2)->e1.name().compareTo(e2.name()));
		System.out.println("== Ascending order of Name ==");
		list.forEach(emp->System.out.println(emp));
		
		//Iterate employees in the descending order of salary
		Collections.sort(list,(e1, e2)->e2.salary()-e1.salary());
		System.out.println("\n== Descending order os Salary ==");
		list.forEach(emp->System.out.println(emp));
	}
}
