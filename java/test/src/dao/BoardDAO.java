package dao;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import vo.BoardVO;

public class BoardDAO {
public void insertBoard(BoardVO vo) throws IOException{
		FileWriter fw = new FileWriter("board2.txt",true);
		fw.write(vo.toString());//게시물 하나 저장
		fw.close();
		System.out.print(" ===> board.txt 파일에 게시물 저장을 완료했습니다.");
}
public BoardVO selectBoard(int seq) throws IOException{
	//5개이상 넣고 test
	//게시물 번호 전달:1-> 1번 게시물 BoardVo 타입으로 리턴
	FileReader fr = new FileReader("board2.txt");
	Scanner sc = new Scanner(fr);
	
	ArrayList<BoardVO> list = new ArrayList<BoardVO> ();
	while(sc.hasNextLine()) {
		String line = sc.nextLine();
		String fields [] = line.split("=");
		BoardVO vo =
				new BoardVO(Integer.parseInt(fields[0]), fields[1], fields[2], Integer.parseInt(fields[3]));
		list.add(vo);
	}
	
	for(int i=0; i<list.size(); i++) {
		//BoardVO vo2= list.get(i);
		//int voSeq = vo2.getSeq();
		if(list.get(i).getSeq()==seq) {
			return list.get(i);
		}
	}
	return null;

}
}
