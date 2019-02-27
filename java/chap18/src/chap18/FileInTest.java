package chap18;

//import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
FileInTest: a.txt b.txt
=>입력 파일 존재x: 오류발생 -> 중단
<출력 결과>
a.txt (지정된 파일을 찾을 수 없습니다)
Exception in thread "main" java.lang.NullPointerException
	at chap18.FileInTest.main(FileInTest.java:50)

FileInTest: src/chap18/FileInTest.java copy.txt
=> 입력파일존재 o, 출력파일존재 x: empty 파일 생성

FileInTest: src/chap18/BoardTest.java copy.txt
=> 입력파일존재 o, 출력파일존재 o: 원래 저장된 내용 삭제 & b에 저장

FileInTest: src/chap18/SystemInTest.java copy.txt
=> 입력파일존재 o, 출력파일존재 o: 저장내용유지 & 추가출력
fw = new FileWriter(args[1], true)
*/


public class FileInTest {
public static void main(String[] args) {
	//try-catch로 처리 안해주면 exception 발생할 수 있어서 오류 남.
	//FileInputStream fr = null;
	//변수 선언은 메인 전체에서 해야한다. 전부 영문자로만 되어 있으면 FileInputStream 사용 가능
	
	FileReader fr = null;
	FileWriter fw = null;
		try {
			//현재프로젝트/src/chap18/FileInTest.java 입력
			//현재프로젝트/copy.txt 파일에 복사
			
		//1. *.java 파일 열기, copy.txt 파일 열기
			fr = new FileReader(args[0]);
			fw = new FileWriter(args[1], true);//없으면 만들어서 입력들어감 특별한 경로 없으니까 현재 프로젝트에 쏙
			
		//2. 파일 처음~끝 입력
			int result = 0;
			while((result=fr.read()) != -1) {
				//모니터출력
				System.out.print((char)result);
				
				//copy.txt 파일 출력 = 복사
				fw.write(result);//char로 형변환 필요없다.(2바이트 숫자값 & 자동 문자 변환)
				//임시메모리버퍼 저장
			}
			//int(1글자 2바이트 읽은 결과 숫자)
			//ex) 'a': 97 '가': 237
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {	
		//3. 파일 닫기 - 항상 실행문장
			try {
			fr.close();//파일 입력 완료 후 window 반납
			fw.close();//버퍼->저장 이동
			}catch(IOException e) {
				
			}
		}
}
}
