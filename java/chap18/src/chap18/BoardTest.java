package chap18;

import java.util.Scanner;

//xxxxVO=xxxDO=xxxDTO
//VALUE OBJECT = DATA OBJECT =DATA TRANSFER OBJECT
//=>게시물 1개 표현 여러 가지 값 저장 용도 객체
class BoardVO{//게시물 정보 필드 변수
	int seq;//게시물 번호
	String title;//제목
	String contents;//내용
	int viewcount;//조회수
	
	//생성자 정의
	BoardVO(){}
	BoardVO(int seq, String title, String contents, int viewcount) {
		this.seq = seq;
		this.title = title;
		this.contents = contents;
		this.viewcount = viewcount;
	}
	@Override
	public String toString() {
		return ("번호="+seq+" 제목="+title+" 내용="+contents+" 조회수="+viewcount);
	}
	
}

//XXXDAO: DATA ACCESS OBJECT (VO 접근 변수 사용)
//게시물 저장, 수정, 삭제, 조회 예제
class BoardDAO{
	public void insertBoard(BoardVO vo) {
		//출력 형태
		//번호=1 제목=게시물저장 내용=1개의 게시물을 저장합니다 조회수=0
		//===> 게시물 저장을 완료했습니다.
		//System.out.print("번호="+vo.seq+" 제목="+vo.title+" 내용="+vo.contents+" 조회수="+vo.viewcount);
		System.out.println(vo+" ===> 게시물 저장을 완료했습니다.");
	}
	
	//updateBoart라는 메소드로 수정
}

public class BoardTest {
public static void main(String[] args) {
	//1. 게시물 저장
	//2. 게시물 수정
	//3. 게시물 조회
	//번호 입력: 1
	//제목으로 검색: 저장 (저장이라는 단어를 포함하는 게시물을 조회.)
	
	System.out.println("게시물 정보를 입력하세요.");
	//Scanner생성
	Scanner sc = new Scanner(System.in);
	String line = sc.nextLine();//한줄 내용 입력
	//입력예시
	//1:게시물저장:1개의 게시물을 저장합니다.:0
	
	//BoardVO 객체로 생성
	//seq:title:contents:viewcount
	String tokens [] = line.split(":");
	BoardVO board 
	= new BoardVO(Integer.parseInt(tokens[0]),tokens[1],tokens[2],Integer.parseInt(tokens[3]));
	
	//BoardDAO객체 생성
	BoardDAO boardD = new BoardDAO();
	
	//insertBoard 메소드 호출(BoardVO 객체)
	boardD.insertBoard(board);
	
}
}
