package chap11;

import java.util.StringTokenizer;

public class SplitMethodTest {

	public static void main(String[] args) {
		String address="서울시:-강남구:- 역삼동:- 멀티캠퍼스;10층 1003호";
		//방법 1) split 메소드 사용
		String tokens [] = address.split(":-"); //배열로 저장해야 함!!!!!!
		//분리 문자가 반드시 한 개이어야 하는 것은 아님
		//":-"도 가능	

		System.out.println("분리된 token 개수: "+tokens.length);
		for(int i=0; i<tokens.length; i++) {
			System.out.println(tokens[i]);
		}
		System.out.println("------------------------------------------");
		//방법 2) StringTokenizer 사용: 객체 생성자, 메소드 필요
		StringTokenizer st = new StringTokenizer(address, ":-; ");//분리할 문자열, 기준 기호
		//단, split 메소드와의 차이점은
		//분리 문자가 두 개면 (or)로 인식함.
		//즉, :-이 기준 기호라면 :이 나와도 분리가 되고 -가 나와도 분리, 두 개 다 나와도 분리.
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {//st로 분리 된 다음 토큰 존재 여부(return 타입 boolean)
			String token = st.nextToken();//단, 이전 토큰을 읽는 previousToken()은 없다.
			//토큰 읽어 와라. -> 다음 토큰 존재 여부 -> 반복 
			//but 배열이 아니기 때문에 index로 접근 불가 & length 불가
			//hasMoreTokesn()가 false이면 끝!
			
			//따라서 hasMoreTokens()와 nextToken()은 필수!
			System.out.println(token);
		}
		
	}
}
