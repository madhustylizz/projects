package com.to;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.control.Player;

/**
 * Servlet implementation class ServlerHibernet
 */
@WebServlet("/ServlerHibernet")
public class ServlerHibernet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServlerHibernet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher rd=null;
		try {
			Configuration con=new Configuration().configure();
			con.addAnnotatedClass(com.control.Player.class);
			StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder().applySettings(con.getProperties());
			SessionFactory factory=con.buildSessionFactory(builder.build());
			
			Session session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			Player p1=new Player(10,"Madhu","India",21);
			Player p2=new Player(20,"Veeresh","India",18);
			Player p3=new Player(30,"Hari","India",22);
			session.save(p1);
			session.save(p2);
			session.save(p3);
			
			transaction.commit();
			session.close();
			
			PrintWriter out=response.getWriter();
			rd=request.getRequestDispatcher("display.jsp");
			rd.include(request, response);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			rd=request.getRequestDispatcher("display.jsp");
			rd.include(request, response);
		}
		}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
