

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Dashboard
 */
public class Dashboard extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Dashboard() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pan=request.getParameter("pan");
		RequestDispatcher rd=null;
		
		if(pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}"))  {   //GYOPM1532F
		PrintWriter out=response.getWriter();
		out.print("<h1 style=color:blue>The PAN you entered "+pan+" is Valid </h1>");
		}else {
			
			PrintWriter out=response.getWriter();
			rd=request.getRequestDispatcher("index.html");
			rd.include(request,response);
			
			
			out.print("<h1 style='color:red'>Please Enter Valid PAN Number</h1>");
			
		}
		
		
		
	}

}
