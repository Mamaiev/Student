package ua.mamaiev.firstproject.servletClass;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet extends HttpServlet   {

	/**
	 * 
	 */
	private static final long serialVersionUID = 404002602186152958L;

	/**
	 * 
	 */
	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try(PrintWriter out = response.getWriter()){
		 
		String Login = request.getParameter("Login");
		String Password = request.getParameter("Password");
			if(Login.isEmpty() | Password.isEmpty()){
				out.println("Incorrectly entered data!");
			}		else{
				response.sendRedirect("university.html");
				}
			}catch(IOException e){
				e.printStackTrace();
			}
	
	}
}
