package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.OrderDetail;
import bean.User;
import dao.ManagerOrderDetailDao;

/**
 * Servlet implementation class OrderServlet
 */
@WebServlet("/OrderServlet")
public class OrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ManagerOrderDetailDao orderDao;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public OrderServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String order = request.getParameter("order");
		String bag = request.getParameter("bag");
		if (order != null) {
			if (order.equals("add")) {
				double price = Double.parseDouble(request.getParameter("txtpriceItemDetail"));
				int idItem = Integer.parseInt(request.getParameter("txtidItemDetail"));
				int iduser = Integer.parseInt(request.getParameter("txtiduser"));
				// ManagerOrderDetailDao.getInstance().addOrderDetail(price, idItem, iduser);
				response.sendRedirect("home.jsp");

			}
			if (order.equals("checkout")) {
				String[] listIDs = request.getParameterValues("txtcheckbox");
				for (int i = 0; i < listIDs.length; i++) {
					System.out.print(listIDs[i] + ", ");
				}
				System.out.println();
			}

		}
		if (bag != null) {
			if (bag.equals("bag")) {
				User user = (User) request.getSession().getAttribute("user");
				List<OrderDetail> ordeDetails = orderDao.getInstance().order_detail_show(user.getUser_id());
				request.getSession().setAttribute("ordeDetails", ordeDetails);

				response.sendRedirect("orderDetail.jsp");
			}
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
