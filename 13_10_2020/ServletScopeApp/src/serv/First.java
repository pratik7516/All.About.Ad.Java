package serv;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/First")
public class First extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("req", "from request scope");
		
		HttpSession session = request.getSession(true);
		session.setAttribute("ses", "from Session Scope");
		
		ServletContext cntx = request.getServletContext();
		cntx.setAttribute("cont", "from ServletContext scope");
		 
//		RequestDispatcher rd = 
//				request.getRequestDispatcher("Second");
//		rd.forward(request, response);
		
		response.sendRedirect("Second"); 
		
		
	}

}
