package Guvijavacodes;

public class Person {
	private String name;
	private int age;
	//constructor
	Person(String name, int age){
	this.name=name;
	this.age=age;
	
	}
	//getter setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public static void main(String[] args) {
		Person y=new Person("John",35);
		System.out.println("name:" +y.getName());
		System.out.println("age:" +y.getAge());
		// TODO Auto-generated method stub

	}
}
