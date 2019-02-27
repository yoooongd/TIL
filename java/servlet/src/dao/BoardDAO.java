package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import vo.BoardVo;

public class BoardDAO {
public void insertBoard(BoardVo vo) {
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		System.out.println("연결성공");
	
		String sql = "insert into board values ("
				+ "(select max(seq)+1 from board),?,?,?)";
		
		PreparedStatement pt = con.prepareStatement(sql);
		//? 값 setting(6번)
		//pt.setXXXX(1, 키보드 입력 1번째 값)
		
		//pt.setInt(1, vo.getSeq());//seq
		pt.setString(1, vo.getTitle());//title
		pt.setString(2, vo.getContents());//contents
		pt.setInt(3, vo.getViewcount());//viewcounts.
		
		pt.executeUpdate();

		con.close();
		System.out.println("연결 해제 성공");
		}catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	
	
}
public BoardVo selectBoard(int seq) {
	BoardVo vo = null;
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		System.out.println("연결성공");
		
		String sql = "select * from board where seq=?";
		PreparedStatement pt = con.prepareStatement(sql);
		
		pt.setInt(1, seq);
		
		//ResultSet 타입 결과 받음.
		ResultSet rs=pt.executeQuery();
		
		//위 결과를 BoardVo 객체 생성 => 맨 윗 줄에 이미

		if(rs.next()) {
			vo = new BoardVo(rs.getInt("seq"),rs.getString("title")
					,rs.getString("contents"),rs.getInt("viewcount"));
		}
		else {
			vo=new BoardVo(0, "0", "0", 0);			
		}
		
		System.out.println();
		
		con.close();
		System.out.println("연결 해제 성공");
		}catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	return vo;
}


public void updateBoard(String old, String newString) {
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		System.out.println("연결성공");
		
		String sql = "update board set title=?, contents=?"
				+ " where title like ? OR contents like ?" ;

		PreparedStatement pt = con.prepareStatement(sql);
		
		pt.setString(1, newString);
		pt.setString(2, newString);
		pt.setString(3, old);
		pt.setString(4, old);

		
		int insertRow = pt.executeUpdate();
		System.out.println("삽입/변경된 행의 개수 ="+insertRow);
		
		con.close();
		System.out.println("연결 해제 성공");
		}catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
}
}

