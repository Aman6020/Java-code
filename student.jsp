<html>
<body>
<jsp:useBean id="mybean" class="mypack.studentBean"
scope="session"/>
<jsp:setProperty name="mybean" property="*"/>
<%
if (mybean.register())
out.println("record register successfully");
else
out.println("record could not be registered");

%>
<br>
<a href="record.jsp">view the register record</a>
</body>
</html>

