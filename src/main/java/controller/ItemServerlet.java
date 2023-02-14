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
 * Servlet implementation class ItemServerlet
 */
@WebServlet("/ItemServerlet")
public class ItemServerlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ManagerItemDao itemDao;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ItemServerlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		List<Item> items = itemDao.getInstance().getItemsWithWhereClause("WHERE item.item_id = " + id);
		request.getSession().setAttribute("item", items.get(0));
		RequestDispatcher rd = request.getRequestDispatcher("itemDetail.jsp");
		rd.forward(request, response);
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
