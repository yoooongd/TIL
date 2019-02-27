package chap6;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee(1234, "홍길동", "인사부", "사원"); 
		System.out.println(e1);
		
		Employee e2 = new Employee(2234, "김유정"); 
		System.out.println(e2);
		
		Employee e3 = new Employee(); 
		System.out.println(e3);
	}

}
