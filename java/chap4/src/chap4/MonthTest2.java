package chap4;

public class MonthTest2 {

	public static void main(String[] args) {
		int month = (int)(Math.random()*12)+1;
		//예시 1월은 31일까지 존재합니다. 1, 3, 5, 7, 8, 10, 12
		//4, 6, 9, 11 중 하나이면 30일까지 존재합니다.
		//2이면 28일까지 존재합니다.
		//switch case문 사용
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month+"월은 31일까지 존재합니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month+"월은 30일까지 존재합니다.");
			break;
		default:
			System.out.println(month+"월은 28일까지 존재합니다.");
		}
	}

}
