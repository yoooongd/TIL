package chap7_2;

final class Math{
	final public int abs(int data) {
		//data의 절댓값 리턴
		if(data<0) return data * -1;
		return data;
	}
	//제곱근, 삼각함수 등 메소드 5개 정의.
}

class MyMath /*extends Math*/{
	public int abs(int data) {
		Math m = new Math();
		return m.abs(data);
	}
	void power() {
		System.out.println("제곱을 구합니다.");
	}
}
public class MathTest {
	public static void main(String[] args) {
		MyMath m = new MyMath();
		m.power();
		System.out.println(m.abs(10));
		System.out.println(m.abs(-10));
	}
}
