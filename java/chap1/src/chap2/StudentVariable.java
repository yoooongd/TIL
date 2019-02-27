package chap2;

public class StudentVariable {

	public static void main(String[] args) {
		//1명 학생 정보 표현
		//학번 이름 전화번호 이메일 성적 총이수학점
		//상태: 재학(true)?졸업(false)?
		//변수 7개 선언
		
		String id = "20140589";
		String name = "이윤지";
		String phone = "010-9416-4730";
		String email = "tel4730@naver.com";
		double score = 4.5;
		int total = 147;
		boolean state = true;
		
		System.out.println("학번: "+ id +"\n이름: "+name
				+ "\n핸드폰 번호: "+phone+"\ne-mail: "+email+"\n학점: "+score+"\n총이수학점: "+total+"\n재학 상태: "+state);
		System.out.println();
		System.out.println("100" + 200+300);
		//더하기 연산자 중, string이 포함됐다면, 그 외도 string으로 판단.
		//즉, 200 300도 자동으로 string으로 판단된 것.
		System.out.println();
		
		int kor = 98;
		int eng = 99;
		int mat = 66;
		
		int sum = kor + eng + mat; //263
		
		//자바: 정수 연산 -> 결과 정수
		//sql, javascript, python:은 아님
		int avg = sum/3;
		
		System.out.println("총합= "+sum+"\n정수 평균= "+avg);
		
		//실수 평균?
		double dbavg = (double)sum/3;
		//double dbavg = sum/3.0;
		//double dbavg = sum/(double)3;
		System.out.println("실수 평균= "+dbavg);
		//반올림이 아니라 버린다.

	}

}
