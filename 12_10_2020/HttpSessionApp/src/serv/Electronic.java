package serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Electronic")
public class Electronic extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<header>");
		out.print("<title>Elcetronic");
		out.print("</title>");
		out.print("</header>");
		out.print("<body>");
		out.print("<form action='Electtric' >");
		out.print("<input type='checkbox' name='pc' value='PC' >PC<br>");
		out.print("<input type='checkbox' name='tv' value='TV' >TV<br>");
		out.print("<input type='submit' value='Next' ><br>");	
		out.print("</form>");
		out.print("</body>");
		out.print("</html>");
	}

}
