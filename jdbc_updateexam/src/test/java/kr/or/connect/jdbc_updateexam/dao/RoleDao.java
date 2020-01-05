package kr.or.connect.jdbc_updateexam.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import kr.or.connect.jdbc_updateexam.dto.Role;

public class RoleDao {
	private static String dburl = "jdbc:mysql://localhost:3306/connectdb?serverTimezone=Asia/Seoul&useSSL=false";
	private static String dbUser = "connectuser";
	private static String dbpasswd = "connect123!@#"; 
	
	public int updateRole(Role role) {
		int updateCount = 0;
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(dburl, dbUser, dbpasswd);
			
			String sql = "UPDATE role set description = ? where role_id = ?";
			
			ps = conn.prepareStatement(sql);
			ps.setString(1, role.getDescription());
			ps.setInt(2,  role.getRoldId());
			updateCount = ps.executeUpdate();
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			if(ps != null) {
				try {
					ps.close();
				} catch(Exception ex) {}
			}
			
			if(conn != null) {
				try {
					conn.close();
				} catch(Exception ex) {}
			}
		}
		return updateCount;
	}
}