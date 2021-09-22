package pkg.test;

public class A {
	
	static native int foo();
	
	static void bar() {
		System.out.println("Call me!");
	}
	
	static void bar(String msg) {
		System.out.println(msg);
	}
	
	static void bar(int value) {
		System.out.printf("the values is %d\n", value);
	}
	
	static void bar(int iValue, long lValue) {
		System.out.printf("the values is %d%n", iValue);
		System.out.printf("the values is %d%n", lValue);
	}
	
	public static void main(String[] args) {
		System.loadLibrary("native");
	
		A.foo();
	}
}
