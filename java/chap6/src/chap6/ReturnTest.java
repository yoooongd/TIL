package chap6;

//하나의 파일 안에 여러 개의 클래스 생성? 가능.
//단, public 선언된 class는 자바 파일의 이름과 같아야 함.
//	  또는 main을 포함한 class는 자바 파일의 이름과 같아야 함.
//이외의 클래스는 public을 선언할 수 없음. 물론 main도.
class A{
	int ma() {//메소드 정의(구현): 실행 x
		int i=10;
		return i * i;//return하는 결과가 어떤 타입인지 선언부에 작성.
	}	
	double mb(){return 3.14;}
	String mc(){
		String s = "java";
		return s+s;
	}
	void md(int j){
		//j*j>=100이면 출력
		//그렇지 않으면 메소드를 실행하지 않는다.
		if(j*j>=100) {
			System.out.println(j*j);
		}
		else {return;}
		//return으로 끝남. (void는 return할 게 없으니까.)
		//남아있는 것을 수행하지 않고 여기서 중단하겠다는 의미.
		System.out.println("md 메소드 종료");
	}
}

//return
//1. 결과전달 2.중단
public class ReturnTest {
	public static void main(String[] args) {
		//실행 문장: 메모리 변화 출력=객체 생성
		//메소드 호출
		//ma(); :바로 이렇게는 사용 불가. 제일 먼저 할 것은 객체 생성
		
		A a1 = new A();
		int result=a1.ma();//ma() 메소드를 실행하러 감.
		double result2=a1.mb();
		String result3=a1.mc();
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		a1.md(1);
		//return 없이 호출만. but 메소드 안에서 출력 결과 보여주므로 조회는 가능.
		//결과를 받아서 수정할 수는 없음.
		//앞의 메소드들은 결과를 받아서 수정 가능. 읽기 전용.
		System.out.println("main 종료");
	}
}
