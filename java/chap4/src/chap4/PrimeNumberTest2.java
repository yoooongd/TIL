package chap4;

public class PrimeNumberTest2 {

	public static void main(String[] args) {
		
		//su가 소수인지 판단하여 출력
				//13 : 소수이다.
				//13 % 1 == 0 && 13 % 13 == 0
				//13 % (1~13) == 0
		
		int su = (int)(Math.random()*100)+1;

		int j=0;
		
		int cntOfZero = 0;
		//System.out.println(su);
		//System.out.println();
		for(j=1; j<=su; j++)
		{
				if(j % su == 0) {
						cntOfZero++;
				}
			}
		
		
		if(cntOfZero==2) {
			System.out.println(su+" 소수");
		}
		else {
			System.out.println(su+" 소수 아님");
		}
	}
}

