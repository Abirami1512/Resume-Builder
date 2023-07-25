

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
 * Servlet implementation class Signup
 */

@WebServlet(name="Signup",urlPatterns={"/signup"})
public class Signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Signup() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("uname");
		String pass = request.getParameter("pass");
		PrintWriter pw = response.getWriter();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatrail","root","mySQL@2022");
			
			String ret = "select * from logininfo where name = ?";
			
			PreparedStatement ps1 = conn.prepareStatement(ret);
			
			ps1.setString(1, name);
			ResultSet rs = ps1.executeQuery();
			
			if (rs.next()) {    
			    pw.println("username already exists");  
			} 
			
			else {
				String insert = "Insert into loginInfo values(?,?);";
				
				PreparedStatement ps2 = conn.prepareStatement(insert);
				
				ps2.setString(1, name);
				ps2.setString(2, pass);
				ps2.executeUpdate();
				
				RequestDispatcher rd=request.getRequestDispatcher("main.jsp");  
				rd.forward(request, response);
				
				pw.close();
				
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
