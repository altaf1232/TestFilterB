package filter.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GFGFilter implements Filter
{


	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L; 
	public void init(FilterConfig filterConfig)throws ServletException
	{
		
	}
	public void doFilter(ServletRequest req,ServletResponse res,FilterChain chain)throws IOException, ServletException 
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		  
        // This will print output on console
        System.out.println(
            "Before filter - Preprocessing before servlet");
        // some authentication if required
        chain.doFilter(req, res);
     // This will print output on console
        System.out.println(
            "After servlet - Following code will execute after running the servlet - PostProcessing"); 
    }
 
	public void destroy() 
	{
		System.out.println("this is ya destroy method");
	}
	
   
   
   

}
