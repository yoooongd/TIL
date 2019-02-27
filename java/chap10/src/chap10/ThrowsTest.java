package chap10;

class Test{
	void ma(int i) throws ArithmeticException{//예외 떠넘기기
		System.out.println(100/i);
	}
	void mb() {//예외처리
			ma(0);	
	}
	void mc() {
		try {
			ma(0);
		}catch(ArithmeticException e) {
			ma(100);
		}
	}
}//메소드마다 예외처리 달라짐.

public class ThrowsTest {

	public static void main(String[] args) throws ArithmeticException{
		//자바 시스테한테 전달 = 예외 기본 처리기능 내장
		Test t = new Test();
		try {
		t.mb();
		}catch(ArithmeticException e) {
			System.out.println("0 나누기 오류");
		}
		//if(true) return;//메소드 종료 = 프로그램 종료
		
		//라이브러리 메소드: throws XXXException
		//ClassNotFoundException
		try {
			Class.forName(args[0]);//String type 하나 선언한 것과 같음
			System.out.println("존재하는 클래스");
		}catch(ClassNotFoundException e) {
			System.out.println("그런 이름의 클래스는 존재하지 않습니다.");
		}
	}

}
