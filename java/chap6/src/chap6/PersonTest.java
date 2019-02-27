package chap6;

class Person{
	String name;
	int age;
	final static String nation="대한민국";//1개의 값 미리 정적 선언 -> 모든 객체가 공유
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class PersonTest {
	public static void main(String[] args) {
		System.out.println(Person.nation);//Person 객체인 p1을 만들기 전이지만 가능.
		//System.out.println(Person.name);//compile 오류(static이 아니라고)
		Person p1 = new Person("홍길동", 29);
		System.out.println("p1 객체의 이름: "+p1.name+" 나이: "+p1.age+" 국적: "+p1.nation);
		Person p2 = new Person("박보검", 23);
		System.out.println("p2 객체의 이름: "+p2.name+" 나이: "+p2.age+" 국적: "+p2.nation);
		
		//static 변수의 예
		//1) 원주율=3.14
		System.out.println(Math.PI);
		//2) 
		//자바 기본 변수: int (4바이트)
		//4바이트 = 32비트(부호 1비트, 값 31비트)
		//범위: -2^31 ~ 2^31-1
		System.out.println(Integer.MAX_VALUE);
	}
}
