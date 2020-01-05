package kr.or.connect.jdbc_deleteexam;

import kr.or.connect.jdbc_deleteexam.dao.RoleDao;

public class jdbc_deleteexam {
	public static void main(String[] args) {
		/* 여기에 정의된 Role ID값의 요소를 삭제할 것임 */
		int roleId = 500;
		
		RoleDao dao = new RoleDao();
		int deleteCount = dao.deleteRole(roleId);
		
		System.out.println(deleteCount);
	}
}
