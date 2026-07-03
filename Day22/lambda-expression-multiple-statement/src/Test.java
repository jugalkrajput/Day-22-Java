public class Test 
{
	public static void main(String[] args) 
	{
		Calculator cal = num-> {
			double res = Math.sqrt(num);
			return res;
		};
		System.out.println(cal.squareRoot(67));
	}
}
