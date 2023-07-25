

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * Servlet implementation class HelloServlet
 */

@WebServlet(name="login",urlPatterns={"/login"})
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("t1");
		String pass = request.getParameter("pass");
		int flag = 0;
		
		String b = request.getParameter("b1");
		if(b.equals("signup"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("signup.jsp");  
			rd.forward(request, response);
		}
		else if(b.equals("proceed"))
		{
		
			PrintWriter pw = response.getWriter();
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatrail","root","mySQL@2022");
				
				
				String ret = "select * from logininfo where name = ?";
				
				PreparedStatement ps = conn.prepareStatement(ret);
				
				ps.setString(1, name);
				ResultSet rs = ps.executeQuery();
				
				String password;
				
				while(rs.next())
				{
					password = rs.getString(2);
					//pw.println(pass+" "+password);
					if(password.equals(pass))
					{   
						flag = 1;
						break;
					}
				}
				
				if(flag == 1)
				{
					RequestDispatcher rd=request.getRequestDispatcher("main.jsp");  
					rd.forward(request, response);
				}
				else {
					pw.println("Enter correct details");
				}
				
				pw.close();
				
			}
				catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
		else {
			System.out.println("Error in login page");
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
