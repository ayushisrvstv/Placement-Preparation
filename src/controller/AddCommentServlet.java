package controller;
import beans.*;
import model.*;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class for Servlet: AddCommentServlet
 *
 */
 public class AddCommentServlet extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   boolean isInserted;
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public AddCommentServlet() {
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
	
	private void process(HttpServletRequest request,	HttpServletResponse response) {
		// TODO Auto-generated method stub
	    HttpSession session = request.getSession();
	    ArrayList<AddComment> newComments = (ArrayList<AddComment>)session.getAttribute("newcomments");
	    
	    String uname=request.getParameter("uname");
	    String cmnt=request.getParameter("cmnt");
	    String cname=request.getParameter("cname");
	    String ques=request.getParameter("ques");
	    AddComment comment = new AddComment(uname,cmnt,cname,ques); 
	  
	    if(newComments == null){
	    	newComments = new ArrayList<AddComment>();
	    	
	    }
	    session.setAttribute("newcomments", newComments);
	    Login user = (Login)request.getSession().getAttribute("uname");
	    	
	    

	    

	      
	  	try {
			isInserted=DAO.saveComment(comment);
			if(isInserted==true){
			newComments.add(comment);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("newComments.jsp");
			dispatcher.forward(request, response);
			}
			else{
				RequestDispatcher dispatcher = request.getRequestDispatcher("viewInterviewQ.jsp");
				dispatcher.forward(request, response);
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
		
		}
	
	} 
	
	
	
	
	
}