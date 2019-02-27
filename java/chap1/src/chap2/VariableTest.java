package chap2;

public class VariableTest {

	public static void main(String[] args) {
		int i = 100;
		double pi = 3.14;
		boolean b1 = true;
		char c1= 'a';//단일 따옴표
		i=200;
		System.out.println("i 변수=" + i);//문자열은 이중 따옴표
		b1 = i > pi;
		System.out.println("b1="+b1);
		System.out.println("c1="+c1);
		c1 = '가';
		System.out.println("c1="+c1);
		c1='\n';
		System.out.println("c1="+c1);
		b1 = i>c1;
		System.out.println("b1="+b1);
		
		char c2='a';//97
		char c3 = 'A';//65
		boolean b2 = c2>c3;
		System.out.println("c2>c3? " + b2);
		
		//숫자 영대문자 영소문자 한글
		
		int j = 2124252627;
		
	}

}
