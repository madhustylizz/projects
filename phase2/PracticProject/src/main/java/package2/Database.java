package package2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Database
 */
public class Database extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Database() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			Connection con=(Connection) new DatabaseConnection("jdbc:mysql://localhost:3306/madhu","root","madhu");
			PreparedStatement st=con.prepareStatement("insert into hello values(?,?,?)");
			ResultSet rs=st.executeQuery();
			st.setInt(1, Integer.valueOf(request.getParameter("id")));
			st.setString(2, request.getParameter("string"));
			st.setInt(3, Integer.valueOf(request.getParameter("salary")));
			
			 PrintWriter out=response.getWriter();
			
			
	       
	        out.println("<html><body><center><b>Successfully Inserted"
                    + "</b></center></body></html>");
	        st.close();
			con.close();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
