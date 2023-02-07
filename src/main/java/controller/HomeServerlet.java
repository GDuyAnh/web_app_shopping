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
		if (request.getParameter("category") != null || request.getParameter("type") != null) {
			String categoryRecive = (String) request.getParameter("category");
			String type = (String) request.getParameter("type");
			if (type.equals("none")) { // all products
				if (categoryRecive == null) {
					List<Item> items = itemDao.getInstance().getItem();
					System.out.println(items.get(0).getImages()[0]);
					request.getSession().setAttribute("items", items);
					RequestDispatcher rd = request.getRequestDispatcher("itemsShow.jsp");
					rd.forward(request, response);
				} else {
					List<Item> items = itemDao.getInstance().getItemByCategory(Integer.parseInt(categoryRecive));
					System.out.println(items.get(0).getImages()[0]);
					request.getSession().setAttribute("items", items);
					RequestDispatcher rd = request.getRequestDispatcher("itemsShow.jsp");
					rd.forward(request, response);

				}

			}else {
				if(categoryRecive == null) {
					List<Item> items = itemDao.getInstance().getItemBycondition("WHERE item.type = " + type );
					System.out.println(items.get(0).getImages()[0]);
					request.getSession().setAttribute("items", items);
					RequestDispatcher rd = request.getRequestDispatcher("itemsShow.jsp");
					rd.forward(request, response);
				}
				else {
					List<Item> items = itemDao.getInstance().getItemBycondition("WHERE item.type = " + type + " AND " + "item.category_id = " + categoryRecive);
					System.out.println(items.get(0).getImages()[0]);
					request.getSession().setAttribute("items", items);
					RequestDispatcher rd = request.getRequestDispatcher("itemsShow.jsp");
					rd.forward(request, response);

				}
				
				
			}

		} else {
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
