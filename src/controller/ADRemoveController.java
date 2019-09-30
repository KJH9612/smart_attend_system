package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ADRemoveController
 */
@WebServlet({"/ad-lecmove-list.do"})
public class ADRemoveController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    HttpSession sesobj = null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ADRemoveController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");		

		sesobj = request.getSession();
		
		String uri = request.getRequestURI();
		int lastIndex = uri.lastIndexOf('/'); 
		String action = uri.substring(lastIndex + 1); 
		
		if(action.equals("ad-lecmove-list.do")) {
			list(request, response);
		}/*else if(action.equals("assist-info.do")){
			Info(request, response);
		}else if(action.equals("assist-register.do")) {
			Insert(request, response);
		}else if(action.equals("assist-delete.do")) {
			Delete(request, response);
		}else if(action.equals("assist-list.do")) {
			Inquiry(request, response);
		}else if(action.equals("assist-inputdata.do")){
			inputdata(request,response);
		}
		else
			;*/
		
	}//
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	private void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException{
		
		RequestDispatcher dis = request.getRequestDispatcher("ad_lecmove.jsp"); 
		dis.forward(request, response);
		//response.sendRedirect("assist-list.do");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			process(request,response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			process(request,response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
