package controller;
import model.*;
import beans.*;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class for Servlet: DelServlet
 *
 */
 public class DelServlet extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   RequestDispatcher rd;
   boolean isInserted;
   String mesg="";
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public DelServlet() {
		super();
	}   	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		process(request,response);
	}  	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		process(request,response);
	}   
	private void process(HttpServletRequest request, HttpServletResponse response){

		String delques=request.getParameter("delques");

		DeleteQues del=new DeleteQues(delques);
		isInserted=DAO.deleteQues(del);
		if(isInserted==true){
			mesg = "Question has been deleted";
			request.setAttribute("mesg", mesg);
             try{		
			 rd=request.getRequestDispatcher("deleteQ.jsp");
			 rd.forward(request,response);
             }
			 catch(Exception e){
				 
			 }

		}
	}
}