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
 public class AddWQServlet extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   String mesg="";
   boolean isInserted;
RequestDispatcher rd;
   
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public AddWQServlet() {
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
		String opA=request.getParameter("opA");
		String opB=request.getParameter("opB");
		String opC=request.getParameter("opC");
		String opD=request.getParameter("opD");
		String ans=request.getParameter("ans");
		String cname=request.getParameter("cname");
		
		AddW addwq=new AddW(ques,opA,opB,opC,opD,ans,cname);
				try{
			isInserted=DAO.saveWQues(addwq);
			}
		catch(Exception e){
				System.out.print(e);
			}
	        if(isInserted==true){
	        	
	        	
		try{
			
		
				mesg="Question has been added";
				request.setAttribute("mesg",mesg);
				rd=request.getRequestDispatcher("addWrittenQ.jsp");
				 rd.forward(request,response);		
				
		
		}
		catch(Exception e){
		}
	
		}
		
		
	}
}