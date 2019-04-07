package controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import entities.Account;
import model.AccountModel;

/**
 * Servlet implementation class AccountServlet
 */
@WebServlet("/AccountServlet")
public class AccountServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	Connection cn;
    public AccountServlet()
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
		String message="";
		HttpSession session = request.getSession();
		cn = new MyConnect().getcn();
		if(cn==null)
		{
			message = "ket noi that bai";
			request.setAttribute("thongbao", message);
			request.getRequestDispatcher("Error.jsp").forward(request, response);
			return;
		}
		
		
		String username = request.getParameter("username");
		String password = "";
		Account account = new Account(username,password);
		AccountModel accmodel = new AccountModel(account);
		
		//Nhan yeu cau tu view -> giao tiep voi model de thuc thi lenh xoa roi tra ve ket qua
		String chuoi = request.getParameter("task");
		
		
		if(chuoi.equals("delete"))
		{
			int kq = accmodel.deleteAccount();
			if(kq==0)
			{
				message = "delete that bai";
				page = "Error.jsp";
			}
			else
			{
				session.setAttribute("accountList",new AccountModel().getList());//tu new cung nhu cap nhap lai mot cai moi sau khi xoa
				page = "View.jsp";
				message="DELETE SUSCESS!";
			}
			
			request.setAttribute("thongbao",message);
			request.getRequestDispatcher(page).forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	
	
	
	
	
	
	
	
	//DO POST
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		String page="";
		String message="";
		
		HttpSession seesion = request.getSession();
		
		cn = new MyConnect().getcn();
		if(cn==null)
		{
			message="Ket Noi That Bai";
		request.setAttribute("thongbao",message);
		request.getRequestDispatcher("Error.jsp").forward(request, response);
		return;
		}
		
		///////////////////////////////
		
		String username = request.getParameter("txtname");
		String password = request.getParameter("txtpassword");
		
		
		Account account = new Account(username,password);
		AccountModel accmodel = new AccountModel(account);
		
		String chuoi = request.getParameter("task");
		
		
		
		//tai day nhan tu ben ngoai gia tri cua task de thuc hien cong viec ung voi lenh
		if(chuoi.equals("insert"))
		{
			int kq = accmodel.insertAccount();
			if(kq==0)
			{
				message = "insert that bai";
				page="Error.jsp";
			}
			else
			{
				seesion.setAttribute("accountList",new AccountModel().getList());
				page="View.jsp";
			}
			request.setAttribute("thongbao",message);
			request.getRequestDispatcher(page).forward(request, response);
		}
		
		
		
		
		//tai day nhan tu ben ngoai gia tri cua task de thuc hien cong viec ung voi lenh
		if(chuoi.equals("update"))
		{
			int kq = accmodel.updateAccount();
			if(kq==0)
			{
				message = "Update that bai";
				page = "Error.jsp";
			}
			else
			{
				seesion.setAttribute("accountList",new AccountModel().getList());
				page = "View.jsp";
			}
			request.setAttribute("thongbao",message);
			request.getRequestDispatcher(page).forward(request, response);
		}
		
	}

}
