package chap18;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileClassTest {
public static void main(String[] args) {
	//키보드로부터 입력 (파일명이나 디렉토리명 입력)(Scanner 사용)
	System.out.println("파일명이나 디렉토리명 입력");
	Scanner sc = new Scanner(System.in);
	String line = sc.nextLine();//한줄 내용 입력
	//만약 sc.next()로 할 거면 입력할 때 "경로" 이렇게 입력!
	
	try {
	//File 클래스 객체 생성
	File f = new File(line);
	if(f.exists()) {
		if(f.isFile()) {
			//파일이면 구현된 메소드 그대로 실행 결과 출력
			System.out.println(f.isFile());//true
			System.out.println(f.canRead());//true
			System.out.println(f.canWrite());//true
			System.out.println(f.length());//579(byte)
			System.out.println(f.getCanonicalPath());//경로추적
			System.out.println(f.getName());//FileClassTest.java
			System.out.println(f.lastModified());

			//날짜 표기 설정(이 부분은 외우기!!)
			long time = f.lastModified();// 1/1000초 단위
			Date timeDate = new Date(time); //Date 변환
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss"); //설정 포맷 출력
			String timeString = sdf.format(timeDate);
			System.out.println(timeString);
			}
		else {//f.isDirectory()
			//디렉토리라면 내부 리스트(파일, 디렉토리)들 출력(list 메소드 사용)
			String [] details = f.list();
			for(String s : details) {
				System.out.println(s);
			}
			}
		}
	else {
		System.out.println("존재하지 않음");
	}
		
	}catch(IOException e) {//IOException이 발생하면 해야할 일
		System.out.println(e.getMessage());
	}
}
}
