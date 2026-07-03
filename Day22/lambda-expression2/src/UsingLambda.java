public class UsingLambda 
{
	static void performTask(Calculator cal)
	{
		System.out.println(cal.add(100, 20));
	}
	public static void main(String[] args) 
	{	
		//Call performTak method
		class CalImpl implements Calculator
		{
			public int add(int num1, int num2) 
			{
				return num1 + num2;
			}
			
		}
		UsingLambda.performTask(new CalImpl()); 
	}
}
