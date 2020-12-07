
<jsp:useBean id="student" class="dto.Student" scope="session" ></jsp:useBean>
<jsp:setProperty  name="student" property="*" />


<%
	response.sendRedirect("show.jsp");
%>