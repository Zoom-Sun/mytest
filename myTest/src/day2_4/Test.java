package day2_4;

public class Test {
	public static void main(String[] args) {
		Student s = new Student("957");
		System.out.println(s);
	}
}

class Person {
	String id;
	String name;
	public Person() {
		super();
		System.out.println("�����޲�");
	}
	
	public Person(String id) {
		System.out.println("�����в�");
	}
}

class Student extends Person{
	public Student() {
		System.out.println("�����޲�");
	}
	
	public Student(String id) {
		this(id,"");
		System.out.println("���൥��");
	}
	
	public Student(String id,String name) {
		super();
		System.out.println("��������");
	}
}