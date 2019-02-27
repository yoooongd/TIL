package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTest2 {
public static void main(String[] args) {
	try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con 
		= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
	System.out.println("연결성공");

	//가입 회원 수 조회, 출력
	String sql = "select count(id) as cnt from member";
	PreparedStatement pt = con.prepareStatement(sql);
	
	ResultSet rs=pt.executeQuery();
	//rs.next();
	//첫번째 레코드 이동. 반복문을 사용할 필요는 없지만 한 번은 있어야 함.
	
//	while(rs.next()) {
//		//없기 때문에 false 이므로 실행되지 않을 것.
//	}
	con.close();
	System.out.println("연결 해제 성공");//연결 해제 되기 전에 모든 db 작업을 진행해야 한다.
	
	rs.next();
	System.out.println(rs.getInt("cnt"));
	
	}catch(ClassNotFoundException e) {
		System.out.println(e.getMessage());
	}catch(SQLException e) {
		e.printStackTrace(); // 오류의 원인 + 어디서 오류 났는지 출력(더 자세하다)
	}
}
}
