package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.User;
import dao.ManagerUserDao;

/**
 * Servlet implementation class CheckLoginServlet
 */
@WebServlet("/CheckLoginServlet")
public class CheckLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ManagerUserDao DaoUser;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mod = request.getParameter("mod");
		List<User> users = new ArrayList<>();
		if(mod != null) {
			if(mod.equals("Login")) {
				String email = request.getParameter("txtemail");
				String password = request.getParameter("txtpassword");
				
				users = DaoUser.getInstance().getAllUser()
						.stream()
						.filter(o -> (o.getMail().equals(email) && o.getPassword().equals(password)))
						.toList();
				
				if(users.size() != 0) {
			    	System.out.println(users);
			    	
			    	request.getSession().setAttribute("user", users.get(0));
			    	
			    	response.sendRedirect("home.jsp");
			    }
			}
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
