package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		String currentUrl = (String)request.getSession().getAttribute("currentUrl");
		String id = (String)request.getSession().getAttribute("id");
		String type = (String)request.getSession().getAttribute("type");
		String category = (String)request.getSession().getAttribute("category");
		
		String Url = "";
		if(currentUrl == null) {
			Url = "home.jsp";
		}else {
			Url += currentUrl + "?" + (id != null ? "id=" + id + "&" : "") + (type != null ? "type=" + type + "&" : "")+ (category != null ? "category=" + category : "");
		}
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
			    	response.sendRedirect(Url);
			    	
			    }
			}else if(mod.equals("Logout")) {
				request.getSession().setAttribute("user", null);
				//request.getSession().setMaxInactiveInterval(1);
				response.sendRedirect(Url);
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
