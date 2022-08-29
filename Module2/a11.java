package Module2;

class member{
	String Name;
	int age;
	int salary,phone;
	public void printSalary(String  Name, int age, int salary, int phone) {
		this.Name= Name;
		this.age=age;
		this.salary=salary;
		this.phone=phone;
	}
	@Override
	public String toString() {
		return "member [assignName=" + Name + ", age=" + age + ", salary=" + salary + ", phone=" + phone + "]";
	}
}
class employee extends member{
	String spacialization;
	
}
class manager extends member{
	String department;
}

public class a11 {

	public static void main(String[] args) {
		
		employee e = new employee();
		e.printSalary("Ram", 25, 300000, 123456789);
		System.out.println(e);
		
		manager m = new manager();
		m.printSalary("Shyam", 31, 500000, 987654321);
		System.out.println(m);
	}

}
