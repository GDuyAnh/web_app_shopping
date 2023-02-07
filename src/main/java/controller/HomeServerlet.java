package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Item;
import dao.ManagerItemDao;

/**
 * Servlet implementation class HomeServerlet
 */
@WebServlet("/HomeServerlet")
public class HomeServerlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ManagerItemDao itemDao;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HomeServerlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if(request.getParameter("category") != null || request.getParameter("type") != null) {
			String categoryRecive = (String)request.getParameter("category");
			String type = (String)request.getParameter("type");
			if(type.equals("none")) {	//get products with all type
				if(categoryRecive == null) { 	// get all products
					List<Item> items = itemDao.getInstance().getItem();
					
					request.getSession().setAttribute("items", items);
					request.getSession().setAttribute("category", "AllItem");
					RequestDispatcher rd = request.getRequestDispatcher("itemsShow.jsp");
					rd.forward(request, response);
				}else {		// get products with single category
					List<Item> items = itemDao.getInstance()
											.getItemsWithWhereClause("WHERE item.category_id = " + categoryRecive);
					
					request.getSession().setAttribute("items", items);
					if(items!= null && items.size()>0) {
						request.getSession().setAttribute("category", "All " + items.get(0).getCategory());
					}
					RequestDispatcher rd = request.getRequestDispatcher("itemsShow.jsp");
					rd.forward(request, response);
				}
				
			}else {		//get products with single type
				if(categoryRecive == null){  	// get all products
					List<Item> items = itemDao.getInstance()
											.getItemsWithWhereClause("WHERE item.type = " + type);
					
					request.getSession().setAttribute("items", items);
					if(items!= null && items.size()>0) {
						request.getSession().setAttribute("category", "All " + items.get(0).getType() + " Products");
					}
					RequestDispatcher rd = request.getRequestDispatcher("itemsShow.jsp");
					rd.forward(request, response);
				}else { // get products with single type
					List<Item> items = itemDao.getInstance()
											.getItemsWithWhereClause("WHERE item.type = " + type + " AND " + "item.category_id = " + categoryRecive);
					
					request.getSession().setAttribute("items", items);
					if(items!= null && items.size()>0) {
						request.getSession().setAttribute("category", items.get(0).getType() + "'s " + items.get(0).getCategory());
					}
					RequestDispatcher rd = request.getRequestDispatcher("itemsShow.jsp");
					rd.forward(request, response);
				}
			}
			
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
			rd.forward(request, response);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
