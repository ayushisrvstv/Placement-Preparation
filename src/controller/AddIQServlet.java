package controller;
import beans.*;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.DAO;
import beans.*;

/**
 * Servlet implementation class for Servlet: AddWQServlet
 *
 */
 public class AddIQServlet extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   String mesg="";
   boolean isInserted;
RequestDispatcher rd;
   
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public AddIQServlet() {
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
		String ques=request.getParameter("ques");
		String cname=request.getParameter("cname");
	      if (ques==null||ques.trim().equals("")) {

				mesg = "Please enter the question";
				request.setAttribute("mesg", mesg);
                 try{		
				 rd=request.getRequestDispatcher("addInterviewQ.jsp");
				 rd.forward(request,response);
                 }
				 catch(Exception e){
					 
				 }
			}
		
		AddI addiq=new AddI(ques,cname);
				try{
			isInserted=DAO.saveIQues(addiq);
			}
		catch(Exception e){
				System.out.print(e);
			}
	        if(isInserted==true){
	        	
	        	
		try{
			
		
				mesg="Question has been added";
				request.setAttribute("mesg",mesg);
				rd=request.getRequestDispatcher("addInterviewQ.jsp");
				 rd.forward(request,response);		
				
		
		}
		catch(Exception e){
		}
	
		}
		
		
	}
}