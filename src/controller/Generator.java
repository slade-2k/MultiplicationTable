package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Generator extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PrintWriter out;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		out = response.getWriter();
		
		if(request.getParameter("baseNumber") != null){
			int baseNumber = Integer.parseInt(request.getParameter("baseNumber"));
			int endNumber = Integer.parseInt(request.getParameter("endNumber"));
			if(baseNumber > endNumber){
				endNumber = baseNumber+1;
			}
			if(baseNumber > 0 && endNumber > 0){
				generateTable(baseNumber, endNumber);								
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	private void generateTable(int baseNumber, int endNumber) {
		int i, x, y;
		out.println("<table border='1'>");
		for (y = baseNumber; y <= endNumber+1; y++) {
			out.println("<tr>");
			if(y == baseNumber){
				out.println("<td>");
				out.println(" ");
				out.println("</td>");
			}else {
				out.println("<td>");
				out.println(y-1);
				out.println("</td>");				
			}
			for (x = baseNumber; x <= endNumber; x++) {
				if(y == baseNumber){
					out.println("<td>");
					out.println(x);
					out.println("</td>");
				} else {
					out.println("<td>");
					out.println((y-1) * x);
					out.println("</td>");					
				}
			}
			out.println("</tr>");
		}
		out.println("</table>");
	}
}
