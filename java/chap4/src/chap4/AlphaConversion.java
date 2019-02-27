package chap4;

public class AlphaConversion {

	public static void main(String[] args) {
		
		int a=(int)(Math.random()*200)+1;
		int b=a+32;
		int c=a-32;
		
		System.out.println(a);
		while(true) {
			if(a>=65 && a<=90) {
				System.out.println((char)a+"를 "+(char)b+"로 변경합니다.");
				break;
			}
			else if(a>=97 && a<=122) {
				System.out.println((char)a+"를 "+(char)c+"로 변경합니다.");
				break;
			}
			else if((a>=1 && a<=50)||(a>=150 && a<=200)){
				System.out.println((char)a+"+");
				break;
			}
			else {break;}
		
		}
		
		//System.out.println((char)97);
		//System.out.println((int)'z');
		//65~90 정수 = 영대문자 (영대문자+32=영소문자)
		//97~122 정수 = 영소문자
		//A => a
		//65 라면 'A'를 'a'로 변경합니다. 출력
		//97 이라면 'a'를 'A'로 변경합니다. 출력
		//1-50 이거나 150-200 사이면 종료
	}

}
