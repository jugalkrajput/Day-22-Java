@FunctionalInterface
public interface BB 
{
	void method1();
	static void method2() {};
	default void method3() {};
	private static void method4() {};
}
