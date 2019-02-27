package chap7;
class A{
	int va=10;
	void ma() {
		System.out.println("A 클래스");
	}
}
class B extends A{
	int vb=20;

	void ma() {
		System.out.println("B클래스");
	}
	void mb() {
		System.out.println("B클래스 추가 메소드");
	}
}
class C extends B{
	int vc=30;
	void ma() {
		System.out.println("C클래스");
	}

}
class D extends C{
	int vd=40;
	void ma() {
		System.out.println("D클래스");
	}
}

public class CastingTest {

	public static void main(String[] args) {
		A myarray [] =new A[4];
		myarray[0]=new A();
		myarray[1]=new B();//자동 형 변환
		myarray[2]=new C();//자동 형 변환
		myarray[3]=new D();//자동 형 변환
		//myarray[0] myarray[1] myarray[2] myarray[3] 모두 A 타입
		for(int i=0; i<myarray.length;i++) {
			System.out.println(myarray[i].va);
			myarray[i].ma();
			//오버라이딩 전, ma()는 A클래스에만 있었기 때문에 당연히 A클래스만 출력
			//오버라이딩 후, 순서대로 A클래스/B클래스/C클래스/D클래스 출력
			if(i==1) {
				System.out.println(((B)myarray[i]).vb);
				((B)myarray[i]).mb();			
			}
//			else if(i==2) {
//				C b1=(C)myarray[2];
//				System.out.println(b1.vc);
//			}
		}
	}

}


/*class E{
	void test(A v) {//->test(a1);
		
	}
	void call() {
		A a1=new A();
		test(a1);
		B b1=new B();
		test(b1);
		C c1=new C();
		test(c1);
		D d1=new D();
		test(d1);
		//모든 클래스가 A에 상속되어있기 때문에 test(a1/b1/c1/d1)모두 가능.
	}
}

 */
