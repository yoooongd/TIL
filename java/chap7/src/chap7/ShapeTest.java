package chap7;

abstract class Shape{
	abstract void area();//면적
	abstract void circum();//둘레
}
class Rectangle extends Shape{
	int width;//가로
	int height;//세로
	Rectangle(int w, int h){
		width=w;
		height=h;
	}
	void area() {
		//더 넓은 범위인 protected/public void area()도 가능.
		//private만 안 됨.
		double area=width*height;
		System.out.println("가로: "+width+" 세로: "+height+"인 사각형의 넓이: "+area);
	}
	void circum() {
		double circum=(width+height)*2;
		System.out.println("가로: "+width+" 세로: "+height+"인 사각형의 둘레: "+circum);
	}
	
}
class Circle extends Shape{
	int r;//반지름 필드 변수
	Circle(int r){
		this.r=r;
	}
	void area() {//area=r^2*pi
		double area=r*r*Math.PI;//java.lang.Math.PI
		System.out.println("반지름이 "+r+"인 원의 면적= "+area);
	}
	void circum() {//2*pi*r
		double circum=2*Math.PI*r;
		System.out.println("반지름이 "+r+"인 원의 둘레= "+circum);
	}
}
public class ShapeTest {

	public static void main(String[] args) {
		Shape s = null;

		if((args.length==2) && (args[0].equals("cir"))) {
			s = new Circle(Integer.parseInt(args[1]));
		}
		else if((args.length==3) && (args[0].equals("rec"))) {
			s = new Rectangle(Integer.parseInt(args[1]),Integer.parseInt(args[2]));
		}
		//공통 기능 메소드 호출, but 결과는 다르다.
		s.area();
		//if가 실행됐다면 if문의 area가
		//else if가 실행됐다면 else if문의 area가 출력된다.
		s.circum();
	}
	
}
