package chap10;

public class ExceptionTest {

	public static void main(String[] args) {
		//최소 2개 입력
		//0은 아니어야 한다.
		try {
			//예외발생 가능성 문장 정의
			//발생 x, try 블럭 수행
			//발생 o, try 중단- catch 블럭 수행
			int i = Integer.parseInt(args[0]);
			int j = Integer.parseInt(args[1]);
			System.out.println(i/j);
		}catch(ArrayIndexOutOfBoundsException e) {//얘는 별도
			System.out.println("두 개의 입력 변수가 필요합니다.");
		}finally {
			System.out.println("항상 출력");
		}
		System.out.println("main 완료");
		String s = null;
		String s2 = "java";
		//if(s.equals(s2)) {}
		int i []=null;
		//i=new int[5];
		i[0]=100;
	}
}

//		catch(Exception e) {//그 외의 종류 예외 발생시
//			System.out.println("모든 예외 동일 처리합니다.");
//		}
//		
		
		//ArrayIndexOutOfBounds Exception
		//하위 클래스 예외 처리 먼저
		//상위 클래스 예외 처리 나중
		//상속관계가 없다면 순서 상관 없다.
		
		
		/*catch(ArrayIndexOutOfBoundsException e) {//대신 처리 문장	
			//방법
			System.out.println("두 개의 입력 변수가 필요합니다.");
			//int i = Integer.parseInt("100");
			//e.printStackTrace();//예외가 발생한 라인, 블럭, 원인 메시지 추적 출력
		}catch(NumberFormatException e) {	
			System.out.println("0~9 사이의 값만 입력하세요");
		}catch(ArithmeticException e) {			
			System.out.println("0은 입력할 수 없습니다.");
		}*/
		

//aa bb 입력했을 때
//java.lang.NumberFormatException:
//100 하나만 입력했을 때
//java.lang.ArrayIndexOutOfBoundsException: 1
//100 0 입력 했을 때
//java.lang.ArithmeticException:
