package view;

import java.util.Scanner;

import dao.BoardDAO;
import vo.BoardVo;

public class BoardSelectView {
public void input() {
	System.out.print("조회할 게시물의 번호 입력하세요.: ");
	Scanner s = new Scanner(System.in);
	int seq = s.nextInt();
	BoardDAO dao = new BoardDAO();
	BoardVo vo = dao.selectBoard(seq);
	System.out.println(vo);
	
		
}
}
