package chap4;

public class SumTest {

	public static void main(String[] args) {
		
		int sum=0;
		int i = 0;
		
		for(i=1; i<=10; i=i+2) {
			sum += i;
		}
		System.out.println(i+" : "+sum);
	}

}
