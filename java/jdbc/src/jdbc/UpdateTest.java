package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateTest {
public static void main(String[] args) {
	try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con 
		= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
	System.out.println("연결성공");

	//키보드 입력 (2개)
	//java 한서진
	//id가 java인 회원의 이름을 한서진으로 변경
	Scanner sc = new Scanner(System.in);
	System.out.print("아이디: ");
	String id = sc.next();
	System.out.print("이름: " );
	String name=sc.next();
	
	String sql = "update member set name=? where id=?";
	//sql 저장 - 전송 역할
	PreparedStatement pt = con.prepareStatement(sql);
	
	pt.setString(1, name);
	pt.setString(2, id);
	
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
