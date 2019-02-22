import javax.servlet.*;
import java.io.*;

public class add extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res)throws ServletException
	
	{
		try
		{
			PrintWriter out=res.getWriter();
			res.setContentType("text/html");
			out.println("<html>");
			out.println("<head><title> Addition</title></head>");
			out.println("<body>");
			out.println("<br><br><h1>Addition</h1>");
			int a,b,c;
			a=Integer.parseInt(req.getParameter("t1"));
			b=Integer.parseInt(req.getParameter("t2"));
			c=a+b;
			out.println("The sum is "+c);
			out.println("</body>");
			out.println("</html>");
		}catch(Exception ae){}
	}
}