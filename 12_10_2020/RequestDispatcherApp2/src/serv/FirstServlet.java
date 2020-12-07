package serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher rd = request.getRequestDispatcher("SecondServlet");
//		rd.forward(request, response);
		rd.include(request, response);
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.print("<h1>from First servlet</h1>");
		
		out.flush();
		out.close();
	}

}
