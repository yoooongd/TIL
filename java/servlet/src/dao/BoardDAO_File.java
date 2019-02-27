package dao;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import vo.BoardVo;

public class BoardDAO_File {
public void insertBoard(BoardVo vo) throws IOException{
		FileWriter fw = new FileWriter("board.txt",true);
		fw.write(vo.toString());//게시물 하나 저장
		fw.close();
		System.out.println(" ===> board.txt 파일에 게시물 저장을 완료했습니다.");
}
public BoardVo selectBoard(int seq) throws IOException{
	//5개이상 넣고 test
	//게시물 번호 전달:1-> 1번 게시물 BoardVo 타입으로 리턴
	//1. board.txt 파일 입력 객체 생성 filereader
	//2. 첫 번째 라인 입력 - 마지막 라인 (5개 반복) 5 줄의 String 생성됨
	//3. 각 라인 내용 =으로 분리 -> BoardVo 객체 생성
	//4. ArrayList<String> 타입 저장
	//2-4 반복
	//5. BoardVo 객체 <-ArrayList.get(0).getSeq() == seq
	//사용자가 검색한 3번 게시물이 있는지 검색
	//6. BoardVo 타입 리턴
	
	FileReader fr = new FileReader("board.txt");
	
	//파일-자바 데이터 타입 변환
	Scanner sc = new Scanner(fr);
	ArrayList<BoardVo> list = new ArrayList<BoardVo>();
	
	while(sc.hasNextLine()) {
		//다음 라인으로 이동 파일 끝까지 가랏
		String line = sc.nextLine();//한 줄 읽어옴
		String field [] = line.split("=");//분리
		BoardVo vo = 
				new BoardVo(Integer.parseInt(field[0]),field[1],field[2],Integer.parseInt(field[3]));
		//객체 생성
		list.add(vo);//리스트 저장
	}
	
	for(int i=0; i<list.size(); i++) {
		BoardVo vo = list.get(i);
		int voseq = vo.getSeq();
		if(voseq==seq) {
			return vo;
		}
	}
	return null;
	
}
}

