package filter.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GFGServlet")
public class GFGServlet extends HttpServlet
{
	
	private static final long serialVersionUID = 1L;
	public GFGServlet()
    {
        super();
    }
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>Welcome to the Servlet.");
        // This will print output on console
        System.out.println("GFGServlet is running");
	}
	
	
}
