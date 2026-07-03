public class WithoutLambda 
{
	public static void main(String[] args) 
	{
		//Write code to call sayHello method of interface Greeting
		Greeting g = (str) -> System.out.println("Hello, "+str);
		g.sayHello("Rakesh");
		g.sayHello("Hemant"); 
	}
}
