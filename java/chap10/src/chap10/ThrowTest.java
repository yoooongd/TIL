package chap10;

public class ThrowTest {

	public static void main(String[] args) {
		//1.예외 발생 상황 정해져있다.:처리 필요
		//System.out.println(10/0);//arithematicexception
		//2.메소드 예외 전달: 처리 필요
		//Class.forName("a");
		
		int id = -100;//-100, 0, ....
		try {
			if(id<=0) {
				//의도적, 강제적 예외 발생.
				//throw 객체생성 => 예외 생성
				throw new Exception("존재할 수 없는 사번");
				//비교: throws + 예외 클래스 (메소드 선언부)
				//throws Exception
		}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("사번: "+id);
	}

}
