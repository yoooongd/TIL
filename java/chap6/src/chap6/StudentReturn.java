package chap6;

//교육생 정적+동적
class Student{
	/*교육생 클래스에는 
	<필드변수>
	이름, 소속, 과정명, 교육비, 부가금, 환급금을 
	나타내는 변수를 정의합니다.
	<사용자 생성자>
	5개 매개변수 선언 : 
	이름, 소속, 과정명, 교육비, 부가금
	변수값으로 초기화
	 */
	
	String name;//이름
	String dept;//소속
	String title;//과정명
	int money;//교육비
	int tax;//부가세
	double remoney;//환급금
	
	Student(String name, String dept, String title, int money, int tax){
		this.name=name;
		this.dept=dept;
		this.title=title;
		this.money=money;
		this.tax=tax;
	}
	Student(){}
	
	double calc() {
		//환급금 계산하는 함수.
		if(title.equals("자바프로그래밍")) {
			remoney=money*0.25 + tax;
		}
		else if(title.equals("JDBC")) {
			remoney=money*0.2 + tax;
		}
		else if(title.equals("JSP")) {
			remoney=money*0.15 + tax;
		}
		else {
			System.out.println("잘못 입력하셨습니다.");
			return 0;
		}
		return remoney;
		
		//return 문장은 최종적으로 실행될 문장
		//but 중간에 멈춰야한다면?
		//void 일땐 그냥 return
		//int 일땐(return type있을 때) return 0
	}
}
public class StudentReturn {

	public static void main(String[] args) {
		/*명령행 매개변수를 이용하여 사용자로부터 이름, 소속, 과정명, 교육비, 부가금을 입력받습니다.*/
			
		Student stu = new Student();
		
		stu.name=args[0];
		stu.dept=args[1];
		stu.title=args[2].toUpperCase();
		stu.money = Integer.parseInt(args[3]);
		stu.tax = Integer.parseInt(args[4]);
		//stu.remoney=0;
		
		new Student(stu.name, stu.dept, stu.title, stu.money, stu.tax);
		
		System.out.println("환급전");
		System.out.println("이름: "+stu.name+" 소속: "+stu.dept+" 과정명: "+stu.title+" 교육비 "+stu.money+" 부가세: "+stu.tax);
		
		//stu.calc();
		
		double result=stu.calc();
		
		if(result==0) {return;}
		
		System.out.println("환급후");
		System.out.println("이름: "+stu.name+" 소속: "+stu.dept+" 과정명: "+stu.title+" 교육비 "+stu.money+" 부가세: "+stu.tax+" 환급금: "+result);
		
	}

}
