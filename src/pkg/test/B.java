package pkg.test;

public class B {

	int intValue;
	
	static native B createB();
	
	static native void initInstance(B b);
	
	public static void main(String[] args) {
		System.loadLibrary("native");
		
		
		B b = createB();
		initInstance(b);
		
		System.out.println(b.intValue);
	}
}
