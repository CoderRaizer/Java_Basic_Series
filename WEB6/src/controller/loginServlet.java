package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;
import model.AccountModel;
/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	Connection cn;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet()
    {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		String username = request.getParameter("txtname");
		String password = request.getParameter("txtpassword");
		String page="";
		String message="";
		HttpSession session = request.getSession();
		
		
		cn = new MyConnect().getcn();
		if(cn==null)
		{
			message="KET NOI THAT BAI";
			request.setAttribute("thongbao",message);//gan bien message trong java thanh bien thongbao roi dua ra giao dien
			request.getRequestDispatcher("Error.jsp").forward(request, response);
			System.out.println("KET NOI THAT BAI");
			return;
		}
		
		try
		{
			String sql = "Select * From admin where username like ?";
			PreparedStatement ps = cn.prepareStatement(sql);
			ps.setString(1,username);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				if(rs.getString(1).equals(username) && rs.getString(2).equals(password))
				{
					//day la giai doan no giao tiep voi model(model da giao tiep voi database de dua du lieu tu database len arraylist
					session.setAttribute("accountList",new AccountModel().getList());
					message = "LOGIN SUCCESS";
					page = "View.jsp";
				}
				else
				{
					message = "LOGIN FAIL";
					page = "Error.jsp";
				}
			}
			else
			{
				message = "Username NOT exist";
				page = "Error.jsp";
			}
			request.setAttribute("thongbao",message);
			request.getRequestDispatcher(page).forward(request, response);
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
	
	}

}
