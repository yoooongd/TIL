package chap11;

public class ObjectTest {
	public static void main(String[] args) {
		MyObject o1 = new MyObject("청년취업");
		MyObject o2 = new MyObject("아카데미");
		MyObject o3 = new MyObject("아카데미");
		
		System.out.println(o1);
		System.out.println(o2);

		if(o1==o2) {//false(주소가 다르기 때문)
			System.out.println("o1==o2");
		}
		
		//1. MyObject 타입 객체 전달하고
		//2. msg 변수 내용 같은지 비교
		if(o1.equals(o2)) {
			System.out.println("o1.equals(o2) 비교 같다.");
		}
		if(o2.equals(o3)) {
			System.out.println("o2.equals(o3) 비교 같다.");
		}
		if(o2.equals(new String("아카데미"))) {
			//전달을 받을 순 있지만,
			//타입이 다르기 때문에 false
			System.out.println("o2.equals(문자열) 비교 같다.");
		}
	}
}

class MyObject{
	String msg;
	MyObject(String msg){
		this.msg=msg;
	}
	public String toString() {
		return msg;
	}
	

	//Object는 모든 클래스의 상위 크래스이므로
	//모든 클래스가 밑에처럼 선언 가능
	public boolean equals(Object obj) {
		if(obj instanceof MyObject) {
			//o1.equals(new MyObject("A"))
			boolean result = msg.equals(((MyObject)obj).msg);
			//안에 선언해야함. 밖에 선언하면 String msg인 경우가 있을 수도 있음.
			//위의 equals는 String의 equals()
			return result;
		}
		else {
			//o1.equals(new String("A"))
			return false;
		}
		
	}
	
}
