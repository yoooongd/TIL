package view;

import java.util.Scanner;

import dao.BoardDAO;
import vo.BoardVo;

public class BoardUpdateView {
public void input(){
//자바:JAVA
//>>의미: title, contents 컬럼에 자바를 포함한다면 => 제목과 내용을 JAVA로 수정
	System.out.print("수정할 게시물의 내용을 입력하세요.: ");
	Scanner sc = new Scanner(System.in);
	String line = sc.nextLine();
	String tokens[] = line.split(":");
	BoardDAO dao = new BoardDAO();
	dao.updateBoard(tokens[0], tokens[1]);
}
}
