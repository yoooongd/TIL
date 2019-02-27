package chap5;

import java.util.Scanner;

public class ArrayTest1 {

	public static void main(String[] args) {
		//5개의 정수 저장 배열:1~100 난수 5개 발생 저장
		
		String [] names = new String[5];
		int scores[]=new int[5];
		
//		for(int i=0; i<scores.length; i++) {
//			System.out.println(names[i]);
//		}
		
		System.out.println(scores.length);
		
		//총합과 평균?
		int sum=0;
		int avg=0;
		
//		names[0]="송혜교";
//		names[1]="박보검";
//		names[2]="장나라";
//		names[3]="신성록";
//		names[4]="김유정";
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<scores.length; i++) {
			System.out.print((i+1)+"번째 이름 입력하세요. ");
			names[i] = sc.next();
			scores[i] = (int)(Math.random()*100)+1;
			System.out.println(names[i]+" 학생의 점수는 "+scores[i]);
			sum += scores[i];
		}
		avg=sum/scores.length;
		System.out.println("총합: "+sum);
		System.out.println("평균: "+avg);
		
		String title [] = {"java", "Html5", "jsp", "sql", "css","jquery","hadoop","R","python"};
		
		System.out.println(title.length);
	}
}
