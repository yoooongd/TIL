package view;

import java.io.IOException;
import java.util.Scanner;

import dao.BoardDAO;
import vo.BoardVO;

public class BoardInsertView {
	public void input() throws IOException{
		System.out.print("저장할 게시물의 내용을 입력하세요.: ");
		Scanner s = new Scanner(System.in);
		String line = s.nextLine();
		String tokens[] = line.split(":");
		BoardVO vo = new BoardVO(Integer.parseInt(tokens[0]),tokens[1],tokens[2],Integer.parseInt(tokens[3]));
		BoardDAO dao = new BoardDAO();
		dao.insertBoard(vo);
	}
}
