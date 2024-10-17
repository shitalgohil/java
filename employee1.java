//instance variable
public class employee1{

	public String name;
	private double salary;
	
	public employee1(String empname){
		name = empname;
		}
	public void set_salary(int sal){
		this.salary = sal;
	}
	public void print_detail(){
		System.out.println("name is:"+ name);
		System.out.println("salary is:"+salary);
	}
	public static void main(String args[]){
		employee1 emp1 = new employee1("ritu");
		emp1.set_salary(10000);
		emp1.print_detail();
	}
}