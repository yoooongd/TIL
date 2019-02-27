package chap6;

class B{
	int add(int i, int j) {
		return i+j;//정수끼리의 산술연산
	}
	String add(String i, String j) {
		return i+j;//문자열 결합의 연산
	}
	double add(double i, double j) {
		return i+j;//실수덧셈
	}
}//add 메소드 오버로딩.

public class OverloadingTest {

	public static void main(String[] args) {
		B b1 = new B();
		double r1=b1.add(1.1, 2.2);
		String r2=b1.add("java","jsp");
		int r3=b1.add(1, 2);
		double r4=b1.add(100, 200.22);
		//add(int, double)인 메소드는 없지만,
		//개수 확인->매개변수 type 확인->메소드 후보 좁힘.->두 번째 매개 변수의 타입이 double인 것 선택
		//여기서도 자동 형 변환 규칙 수행.
		
		//메소드 = 기능
		//이름 같다 = 기능 동일
		//매개변수 다르다 = 다양하게 사용
		//	ex)덧셈 연산자를 다양하게 사용해보겠다.
		
		//라이브러리 = api 오버로딩 구현
		//16진수 100 -> 16^2 = 256
		//2진수 100 -> 4
		//"100" -> 2진수 100
		int dec = Integer.parseInt("100");
		System.out.println(dec);
		int bin = Integer.parseInt("100", 2);
		System.out.println(bin);
		int hex = Integer.parseInt("100", 16);
		System.out.println(hex);
	}

}
