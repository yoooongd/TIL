package chap6;


public class Employee {

	Employee(){
		this(-1, "이름 미정", "부서 미정", "직급 미정");
	}
	Employee(int id, String name){
		this(id, name, "부서 미정", "부서 미정");
	}
	Employee(int id, String name, String dept, String title){
		this.id = id; 
		this.name = name;
		this.dept = dept;
		this.title = title;
	}	
	int id;//사번
	String name;//이름
	String dept;//부서
	String title;//직급

	//클래스 필드변수들 모아서 한 번에 출력 양식 정의
	public String toString() {
		return ("사번: "+id+	"\t이름: "+name+	
				"\t부서: "+dept+"\t직급: "+title);
	}
	//*참고
	//"사번: "+this.id+"\t이름: "+this.name+"\t부서: "+this.dept+"\t직급: "+this.title
	//하지만 this는 매개변수=필드변수일때만 붙여주면 됨.
	
}
