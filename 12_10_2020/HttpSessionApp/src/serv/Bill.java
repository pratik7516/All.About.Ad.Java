package serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Bill")
public class Bill extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<String> al = new ArrayList<>();
		
		HttpSession session = request.getSession(false);
		String p = (String)session.getAttribute("pc");
		if(p!=null) {
			al.add(p);
		}
		String t = (String)session.getAttribute("tv");
		if(t!=null) {
			al.add(t);
		}
		String f = (String)session.getAttribute("fan");
		if(f!=null) {
			al.add(f);
		}
		String c = (String)session.getAttribute("cooler");
		if(c!=null) {
			al.add(c);
		}
		
		String i = request.getParameter("iron");
		if(i!=null) {
			al.add(i);
		}
		
		String m = request.getParameter("mixer");
		if(m!=null) {
			al.add(m);
		}
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<header>");
		out.print("<title>Bill");
		out.print("</title>");
		out.print("</header>");
		out.print("<body>");
		
		out.print("<h1>Items : </h1>");
		for(String itm : al) {
			out.print("<h2>"+itm+"</h2>");
		}
		out.print("</body>");
		out.print("</html>");
	}

}
