package kr.connect.webapiexam.api;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import kr.connect.webapiexam.dao.RoleDao;
import kr.connect.webapiexam.dto.Role;

/**
 * Servlet implementation class RolseServlet
 */
@WebServlet("/Rolse")
public class RolseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RolseServlet() {
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
		
		RoleDao dao = new RoleDao();
		
		List<Role> list = dao.getRoles();
		
		/* JSON 문자열로 바꾸거나, JSON 문자열을 객체로 바꿔주는 객체 */
		ObjectMapper objectMapper = new ObjectMapper();
		
		/* 파라미터로 list를 넘겨주면 해당 list가 JSON문자열로 바뀌어서 리턴 */
		String json = objectMapper.writeValueAsString(list);
		
		PrintWriter out = response.getWriter();
		out.println(json);
		out.close();
	}

}
