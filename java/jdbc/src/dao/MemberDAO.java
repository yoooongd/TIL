package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.MemberVO;

public class MemberDAO {
public ArrayList<MemberVO> selectMember(){
	ArrayList<MemberVO> list = new ArrayList<MemberVO>();
	//member 모든 회원 복사 저장.
	//driver 호출, con 연결, sql 전송-실행결과-list-con 해제
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con 
			= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		
		System.out.println("연결성공");

		String sql = "select id, password, nvl(name,'무명') as name, nvl(phone,'010') phone, "
				+ "nvl(indate,sysdate) indate, nvl(email,'none') email from member";
		PreparedStatement pt = con.prepareStatement(sql);
		ResultSet rs=pt.executeQuery();
	
		while(rs.next()) {
			String id = rs.getString("id");
			int pw=rs.getInt(2);
			String name= rs.getString("name");
			String phone=rs.getString("phone");
			String indate=rs.getString("indate");
			String email=rs.getString("email");
			
			MemberVO vo = new MemberVO(id, pw, name, phone, indate, email);
			list.add(vo);
		}
		
		con.close();
		System.out.println("연결 해제 성공");
		
		}catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(SQLException e) {
			e.printStackTrace();
		}
	return list;	
}
}
