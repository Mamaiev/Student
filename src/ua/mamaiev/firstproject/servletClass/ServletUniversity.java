package ua.mamaiev.firstproject.servletClass;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletUniversity extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3370142237755521275L;

	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		try(PrintWriter out = response.getWriter()){
			String city = request.getParameter("City"); 
			String university = request.getParameter("university");
				if(city.isEmpty() | university.isEmpty()){
					out.println("Incorrectly entered data!");
				}		else{
					response.sendRedirect("allRight.html");
					}
				}catch(IOException e){
					e.printStackTrace();
				}
		
		}
	}

	
	

