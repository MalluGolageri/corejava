package core;

import java.io.Serializable;

public class SerializableTest {
	public static void main(String[] args) {
		A1 a=new A1();
	}
}

class A1 {	
	int a=10;
}

class B1 extends A1 implements Serializable {
	int b=20;	
}