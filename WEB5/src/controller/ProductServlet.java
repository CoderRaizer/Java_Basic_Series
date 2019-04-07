package controller;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import entities.Product;

import model.ProductModel;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProductServlet()
	{
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		HttpSession seesion = request.getSession();
		// TODO Auto-generated method stub
		// doGet(request, response);
		String action = request.getParameter("action");
		String page ="";
		String message = "";
		String masp = request.getParameter("txtmasp");
		String tensp = request.getParameter("txttensp");
		String getgia = request.getParameter("txtgia");
		String hinh = new ProductModel().getFileName(request.getPart("filehinh"));
		String getdm = request.getParameter("madm");
		int madm = Integer.parseInt(getdm);
		int gia = Integer.parseInt(getgia);
		
		Product product = new Product(masp,tensp,gia,hinh,madm);
		ProductModel promodel = new ProductModel(product);
		
		promodel.findFile(hinh,new File("D:\testjsp\""));
		
		if (action.equals("upload"))
		{
			Part file = request.getPart("file");
			ProductModel pm = new ProductModel(file);
		
			String uploadRootPath = request.getServletContext().getRealPath("images");
			pm.uploadFile(uploadRootPath);
		}
		////////////
		
		if (action.equals("add"))
		{
			Boolean flag = new ProductModel().checkcontain(masp);
			if (flag)
			{
				message = "ma san pham da ton tai";
				page = "Error.jsp";
				request.setAttribute("thongbao", message);
				request.getRequestDispatcher(page).forward(request, response);
			}
			else
			{
				int kq = new ProductModel().insertProduct(masp, tensp, gia, hinh, madm);
				if (kq == 0)
				{
					message = "insert that bai";
					page = "Error.jsp";
				}
				else
				{
					message = "insert thanh cong";
					page = "view1.jsp";
					Part file = request.getPart("filehinh");
					ProductModel pm = new ProductModel(file);
					String uploadRootPath = request.getServletContext().getRealPath("images");
					pm.uploadFile(uploadRootPath);
				}
				request.setAttribute("thongbao", message);
				request.getRequestDispatcher(page).forward(request, response);
			}
		}
		
		else
		{
			if(action.equals("update"))
			{
				int kq= new ProductModel().updateProduct(masp, tensp, gia, hinh, madm);
				if (kq == 0)
				{
					message = "update that bai";
					page = "Error.jsp";
				}
				else
				{
					message = "update thanh cong";
					page = "indexproduct.jsp";
					Part file = request.getPart("filehinh");
					ProductModel pm = new ProductModel(file);
					String uploadRootPath = request.getServletContext().getRealPath("images");
					pm.uploadFile(uploadRootPath);
				}
				request.setAttribute("thongbao", message);
				request.getRequestDispatcher(page).forward(request, response);
			}
		}
	}
		

	

}
