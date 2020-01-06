package examples;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class frontServlet
 */
@WebServlet("/front")
public class frontServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public frontServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int diceValue = (int)(Math.random() * 6) + 1;
		// 값을 맡김
		request.setAttribute("dice", diceValue);
		
		// request 객체 내용을 다른 서블릿으로 넘겨준다
		// 포워드할 경로는 반드시 "/" 로 시작해야한다
		RequestDispatcher requestDisatcher = request.getRequestDispatcher("/next");
		requestDisatcher.forward(request, response);
	}

}
