package kr.or.connect.jdbc_deleteexam.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class RoleDao {
	private static String dburl = "jdbc:mysql://localhost:3306/connectdb?serverTimezone=Asia/Seoul&useSSL=false";
	private static String dbUser = "connectuser";
	private static String dbpasswd = "connect123!@#";
	
	public int deleteRole(Integer roleId) {
		int deleteCount = 0;
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dburl, dbUser, dbpasswd);
			
			String sql = "DELETE FROM role WHERE role_id = ?";
			
			ps = conn.prepareStatement(sql);
			ps.setInt(1, roleId);
			deleteCount = ps.executeUpdate();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if(ps != null) {
				try {
					ps.close();
				} catch (Exception ex) {}
			}
			
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception ex) {}
			}
		}
		
		return deleteCount;
	}
}
