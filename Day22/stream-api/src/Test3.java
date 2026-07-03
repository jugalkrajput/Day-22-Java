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
		System.out.println("== Ascending order of Name ==");
		list.stream().sorted((e1, e2)->e1.name().compareTo(e2.name())).forEach(emp->System.out.println(emp));
		
		//Iterate employees in the ascending order of salary
		System.out.println("\n== Asscending order og Salary ==");
		list.stream().sorted((e1, e2)->e1.salary()-e2.salary()).forEach(emp->System.out.println(emp));
	}
}
