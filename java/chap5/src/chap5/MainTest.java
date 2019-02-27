package chap5;

public class MainTest {

	public static void main(String[] args) {
		System.out.println("입력변수의 갯수: "+args.length);
		
		for(int i=0; i<args.length; i++) {
			System.out.println("입력변수 출력: "+args[i]);
		}
		// 100 200 => 300
		//외부 입력 데이터(다양한 형태:String) => 300출력
		//자동 형 변환 / 명시적 형 변환 : 기본타입만 가능. String은 기본타입 아님!
		//String -> int: 정수 변경 결과 <- Integer.parseInt("100")
		
		System.out.println(args[0]+args[1]);
		int first = Integer.parseInt(args[0]);
		int second = Integer.parseInt(args[1]);
		System.out.println(first+second);
		
		double third = Double.parseDouble(args[2]);
		System.out.println(third+third);
	}
}
