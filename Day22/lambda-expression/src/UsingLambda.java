public class UsingLambda 
{
	public static void main(String[] args) 
	{
		//Write code to call sayHello method of interface Greeting
		class GreetingImpl implements Greeting
		{
			public void sayHello(String name) 
			{
				System.out.println("Hello, "+name);
			}
			
		}
		new GreetingImpl().sayHello("Rakesh"); 
	}
}
