package chap15;

import java.util.HashMap;
import java.util.Set;

public class PhoneMapTest {
public static void main(String[] args) {
	String[] p1 = {"010-1234-5678","02-456-7891","031-123-5555","kim@multi.com"};
	String[] p2 = {"010-8144-5612","02-426-7290","032-123-5548","song@multi.com"};
	String[] p3 = {"010-7148-5546","02-826-5795","033-123-5456","jun@multi.com"};
	
	HashMap<String, String[]> map = new HashMap <String, String[]> ();
	//키 값 중복 불가.
	map.put("김태리", p1);
	map.put("송혜교", p2);
	map.put("전지현", p3);
	map.put("김태리", new String[] {"","",""});
	//키가 중복되면 값을 수정한다고 생각 함.
	//따라서 put 메소드는 두 가지 용도로 쓰인다. 넣기, 수정하기
	
	map.put("이자바", p1);
	//값은 중복 허용.
	
	System.out.println(map.size());
	//김태리-"010-1234-5678"-"02-456-7891"-"031-123-5555"-"kim@multi.com"
	//map의 모든 사람 조회.
	//map의 모든 키값 조회-키 내부 Set(따라서 키 값 중복 불가)
	Set<String> keys= map.keySet();
	for(String k:keys) {//모든 이름 조회
		String [] result = map.get(k);
		System.out.print(k);
		for(String s:result) {//각 이름 키 전화번호 목록 배열 조회
			System.out.print(" - "+s);
		}
		System.out.println();
	}
	
	
}
}
