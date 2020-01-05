package kr.or.connect.jdbc_deleteexam;

import kr.or.connect.jdbc_deleteexam.dao.RoleDao;

public class jdbc_deleteexam {
	public static void main(String[] args) {
		int roleId = 501;
		
		RoleDao dao = new RoleDao();
		int deleteCount = dao.deleteRole(roleId);
		
		System.out.println(deleteCount);
	}
}
