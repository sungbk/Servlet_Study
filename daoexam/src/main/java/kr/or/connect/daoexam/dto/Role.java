package kr.or.connect.daoexam.dto;

/**
 * @brief  DTO 코드
 * @details	한 건의 Role 동작구현을 위해 RoleDTO구현
 * @author Sung
 *
 */
public class Role {
	private int roleId;
	private String description;
	
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", description=" + description + "]";
	}
}
