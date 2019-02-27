package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertTest {
public static void main(String[] args) {
	try {
	//0.JDBC DRIVER 호출
	Class.forName("oracle.jdbc.driver.OracleDriver");
	//1.DB 연결
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
	//localhost: 실행될(프로젝트 할) 컴퓨터의 ip
	System.out.println("연결성공");

	//2.SQL 전송
	//member테이블 생성
	
	//java 22222 염정아 010-444-5555 sysdate yun@multi.com
	//jdbc 3333 곽미향 010-777-8888 sysdate me@korea.com
	//	String sql = "insert into member values"
	//			+ " ('java',22222,'염정아','010-444-5555',sysdate, 'yun@multi.com')";
	
	//키보드 입력?!
	System.out.println("id pw name phone email 입력");
	Scanner sc = new Scanner(System.in);
	String line = sc.nextLine();
	String tokens[]=line.split(" ");
	
	String sql = "insert into member values"
			+ " (?, ?, ?, ?, sysdate, ?)";//아직 모른다 동적이다 키보드 입력 받겠다는 의미
	
	//sql 저장 - 전송 역할
	PreparedStatement pt = con.prepareStatement(sql);
	//? 값 setting(6번)
	//pt.setXXXX(1, 키보드 입력 1번째 값)
	
	pt.setString(1, tokens[0]);//id
	pt.setInt(2, Integer.parseInt(tokens[1]));//pw
	pt.setString(3, tokens[2]);//name
	pt.setString(4, tokens[3]);//phone 
	pt.setString(5, tokens[4]);//email
	
	//3. SQL 결과 검색
	//1 row inserted로 나옴. 이것의 개수를 저장할 것.
	int insertRow = pt.executeUpdate();
	System.out.println("삽입행의 개수 ="+insertRow);

	//4. DB 연결 해제
	con.close();
	System.out.println("연결 해제 성공");
	}catch(ClassNotFoundException e) {
		System.out.println(e.getMessage());
	}catch(SQLException e) {
		System.out.println(e.getMessage());
	}
}
}
