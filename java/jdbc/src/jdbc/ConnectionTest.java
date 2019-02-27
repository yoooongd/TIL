package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
public static void main(String[] args) {
	try {
//	0. JDBC DRIVER 호출
	Class.forName("oracle.jdbc.driver.OracleDriver");
//	1. DB 연결
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
	//localhost: 실행될(프로젝트 할) 컴퓨터의 ip
	System.out.println("연결성공");
//	2. SQL 전송
//	3. SQL 결과 검색
//	>>필요하면 반복
//	4. DB 연결 해제
	con.close();
	System.out.println("연결 해제 성공");
	}catch(ClassNotFoundException e) {
		System.out.println(e.getMessage());
	}catch(SQLException e) {
		System.out.println(e.getMessage());
	}
}
}
