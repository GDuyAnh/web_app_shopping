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
		String mod1 = request.getParameter("mod1");
		 List<User> users = new ArrayList<>();
		 System.out.println(mod1 + "mod1");
		if(mod1!=null) {
			if(mod1.equals("add")) {
				int id = Integer.parseInt(request.getParameter("txtid"));
				String name = request.getParameter("txtname");
				System.out.println("name : " + name);
				String phone = request.getParameter("txtphone");
				String gmail = request.getParameter("txtgmail");
				Boolean gender = Boolean.parseBoolean(request.getParameter("txtgender"));
				String address = request.getParameter("txtaddress");
				int age = Integer.parseInt(request.getParameter("txtage"));
				Boolean admin = Boolean.parseBoolean(request.getParameter("txtadmin"));
				double priceUser = Double.parseDouble(request.getParameter("txtpriceUser"));
				String username = request.getParameter("txtusernameregister");
				String password = request.getParameter("txtpasswordregister");
				
				ManagerUserDao.getInstance().addUser(new User(id, name, phone, gmail, gender, address, age, admin, username, password, priceUser));
				
				
				response.sendRedirect("Login.jsp");
				
			}
			if(mod1.equals("login")) {
				String username = request.getParameter("txtusername");
				String password = request.getParameter("txtpassword");
				System.out.println(username  + " username");
				System.out.println(password  + " password");
				
			   
			    
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
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
