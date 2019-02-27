package chap4;

import java.util.Scanner;

public class SalaryTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String title =sc.next(); //사원 대리 과장 부장
		
		//사원: 급여 = 기본급 + 5000
		
		int baseSalary = 30000;
		int totalSalary = 0;
		//사원: totalSalary = 기본급 + 5000
		//대리: totalSalary = 기본급의 20% 증액
		//과장: totalSalary = 기본급의 1.5배
		//나머지: totalSalary = 기본급의 2배
		
		switch(title) {
		case "사원":
			totalSalary = baseSalary + 5000;
			break;
		case "대리":
			totalSalary = (int)(baseSalary * 1.2);
			break;
		case "과장":
			totalSalary = (int)(baseSalary * 1.5);
			break;
		default:
			totalSalary = baseSalary * 2;
		}
		
		System.out.println(title+" 직급의 급여는 "+totalSalary+"원 입니다.");

	}

}
