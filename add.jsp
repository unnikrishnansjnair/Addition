<%@ page language="java"  import="javax.servlet.*"%>

<html>
	<head><title>Addition</title></head>
	<body>
		<h1>Addition</h1>
		<%
			int a,b,c;
			a=Integer.parseInt(request.getParameter("t1"));
			b=Integer.parseInt(request.getParameter("t2"));
			c=a+b;
			out.println("The sum is :"+c);
		%>
	</body>
</html>
