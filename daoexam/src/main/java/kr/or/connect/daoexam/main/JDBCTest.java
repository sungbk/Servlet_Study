package kr.or.connect.daoexam.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.or.connect.daoexam.config.ApplicationConfig;
import kr.or.connect.daoexam.dao.RoleDao;
import kr.or.connect.daoexam.dto.Role;

public class JDBCTest {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		RoleDao roleDao = ac.getBean(RoleDao.class);
		
		Role role = new Role();
		role.setRoleId(500);
		role.setDescription("Programmerman");
		
		//아래 예제 코드들 모두 사용가능한 코드들이면 CRUD의 영향을 고려하여 하나씩만 주석 풀어서 테스트하기
		//int count = roleDao.insert(role);
		//System.out.println(count + "건 입력하였습니다");
		
		//int count = roleDao.update(role);
		//System.out.println(count + "건 수정하였습니다");

		//Role resultRole2 = roleDao.selectById(101);
		//System.out.println(resultRole2);
		
		//int deleteCount = roleDao.deleteById(500);
		//System.out.println(deleteCount + "건 삭제하였습니다.");	
	}
}
