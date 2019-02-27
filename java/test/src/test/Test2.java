package test;

import java.util.ArrayList;

class SameSentence{
	String[] compare(ArrayList<String> list1, ArrayList<String> list2){
		String[] result = new String[10];
		int listSize;
		if(list1.size() > list2.size()) {
			listSize=list2.size();
		}
		else {//list1 개수와 list2 개수가 같거나 list1 개수가 더 작은 경우
			listSize=list1.size();
		}
		
		ArrayList<String> list3 = new ArrayList<String>();
		for(int i=0; i<listSize; i++) {
			if(list1.get(i).equals(list2.get(i))) {
				list3.add(list1.get(i));
			}
		}
		result = list3.toArray(new String[list3.size()]);
		//toArray(String[] a) ArrayList를 Array로 받는 메소드
		return result;
	}
	
}

public class Test2 {
public static void main(String[] args) {
	ArrayList<String> list1 = new ArrayList<String>();
	list1.add("자바는 객체지향 언어입니다");
	list1.add("우리는 키트리에서 자바를 배우는 중입니다");
	list1.add("오늘은 컬렉션 프레임워크를 배우죠! ");
	list1.add("내일은 입출력과 네트워크를 배울 예정입니다 ");
	
	ArrayList<String> list2 = new ArrayList<String>();
	list2.add("자바는 객체지향 언어입니다");
	list2.add("우리는 kitri에서 자바를 배우는 중입니다");
	list2.add("오늘은 콜렉션 프레임워크를 배우죠! ");
	list2.add("내일은 입출력과 네트워크를 배울 예정입니다 ");
	
	ArrayList<String> list3 = new ArrayList<String>();
	list3.add("자바는 객체지향 언어입니다");
	list3.add("우리는 kitri에서 자바를 배우는 중입니다");
	list3.add("오늘은 콜렉션 프레임워크를 배우죠! ");
	
	SameSentence ss = new SameSentence();
	String[] result1 = ss.compare(list1, list2);//list1, list2에서 같은 내용 출력	
	String[] result2 = ss.compare(list1, list3);//list3의 갯수만큼만 같은 내용 출력	
	
	for(int i=0; i<result1.length;i++) {
		System.out.println(result1[i]);
	}
	System.out.println("==============================");
	for(int i=0; i<result2.length;i++) {
		System.out.println(result2[i]);
	}
}

}
