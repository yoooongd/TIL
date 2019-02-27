package chap18;

import java.io.IOException;
//System.in: 키보드 장치 - windows - 자바 구현 바인딩 변수명
public class SystemInTest {
public static void main(String[] args) {
	System.out.println("입력 시작하세요");
	try {
		int result = 0;
		//ctrl+z : 키보드 입력 종료 제어키 (OS 마다 다름)
		//한글, 자바데이터타입 입력 불가능.
		while((result = System.in.read())!=-1) {
			System.out.println((char)result);			
		}
	}catch(IOException e) {
		System.out.println(e.getMessage());
	}
}
}

/*
 	try {
		int result = 0;
		result = System.in.read();//문자 -> int
		//but 1byte만 취급하기 때문에 한글은 보여줄 수 없음!!
		//==> 영문 + 숫자(0~9) 표현
		
		System.out.println((char)result);
		//100 입력 => 1, 0, 0 으로 생각
		//따라서 1만 출력 됨.
		//반복한다고 해도 1,0,0 각각을 읽을 뿐		
	}catch(IOException e) {
		System.out.println(e.getMessage());
 */