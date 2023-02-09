package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.OrderDetail;
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String order = request.getParameter("order");
		if(order != null) {
			if(order.equals("add")) {
				double price = Double.parseDouble(request.getParameter("txtpriceItemDetail"));
				int idItem = Integer.parseInt(request.getParameter("txtidItemDetail"));
				int iduser = Integer.parseInt(request.getParameter("txtiduser"));
				System.out.println("price: " + price + ", idItem: " + idItem + ", iduser: " + iduser);
				//ManagerOrderDetailDao.getInstance().addOrderDetail(price, idItem, iduser);
				
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
