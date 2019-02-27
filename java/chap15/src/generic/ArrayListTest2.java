package generic;

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
public class ArrayListTest2 {
public static void main(String[] args) {
	//1. 여러 객체 저장 용도 또는 (ArrayListTest.java)
	//2. 1가지 타입 객체 저장 용도 (ArrayListTest2.java)
	//Emp 타입 데이터만 저장 & 객체들 개수 변동 많음.(따라서 배열 변수 x)
	
	ArrayList<Emp> list = new ArrayList <Emp>(5);
	
	Emp e1= new Emp(100, "홍길동0", 67000.99);
	Emp e2= new Emp(200, "홍길동1", 77000.99);
	Emp e3= new Emp(300, "홍길동2", 87000.99);
	
	//자동으로 5개에서 10개로 증가. 저장된 건 7개(이게 중요.)
	list.add(e1);
	list.add(e2);
	list.add(e3);

	System.out.println(list.size()+"개");
	System.out.println("==========================");
	for(int i=0; i<list.size(); i++) {
		System.out.println(list.get(i).name);
	}
	

}

}
