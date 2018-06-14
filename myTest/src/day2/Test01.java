package day2;

public class Test01 {
	public static void main(String[] args) {
		Coder c = new Coder("С��","9527","6000");
		Coder c2 = new Coder();
		c2.setId("9526");
		c2.setName("СС��");
		c2.setSalary("3000");
		c2.work();
		c.work();
		
		Manager m = new Manager("����", "9528", "20000", "6000");
		m.work();
	}
}

class Person {
	private String name;
	private String id;
	private String salary;
	public Person() {
	}
	public Person(String name, String id, String salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	public void work() {
		System.out.println(name+"�ڹ���");
	}
}

class Coder extends Person {
	
	

	public Coder(String name, String id, String salary) {
		super(name, id, salary);
	}

	public Coder() {
	}

	@Override
	public void work() {
		System.out.println("����Ϊ"+getId()+"��"+getName()+"����"+getSalary()+"�Ĺ����ڷ���ô���");
	}
	
}

class Manager extends Person {
	private String bonus;

	public Manager() {
	}

	public Manager(String name, String id, String salary,String bonus) {
		super(name, id, salary);
		this.bonus = bonus;
	}

	public String getBonus() {
		return bonus;
	}

	public void setBonus(String bonus) {
		this.bonus = bonus;
	}

	@Override
	public void work() {
		System.out.println("����Ϊ"+getId()+"��"+getName()+"����"+getSalary()+"�Ĺ��ʺ�"+bonus+"�Ľ����ڷ��ָ�ӳ���Ա�ô���");
	}
	
}
