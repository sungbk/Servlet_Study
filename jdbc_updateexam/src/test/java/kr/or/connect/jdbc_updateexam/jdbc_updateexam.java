package kr.or.connect.jdbc_updateexam;

import kr.or.connect.jdbc_updateexam.dao.RoleDao;
import kr.or.connect.jdbc_updateexam.dto.Role;

public class jdbc_updateexam {
	public static void main(String[] args) {
		int roleId = 102;
		String description = "Project Manager";
		
		Role role = new Role(roleId, description);
		
		RoleDao dao = new RoleDao();
		int updateCount = dao.updateRole(role);
		
		System.out.println(updateCount);
	}
}