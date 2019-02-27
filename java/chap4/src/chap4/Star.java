package chap4;

public class Star {

	public static void main(String[] args) {
		int a = (int)(Math.random()*10)+1;
		
		
		System.out.println(a);
		for(int i=1; i<=a; i++)
		{
			int k=97;
			for(int j=1; j<=i; j++) {
				System.out.print((char)k);
				k++;
			}
			System.out.println();
		}
	}
}
