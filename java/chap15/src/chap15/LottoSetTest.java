package chap15;

import java.util.HashSet;
import java.util.Iterator;

public class LottoSetTest {
public static void main(String[] args) {
	//1~45 난수 발생: 6개
	
	HashSet<Integer> lotto = new HashSet<Integer>();//HashSet만 사용할 거면 이거
	//HashSet은 Set 인터페이스를 상속받고 있기 때문에
	//Set<Integer> lotto = new HashSet<Integer>(); 가능
	
	//중복 허용하지 않는 6개의 로또 번호 생성 & 저장
	while(true) {
		int ran = (int)(Math.random()*45)+1;//1~45 난수
		lotto.add(ran);
		System.out.println(ran+":"+lotto.size());
		if(lotto.size()==6) break;
	}
	System.out.println("===============");
	
	//조회1
	Iterator <Integer> it = lotto.iterator();
	while(it.hasNext()) {
		//set 내부 다음 데이터 존재여부.
		Integer in = it.next();
		System.out.println(in);
	}
	System.out.println("===============");
	
//	for(int i=0; i<lotto.size(); i++) {
//		//lotto.get(i);//HashSet은 인덱스가 없기 때문에 get 메소드 불가능
//	}
	
	//조회2: jdk 1.5 이후 추가된 문법.
	for(Integer i : lotto) {
		//lotto에 있는 것들을 lotto 크기만큼 반복하겠다.
		//lotto 안의 데이터는 Integer type 이므로 Integer i 라고 선언
		//하고 i를 반복 출력
		System.out.println(i);
	}
}
}
