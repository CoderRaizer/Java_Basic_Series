package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AjaxController
 */
@WebServlet("/AjaxController")
public class AjaxController extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjaxController()
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/plain");
		String action = request.getParameter("action");
		
		if(action.equals("demo1"))//thuc hien yeu cau cua nut btn1
		{
		String fullname=request.getParameter("fullname");
		//response.getWriter().print("Hello " + fullname);//in lên client
		String result = "hello "+fullname;
		response.getWriter().print(result);//in lên client
		}
		
		else if(action.equals("demo2"))//thuc hien yeu cau cua nut btn2
		{
		String number1=request.getParameter("number1");
		String number2=request.getParameter("number2");
		int result = Integer.parseInt(number1) + Integer.parseInt(number2);

		response.getWriter().print(result);
		}
	}

}
