package campus;//package: 클래스 저장 위치 설정

/* 1.java.lang 패키지는 필수 클래스이므로 자동 import.(따라서 String 그냥 사용 가능)
 * 2. 현재 클래스와 같은 패키지 존재 클래스
 */
 
//클래스 선언 부 밖 가능
//package
//import 문장 들
//주석문

import java.util.Date;
import java.util.Vector;
//import: 사용할 클래스의 package 위치 알려줌.
//이로서 class 내부에서 Date를 사용할 때마다 java.util.Date를 사용하지 않아도 된다.
//import java.util.*; //java.util의 모든 클래스
import multi.A;

public class B {
	public static void main(String[] args) {
		Date now = new Date();//현재 날짜와 시간
		System.out.println(now);
		Vector v = new Vector();//일종의 배열 타입(값 여러 개가 들어감)
		A a1 = new A("you");
		
	}
}
