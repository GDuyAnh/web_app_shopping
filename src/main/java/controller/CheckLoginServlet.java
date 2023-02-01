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
		if(request.getParameter("txtusername") != null && request.getParameter("txtpassword") != null ) {
			String username = request.getParameter("txtusername");
			String password = request.getParameter("txtpassword");
			System.out.println(username  + " username");
			System.out.println(password  + " password");
			
		    List<User> users = new ArrayList<>();
		    
		    users = DaoUser.getInstance().getAllUser()
		    		.stream()
		    		.filter(o -> o.getUserName().equals(username) && o.getUserPassword().equals(password))
		    		.toList();
		    if(users.size() == 1) {
		    	System.out.println(users);
		    	
		    	request.getSession().setAttribute("user", users.get(0));
		    	
		    	response.sendRedirect("index.jsp");
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
