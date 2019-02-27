package main;

import java.io.IOException;
import java.util.Scanner;

import view.BoardInsertView;
import view.BoardSelectionView;

public class BoardMain {

	public static void main(String[] args)throws IOException {
		while(true) {
			//1:게시물저장: 1개의 게시물을 저장합니다:0
			System.out.println("----게시물 메뉴-----");
			System.out.println(" 1.게시물 저장");
			System.out.println(" 2.게시물 조회");
			System.out.println(" 3.프로그램 종료");
			System.out.print(" 번호 입력: ");
			
			Scanner sc = new Scanner(System.in);
			int menu = sc.nextInt();
			
			if(menu == 1) {
				BoardInsertView view = new BoardInsertView();
				view.input();
			}
			else if(menu == 2) {
				System.out.println("게시물 조회 기능 선택 ");
				BoardSelectionView view = new BoardSelectionView();
				view.input();
			}
			else if(menu ==3) {
				System.out.println("프로그램 종료 ");
				System.exit(0);
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
			}
			
			}

	}

}
