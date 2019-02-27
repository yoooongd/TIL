package chap5;

public class EqualTest {

	public static void main(String[] args) {
		int i = 10;
		int j = 10;
		double d = 10.0;
		
		//참조타입 변수: "new" 키워드 사용 데이터 저장
		//String : new 사용 & new 없이 둘다 가능.(자주 사용하기 때문에 예외적.)
		//하지만 메모리 구조상의 차이가 있다.
		String s1 = "java";
		String s2 = "java";
		String s3 = new String("java");
		String s4 = new String("JAVA");
		
		System.out.println(i==j);//true
		System.out.println(i==d);//true
		//i를 double로 자동 형 변환.
		//but i=="10"은 compile error
		//String은 기본 타입이 아닌 참조 타입이기 때문에 형변환 불가이기 때문.
		
		System.out.println(s1==s2);//true (주소 비교)
		System.out.println(s3==s4);//false (주소 비교)
		//왜 s1==s2는 true이고 s3==s4는 false일까?
		//메모리 구조상의 차이 때문.
		System.out.println(s1.equals(s2));//true (내용 비교)
		//!s1.equals(s2) : not equals
		System.out.println(s3.equals(s4));//true (내용 비교)
		//equalsIgnoreCase 대소문자 무시.
		//java는 대소문자를 구분하기 때문에 그냥 equals를 사용하면 false 출력.
		
		String s = null;
		System.out.println(s);//null을 출력 (아무것도 없음)
		//System.out.println(s.equals(s1));
		//java.lang.NullPointerException 에러
		//문자열이 없기 때문에 비교 불가능하다는 뜻.
	
		//s1=null;
		//s2=null;
		//s3=null;
		//s4=null;
		//메소드가 끝나지 않았기 때문에 stack에 변수는 살아 남아 있음. 힙 내용은 다 사라질 것(정리해도 좋다는 의미를 내포).
		//but 같은 번지를 참조하고 있는 s1과 s2는 둘다 null이 되지 않으면 heap 내용 사라지지 않는다.
		
	}

}
