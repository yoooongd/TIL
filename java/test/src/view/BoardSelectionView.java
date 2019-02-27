package view;

import java.io.IOException;
import java.util.Scanner;

import dao.BoardDAO;
import vo.BoardVO;

public class BoardSelectionView {
	public void input() throws IOException{
		System.out.print("조회할 게시물의 번호 입력하세요.: ");
		Scanner s = new Scanner(System.in);
		int seq = s.nextInt();
		BoardDAO dao = new BoardDAO();
		BoardVO vo = dao.selectBoard(seq);
		System.out.println(vo);
	}
}
