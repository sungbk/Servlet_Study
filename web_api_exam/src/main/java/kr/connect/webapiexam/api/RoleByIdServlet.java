package kr.connect.webapiexam.api;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import kr.connect.webapiexam.dao.RoleDao;
import kr.connect.webapiexam.dto.Role;

@WebServlet("/Roles/*")
public class RoleByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RoleByIdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		
		/* Web API에서 /roles/{roleId} 요청시 처리용 */
		String pathInfo = request.getPathInfo();
		
		/* 전달받은 pathInfo값을 "/" 기호 기준으로 잘라서  roles 다음에 오는 문자열을 idStr에 입력 */
		String[] pathParts = pathInfo.split("/");
		String idStr = pathParts[1];
		int id = Integer.parseInt(idStr);
		
		RoleDao dao = new RoleDao();
		
		Role role = dao.getRole(id);
		
		ObjectMapper objectMapper = new ObjectMapper();
		String json = objectMapper.writeValueAsString(role);
		
		PrintWriter out = response.getWriter();
		out.println(json);
	}

}
