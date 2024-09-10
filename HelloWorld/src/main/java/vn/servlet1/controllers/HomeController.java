package vn.servlet1.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/home", "/trangchu"})	
public class HomeController extends HttpServlet{
	
	private static final long serialVerionUID = 100012032323L;
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			 throws ServletException, IOException {
		response.setContentType("text/html");
		String ten1 = request.getParameter("ten");
		String ho1 = request.getParameter("ho");
		
		//dua du lieu ra view
		request.setAttribute("name", ho1);
		request.setAttribute("lname", ten1);
		RequestDispatcher rd = request.getRequestDispatcher("/views/Login.jsp");
		rd.forward(request, response);
		
		PrintWriter printW = response.getWriter();
		printW.println("<h1>Hello "+ ho1 + " " + ten1 + "</h1>");
		printW.close();

			 }

	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
