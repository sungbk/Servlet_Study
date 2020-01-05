package kr.or.connect.jdbc_insertexam.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.or.connect.jdbc_insertexam.dto.Role;

public class RoleDao {
	private static String dburl = "jdbc:mysql://localhost:3306/connectdb?serverTimezone=Asia/Seoul&useSSL=false";
	private static String dbUser = "connectuser";
	private static String dbpasswd = "connect123!@#"; 
	
	public int addRole(Role role) {
		int insertCount = 0;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String sql = "INSERT INTO role (role_id, description) VALUES (?,?)";
		
		try (Connection conn = DriverManager.getConnection(dburl, dbUser, dbpasswd);
				PreparedStatement ps = conn.prepareStatement(sql)) {
			
			ps.setInt(1, role.getRoldId());
			ps.setString(2, role.getDescription());

			insertCount = ps.executeUpdate();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return insertCount;
	}
}
