package controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entities.Chitiethoadon;
import entities.Hoadon;
import entities.Item;
import model.CartModel;
import model.ChitiethoadonModel;
import model.HoadonModel;

/**
 * Servlet implementation class CartServlet
 */
@WebServlet("/CartServlet")
public class CartServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	CartModel cartmodel = new CartModel();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartServlet()
    {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String page="";
		String action = request.getParameter("action");
		String masp = request.getParameter("masp");
		
		if(action.equals("add"))
		{
			cartmodel.addList(masp);
		}
		
		else if(action.equals("delete"))
		{
			cartmodel.removeProduct(masp);
		}
		else if(action.equals("removeall"))
		{
			cartmodel.removeAll();
		}
		request.setAttribute("list",cartmodel.getListItems());
		request.setAttribute("totalcart",cartmodel.gettotalList());
		page = "usercart.jsp";//tao trang usercart.jsp
		request.getRequestDispatcher(page).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		String page="";
		String action = request.getParameter("action");
		String masp = request.getParameter("masp");
		HttpSession session = request.getSession();
		
		//Lay ngay hien tai
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/YYYY");
		Calendar cal = Calendar.getInstance();
		String ngaydh = dateFormat.format(cal.getTime());
		
		Hoadon hd = new Hoadon(0,ngaydh);
		//Insert 1 hoa don
		
		HoadonModel hoadonmodel = new HoadonModel(hd);
		hoadonmodel.insertHoaDon();
		//Lay ma hoa don vua tao
		int newestIdHoadon = hoadonmodel.getNewestIdHoadon();
		
		//Insert chi tiet hoa don
		ArrayList<Item> cart = cartmodel.getListItems();
		for(Item i: cart)
		{
			Chitiethoadon cthd = new Chitiethoadon(newestIdHoadon,i.getSanpham().getMasp(),i.getSoluong());
			ChitiethoadonModel cthdModel = new ChitiethoadonModel(cthd);
			cthdModel.insertChiTietHoaDon();
		}
		//insert thanh cong,xoa gio hang
		cartmodel.removeAll();
		page = "index.jsp";
		request.getRequestDispatcher(page).forward(request, response);
//		doGet(request, response);
	}

}
