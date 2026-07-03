import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;

public class Test2 
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
		class AA implements Comparator<Employee>
		{
			public int compare(Employee e1, Employee e2) 
			{
				return e1.name().compareTo(e2.name());
			}
		}
		Collections.sort(list,new AA());
		System.out.println("== Ascending order of Name ==");
		list.forEach(emp->System.out.println(emp));
		
		//Iterate employees in the descending order of salary
		class BB implements Comparator<Employee>
		{
			public int compare(Employee e1, Employee e2) 
			{
				return e2.salary()-e1.salary();
			}
		}
		Collections.sort(list,new BB());
		System.out.println("\n== Descending order os Salary ==");
		list.forEach(emp->System.out.println(emp));
	}
}
