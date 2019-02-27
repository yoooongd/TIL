package chap4;

public class ScoreTest {

	public static void main(String[] args) {
		//String name = "김학생";
		int kor = (int)(Math.random()*100)+1;
		int eng = (int)(Math.random()*100)+1;
		int mat = (int)(Math.random()*100)+1;
		int sum = kor + eng + mat;
		int avg = sum / 3;
		double avgD = (double)sum / 3;
		
		//System.out.println("이름: "+name);
		System.out.println("국어점수= "+kor);
		System.out.println("영어점수= "+eng);
		System.out.println("수학점수= "+mat);
		System.out.println("총점= "+sum);
		System.out.println("정수평균= "+avg);
		System.out.println("실수평균= "+avgD);
		
		System.out.println();
		//90이상 A 
		//80이상 90미만 B
		//70이상 80미만 C
		//60이상 70미만 D
		//60미만 미수료
		
		
/*		if(avg>=90) {
			System.out.println("A");
		}
		else if(avg>=80 && avg < 90) {
			System.out.println("B");
		}
		else if(avg>=70 && avg < 80) {
			System.out.println("C");
		}
		else if(avg>=60 && avg < 70) {
			System.out.println("D");
		}
		else {
			System.out.println("미수료");
		}*/
		int avg2 = avg / 10;
		
		switch(avg2) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("미수료");
		}
		
		
	}

}
