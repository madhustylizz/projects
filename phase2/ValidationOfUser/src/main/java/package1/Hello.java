package package1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Hello() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd=null;
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		if(email.equals("madhu@gmail.com") && password.equals("madhuuu")) {
			rd=request.getRequestDispatcher("SuccessServlet");
			rd.forward(request, response);
			
		}else {
			rd=request.getRequestDispatcher("index.html");
			
			PrintWriter out=response.getWriter();
			rd.include(request, response);
			
			out.print("<h2 <center><span style='color:red'>>Invalid Credantials....!</span></center></h2>");
		}
	}

}
