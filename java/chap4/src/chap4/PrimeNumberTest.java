package chap4;

public class PrimeNumberTest {

	public static void main(String[] args) {

		int su = (int)(Math.random()*100)+1;

		// 과제 Q1. 2부터 난수까지 소수인지를 판단하여 출력.
				/* 예제
				 * 2: 소수이다
				 * 3: 소수이다
				 * ...
				 * 25: 소수 아니다.
				 * */
		
		int i=0;
		
		int cntOfZero = 0;
		System.out.println(su);
		System.out.println();
		for(int j=1; j<=su; j++)
		{
			cntOfZero=0;
			for(i=1; i<=j; i++) {
				if(j % i == 0) {
						cntOfZero++;
				}
			}
		
		
		if(cntOfZero==2) {
			System.out.println(j+"소수");
		}
		else {
			System.out.println(j+"소수 아님");
		}
	}
	}}	
