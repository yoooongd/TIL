package chap15;

import java.util.ArrayList;

class Emp{
	int id;//사번
	String name; //이름
	double pay; //급여
	public Emp(int id, String name, double pay) {
		this.id = id;
		this.name = name;
		this.pay = pay;
	}

	public String toString() {
		return (id+"-"+name+"-"+pay);
	}
	
}
public class ArrayListTest {
public static void main(String[] args) {
	//1. 여러 객체 저장 용도 
	ArrayList list = new ArrayList(5);
	list.add("java");//0
	list.add(100);//2
	list.add(3.14);//3
	list.add(1, "sql");//1
	
	Emp e1= new Emp(100, "홍길동0", 67000.99);
	Emp e2= new Emp(200, "홍길동1", 77000.99);
	Emp e3= new Emp(300, "홍길동2", 87000.99);
	
	//자동으로 5개에서 10개로 증가. 저장된 건 7개(이게 중요.)
	list.add(e1);
	list.add(e2);
	list.add(e3);
	
	list.remove(1);
	list.set(1, "newString");
	
	//boolean exists = list.contains("java");
	//System.out.println("java의 존재성 여부: "+exists);
	//int index = list.indexOf("java1");
	//System.out.println("java1의 인덱스: "+index);
	
	boolean exists2 = list.contains(e1);
	//System.out.println("Emp의 존재성 여부: "+exists2);//False(새롭게 객체를 만들어서 물어보는 것. 따라서 false)
	System.out.println("e1의 존재성 여부: "+exists2);//true
	
	System.out.println("==========================");
	System.out.println(list.size()+"개");
	for(int i=0; i<list.size(); i++) {
		System.out.println(list.get(i));
		
		//Emp 객체의 name 필드 변수를 출력
		if(list.get(i) instanceof Emp) {
			System.out.println(((Emp)list.get(i)).name);
		}
	}
	

}

}
