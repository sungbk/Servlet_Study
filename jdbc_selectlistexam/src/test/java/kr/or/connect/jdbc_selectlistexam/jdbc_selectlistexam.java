package kr.or.connect.jdbc_selectlistexam;

import java.util.List;

import kr.or.connect.jdbc_selectlistexam.dao.RoleDao;
import kr.or.connect.jdbc_selectlistexam.dto.Role;

public class jdbc_selectlistexam {
	public static void main(String[] args) {
		RoleDao dao = new RoleDao();
		
		List<Role> list = dao.getRoles();
		
		for(Role role : list) {
			System.out.println(role);
		}
	}
}
