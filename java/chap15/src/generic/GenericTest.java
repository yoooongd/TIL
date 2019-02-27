package generic;

class Box <T,E>{
	//전달 받아야할 타입이 여러 개여도 된다.
	//클래스가 아니라 타입 이름일뿐
	
	T contents;
	E classid;//공산품|농산물
	
	Box(T c){
		contents = c;
	}
	Box(T c, E id){
		contents=c;
		classid=id;
	}
	public void setContents(T c) {
		contents=c;
	}
	public T getContents() {
		return contents;
	}
}
class Paper{
	String size;
	Paper(String size){
		this.size=size;
	}
}
class Apple{
	String origin;
	Apple(String origin){
		this.origin=origin;
	}
}

public class GenericTest {
public static void main(String[] args) {
	Paper p = new Paper("A4");
	Apple a = new Apple("청송");
	
	Box<Paper, String> paperBox = new Box<Paper, String> (p,"공산품");
	Box<Apple, Integer> appleBox = new Box<Apple, Integer>(a, 100);
	
	Paper o1=paperBox.getContents();
	System.out.println(o1.size);
	System.out.println(paperBox.classid);//String
	
	Apple o2 = appleBox.getContents();
	System.out.println(o2.origin);
	System.out.println(appleBox.classid);//Integer
}
}
