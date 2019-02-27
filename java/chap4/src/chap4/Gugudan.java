package chap4;

public class Gugudan {

	public static void main(String[] args) {
		//2~9단 구구단 출력. 
		//5단 이후 출력 x
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				if(j==5) {break;}
				System.out.print(j+"*"+i+"="+(j*i)+"\t");
			}
			System.out.println();
			//System.out.println(2+"*"+i+"="+(2*i));
		}
		System.out.println("구구단을 종료합니다.");
	}
}
