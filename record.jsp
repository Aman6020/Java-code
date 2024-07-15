<html>
<body>
<jsp:useBean id="mybean" class="mypack.student_bean"scope="session"/>
Registered Record as Follow: 
<table>
<tr>
<th>name </th>
<th>Rollno</th>
<th>Marks</th>
<th>Grade</th>
</tr>
<tr>
<td><jsp:getProperty name="mybean" property="name"/></td>
<td><jsp:getProperty name="mybean" property="rollno"/></td>
<td><jsp:getProperty name="mybean" property="marks"/></td>
<td><jsp:getProperty name="mybean" property="grade"/></td>
</tr>
<a href="index.html">Add more record</a>
</body>
</html>