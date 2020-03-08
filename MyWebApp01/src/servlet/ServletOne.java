package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletOne
 */
@WebServlet("/servletone")
public class ServletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletOne() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int first=0;
		int second=0;
		int result =0;
		boolean signal = true;
		String firstParam = request.getParameter("first");
		try {
			if(firstParam.isEmpty()) throw new Exception("Insert number...");
			first=Integer.parseInt(firstParam);
		}catch(Exception e) {
			signal=false;
			e.printStackTrace();
			request.setAttribute("errorF", "not a number!");
		}
		String secondParam = request.getParameter("second");
		try {
			if(secondParam.isEmpty()) throw new Exception("Insert number...");
			second=Integer.parseInt(secondParam);
		}catch(Exception e) {
			signal=false;
			e.printStackTrace();
			request.setAttribute("errorS", "not a number!");
		}
		
		request.setAttribute("first", firstParam);
		request.setAttribute("second", secondParam);
		

		if(signal) {
			if(request.getParameter("plus")!=null) {
				result=first+second;
			}
			else if(request.getParameter("minus")!=null) {
				result=first-second;
			}
			request.setAttribute("result", result);
		}else {
			request.setAttribute("errorR", "first or second input are not a number!");
		}
		
    	
    	RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
    	rd.forward(request, response);
	}

}
