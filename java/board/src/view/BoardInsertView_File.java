package view;

import java.util.Scanner;

import dao.BoardDAO;
import vo.BoardVo;

public class BoardInsertView_File {
public void input(){
	System.out.print("저장할 게시물의 내용을 입력하세요.: ");
	Scanner s = new Scanner(System.in);
	String line = s.nextLine();
	String tokens[] = line.split(":");
	BoardVo vo = new BoardVo(Integer.parseInt(tokens[0]),tokens[1],tokens[2],Integer.parseInt(tokens[3]));
	BoardDAO dao = new BoardDAO();
	dao.insertBoard(vo);
}
}
