package Guvijavacodes;

public class Employee {
	private String name;
	private int id;
	private double salary;
	 public Employee(String name,int id,double salary){
		 this.name=name;
		 this.id=id;
		 this.salary=salary;
	 }
	 public String getName() {
		 return name;
	 }
	
	 public int getid() {
		 return id;
	 }
	 public double getsalary() {
		 return salary;
	 }
	 public void raisesalary(double percentage) {
		 double raiseamount=salary *(percentage/100);
		 salary += raiseamount;
		 
	 }
	 public static void main(String[] args) {
		Employee abc=new Employee("john",546,50000);
		System.out.println("Name: " + abc.getName());
		System.out.println("id: " + abc.getid() );
		System.out.println("salary: " + abc.getsalary());
		System.out.println("salary before raise : $ " +abc.getsalary());
		
	//	raise by 10%
		abc.raisesalary(10);
		System.out.println("salary after raise: " +abc.getsalary());
		
		
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



