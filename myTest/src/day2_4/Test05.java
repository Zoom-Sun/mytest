package day2_4;

public class Test05 {
	public static void main(String[] args) {
		A a = new C();
		a.test03();
	}
}

class A {
	void test01() {
		System.out.println("A01");
	}
	void test02() {
		System.out.println("A02");
	}
	void test03() {
		System.out.println("A03");
	}
}

class B extends A {
	void test01() {
		System.out.println("B01");
	}
}

class C extends B {
	
}