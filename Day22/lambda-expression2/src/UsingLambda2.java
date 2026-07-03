public class UsingLambda2 
{
	static void performTask(Calculator cal)
	{
		System.out.println(cal.add(100, 20));
	}
	public static void main(String[] args) 
	{	
		UsingLambda2.performTask((num1, num2) -> num1 + num2); 
	}
}
