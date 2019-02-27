package chap4;

import java.util.Scanner;

public class WhileInputTest {

	public static void main(String[] args) {
		//자바에서 제공하는 라이브러리.
		Scanner sc = new Scanner(System.in);
		//String input = sc.next(); //공백 전 문자열
		//진행 || 종료
		
		// == 연산자 동등비교 가능: boolean char int double
		// equals() : String 문자열 값 동등비교
		
/*		while(input.equals("진행")) {
			//while(true){//무한루프
			System.out.println("프로그램 수행중입니다.");
			System.out.println("계속 하려면 '진행'을 입력하세요");
			input = sc.next();
		}
		System.out.println("프로그램을 종료합니다.");*/
		
		while(true) {
			System.out.println("프로그램 수행중입니다.");
			System.out.println("계속 하려면 '진행'을 입력하세요");
			String input = sc.next();
			if(input.equals("종료")) {
				System.out.println("프로그램을 종료합니다.");
				break;//while(true)문을 빠져나오는 조건문이 되는 경우가 많다.
			}
		}
	}

}
