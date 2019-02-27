package chap7;

class C1{
	int i;
	C1(String s){
		System.out.println("C1생성자호출");
		i=10*10;
	}
}
class C2 extends C1{
	int j;
	C2(){
		super("aaa"); //C1(String) 생성자 호출
		//무조건 첫문장이어야 한다. 위치 옮기면 에러.
		//C1에서 생성자를 정의해주지 않아도 오류나지 않음. (기본생성자 때문)
		System.out.println("C2생성자호출");
		j=10*10*10;
	}
}
public class ConstructorTest {
	public static void main(String[] args) {
		
		C2 c=new C2();
		System.out.println(c.j);//1000
		System.out.println(c.i);//100 상위객체 생성, 상위 생성자 호출 실행
	}
}
