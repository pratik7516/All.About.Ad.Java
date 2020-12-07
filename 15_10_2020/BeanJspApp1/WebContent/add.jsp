
<jsp:useBean id="student" class="dto.Student" scope="session" ></jsp:useBean>
<jsp:setProperty  name="student" param="rollNo" property="rno" />
<jsp:setProperty  name="student" param="name" property="studentName" />
<jsp:setProperty  name="student" param="fee" property="fee" />
<jsp:setProperty  name="student" param="crs" property="course" />

<%
	response.sendRedirect("show.jsp");
%>