package kr.or.connect.daoexam.dao;

public class RoleDaoSqls {
	// 상수는 대문자로 쓰는 관례는 C언어와 동일
	public static final String SELECT_ALL = "SELECT role_id, description FROM role order by role_id";
	// :description,  :roldId 가 나중에 바인딩될 부분임
	public static final String UPDATE = "UPDATE role set description = :description where role_id = :roleId";
	
	public static final String SELECT_BY_ROLE_ID = "SELECT role_id, description FROM role where role_id = :roleId";
	public static final String DELETE_BY_ROLE_ID = "DELETE FROM role WHERE role_id = :roleId";
}