package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Catalory;
import bean.Item;
import bean.Item1;
import bean.User;
import dao.ManagerItemDao;
import dao.ManagerUserDao;

/**
 * Servlet implementation class ManagerServlet
 */
@WebServlet("/ManagerServlet")
public class ManagerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ManagerUserDao Dao;
	ManagerItemDao DaoItem;

	public ManagerServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String mod = request.getParameter("mod");
		String person = request.getParameter("person");
		String search = request.getParameter("txtsearch");
		String showByKey = "";
		System.out.println(mod);

		if(search != null) {
			String searchValue = search;
			List<Item1> itemsSearch = DaoItem.getInstance().showItemByKey(o -> o.getNameItem().contains(searchValue));
			request.getSession().setAttribute("showByKey", itemsSearch);

			RequestDispatcher dd1 = request.getRequestDispatcher("MainProduct.jsp");

			dd1.forward(request, response);
		}else {
			if (person != null) {

				if (person.equals("Man")) {
					
					if(mod != null) {
						if (mod.equals("Shoes")) {
							List<Item1> itembyShoes = DaoItem.getInstance()
									.showItemByKey(o -> o.isGenderItem() && o.getCataloryItem().equals(Catalory.SHOES));
							
							request.getSession().setAttribute("showByKey", itembyShoes);

							RequestDispatcher dd1 = request.getRequestDispatcher("MainProduct.jsp");

							dd1.forward(request, response);
						}
						if (mod.equals("Shirt")) {
							List<Item1> itembyshirt = DaoItem.getInstance()
									.showItemByKey(o -> o.isGenderItem() && o.getCataloryItem().equals(Catalory.SHIRT));
							
							request.getSession().setAttribute("showByKey", itembyshirt);

							RequestDispatcher dd2 = request.getRequestDispatcher("MainProduct.jsp");
							dd2.forward(request, response);

						}
						if (mod.equals("Cap")) {
							List<Item1> itembycap = DaoItem.getInstance()
									.showItemByKey(o -> o.isGenderItem() && o.getCataloryItem().equals(Catalory.CAPS));
							
							request.getSession().setAttribute("showByKey", itembycap);

							RequestDispatcher dd3 = request.getRequestDispatcher("MainProduct.jsp");
							dd3.forward(request, response);

						}
						
						
					}
					else {
						List itemsMan = DaoItem.getInstance().showItemByKey(o -> o.isGenderItem());

						request.getSession().setAttribute("showByKey", itemsMan);

						RequestDispatcher dd1 = request.getRequestDispatcher("MainProduct.jsp");

						dd1.forward(request, response);
					}
					

				}
				System.out.println(mod);

			} else {
				response.sendRedirect("index.jsp");
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
