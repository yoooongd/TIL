package chap18;

import java.util.Scanner;

public class ScannerTest {
public static void main(String[] args) {
		System.out.println("입력 시작");
		Scanner key = new Scanner(System.in);
		
		//주요 사용 메소드
		//String line = key.nextLine();//String(한글 포함)으로(공백포함)
		//System.out.println(line);
		String word = key.next();//String(공백이전단어)
		int num1 = key.nextInt();//키보드를 입력한 거도 정수로
		double num2 = key.nextDouble();
		System.out.println(word);
		System.out.println(num1+num2);//숫자로 인식 했다면 산술 연산 될 것.
		
}	
}
