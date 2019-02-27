package chap7_2;

class Employee{
	String title="사원";
	int id;
	String name;
	String dept;
	public void printField() {
		System.out.println(id + " : "+name+" : "+dept);
	}
}
class Manager extends Employee{
	
	//Employee 클래스 안에
	//final public void printField()라고 선언되거나=> 해당 메소드만 오버라이딩 금지
	//final class Employee로 선언되면 => 상속자체가 금지.
	//오버라이딩 안돼ㅐㅐㅐㅐㅐㅐㅐ
	public void printField() {
		//System.out.println(id + " : "+name+" : "+dept);
		//상위 클래스의 내용과 같은 부분 대신 super를 사용한다.
		super.printField();
		System.out.println(jobOfManage+":"+cntOfSubs);
	}
	
	//manager들도 사번, 이름, 부서가 있을 것이다.
	void test() {
		System.out.println(super.title);//상속 불가함을 알 수 있음.
		System.out.println(title);
	}
	String title="관리직";
	String jobOfManage;//관리직 업무 내용
	int cntOfSubs; //관리하고 있는 사원의 수
}
public class ManagerTest {
	public static void main(String[] args) {
		Manager m = new Manager();
		m.id = 100;
		m.name = "홍길동";
		m.dept="전산";
		m.jobOfManage = "전산실 관리";
		m.cntOfSubs = 5;
		System.out.println(m.id+" : "+m.name+" : "+m.jobOfManage);
		m.test();
		m.printField();//Employee 상위 상속 메소드
	}
}
