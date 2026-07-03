import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;

public class Test5 
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
		
		list.stream().filter(emp->emp.department().equals("Sales"))
		.map(emp->emp.name().toUpperCase())
		.forEach(name->System.out.println(name));
	}
}
