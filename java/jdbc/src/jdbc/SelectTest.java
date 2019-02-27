package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javax.print.attribute.standard.PrinterIsAcceptingJobs;

public class SelectTest {
public static void main(String[] args) {
	try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con 
		= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
	System.out.println("연결성공");

	String sql = "select id, to_char(nvl(indate,sysdate),'yyyy/mm/dd') as indate"
			+ " from member where id like ?";
	
	//PreparedStatement객체 - sql 저장, 전송, 결과
	PreparedStatement pt = con.prepareStatement(sql);
	
	//? 값 매핑(오라클 드라이버: " " -> ' ' 변환)
	pt.setString(1,"ora%");
	
	//sql 전송,실행
	ResultSet rs=pt.executeQuery();
	//테이블 구조 리턴.
	//next, getXXX()
	//rs 생성: 레코드 포인터 첫번째 이전 위치
	
	while(rs.next()) {
		String id = rs.getString("id");
//		int pw=rs.getInt(2);//column index
//		String email=rs.getString("email");
//		String phone=rs.getString("phone");
		String indate=rs.getString("indate");
		//함수를 적용했으면 열의 인덱스만 적으면 된다.
		
//		String name= rs.getString("name");
//		System.out.println(id+"-"+pw+"-"+name+"-"+email+"-"+phone+"-"+indate);
		
		//조건
		//1)id 값 : yyyy/mm/dd
		//2)indate : null이면 오늘 날짜로 변경해서 출력
		System.out.println(id+":"+indate);
	}

	con.close();
	System.out.println("연결 해제 성공");
	}catch(ClassNotFoundException e) {
		System.out.println(e.getMessage());
	}catch(SQLException e) {
		//System.out.println(e.getMessage()); //오류의 원인
		e.printStackTrace(); // 오류의 원인 + 어디서 오류 났는지 출력(더 자세하다)
	}
}
}
