package kr.or.connect.daoexam.dao;

//RoleDaoSqls객체에 선언된 변수를 클래스이름없이 사용하겠다
import static kr.or.connect.daoexam.dao.RoleDaoSqls.DELETE_BY_ROLE_ID;
import static kr.or.connect.daoexam.dao.RoleDaoSqls.SELECT_ALL;
import static kr.or.connect.daoexam.dao.RoleDaoSqls.SELECT_BY_ROLE_ID;
import static kr.or.connect.daoexam.dao.RoleDaoSqls.UPDATE;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import kr.or.connect.daoexam.dto.Role;

/*
 * DAO에서는 필두로 NamedParameterJdbcTemplate, SimpleJdbcInsert를 가지게 됨
 * 두 객체 모두 datasource를 필요로 하는데
 * 두 객체의 초기화는 RoleDao에서 수행
 * 두 객체로 RoleDao의 메소드 구현
 * SQL은 여기에 생성하지 않고 RoleDaoSqls의 상수로 정의해놓음으로
 * 향후 SQL이 변경될 경우 편하게 수정하도록 함
 * 한 건의 Role 동작을 위해 RoleDTO 구현
 * 
 * Dao를 실행할 때 NameParameterJdbcTemplate + SimpleJdbcInsert 객체들을 이용함
 * 
 * NameParameterJdbcTemplate: 전동적인 JDBC의 "?" 플레이스의 홀더	대신에
 * 이름있는 파라미터를 제공하기 위해서 JdbcTemplate를 감싸고 있음
 * 이 접근방법은 더 좋은 문서화를 제공하고 SQL 문에 다중 파라미터가 있을 때 사용하기가 쉽다.
 * 
 * SimpleJdbcInsert: Insert 동작을 수행하기 위해 사용되는 클래스
 */
@Repository
public class RoleDao {
	/* NameParameterJdbcTemplate 사용하기 위한용도의 코드 */
	private NamedParameterJdbcTemplate jdbc;
	private SimpleJdbcInsert insertAction;
	private RowMapper<Role> rowMapper = BeanPropertyRowMapper.newInstance(Role.class);
	
	public RoleDao(DataSource dataSource) {
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
		this.insertAction = new SimpleJdbcInsert(dataSource).withTableName("role");
	}
	
	public List<Role> selectAll() {
		// 쿼리문, 비어있는 맵, rowMapper (rowMapper는 select 한건 한건의 결과를 DTO에 저장하는 목적으로 사용)
		return jdbc.query(SELECT_ALL, Collections.emptyMap(), rowMapper);
	}
	
	public int insert(Role role) {
		SqlParameterSource params = new BeanPropertySqlParameterSource(role);
		return insertAction.execute(params);
	}
	
	public int update(Role role) {
		SqlParameterSource params = new BeanPropertySqlParameterSource(role);
		return jdbc.update(UPDATE, params);
	}
	
	public int deleteById(Integer id) {
		// Delete의 경우에는 "roleid" 딱 하나만 있으면 되므로 map 객체를 이용했음
		Map<String, ?> params = Collections.singletonMap("roleId", id);
		return jdbc.update(DELETE_BY_ROLE_ID, params);
				
	}
	
	public Role selectById(Integer id) {
		try {
			Map<String, ?> params = Collections.singletonMap("roleId", id);
			return jdbc.queryForObject(SELECT_BY_ROLE_ID, params, rowMapper);
			// select 했는데 해당 조건에 맞는 값이 없으면
			// 결과값이 제대로 넘어오지 않을 수 있기 떄문에 Exception 발생하므로
			// Exception 처리 수행문구 필요
		}catch(EmptyResultDataAccessException e) {
			return null;
		}
	}
}
