package kr.or.connect.jdbc_insertexam;

import kr.or.connect.jdbc_insertexam.dao.RoleDao;
import kr.or.connect.jdbc_insertexam.dto.Role;

public class jdbc_insertexam {
	public static void main(String[] args) {
		int roledId = 501;
		String description = "CTO";
		
		Role role = new Role(roledId, description);
		
		RoleDao dao = new RoleDao();
		int insertCount = dao.addRole(role);
		
		System.out.println(insertCount);
	}
}