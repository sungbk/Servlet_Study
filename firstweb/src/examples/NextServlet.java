package examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NextServlet
 */
@WebServlet("/next")
public class NextServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NextServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>form</title></head>");
		out.println("<body>");
		
		// request에게 맡겨놓았던 dice라는 이름의 Attribute를 해당 서블릿에서 가져온다
		// getAttribute의 리턴 타입은 Object값이므로 (Integer) 타입으로 Casting 수행 필요
		int dice = (Integer)request.getAttribute("dice");
		out.println("dice : " + dice);
		out.println("<br>");
		
		for(int i = 0; i < dice; i ++) {
			out.println("Hello<br>");
		}
		
		out.println("</body>");
		out.println("</html>");
	}
}
