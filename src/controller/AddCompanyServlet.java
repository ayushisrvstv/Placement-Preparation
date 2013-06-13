package controller;
import javax.servlet.http.HttpServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO;
import beans.AddCompany;

/**
 * Servlet implementation class for Servlet: AddCompanyServlet
 *
 */
 public class AddCompanyServlet extends HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   RequestDispatcher rd;
   boolean isInserted;
   String mesg="";
   
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public AddCompanyServlet() {
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
		String cname=request.getParameter("cname");
		String addr1=request.getParameter("addr1");
		String addr2=request.getParameter("addr2");
		
		AddCompany addc=new AddCompany(cname,addr1,addr2);
		
		if (cname == null||cname.trim().equals("")) {

			mesg = "Please enter Company name";
			request.setAttribute("mesg", mesg);
             try{		
			 rd=request.getRequestDispatcher("addCompany.jsp");
			 rd.forward(request,response);
             }
			 catch(Exception e){
				 
			 }
		}
		
		if (addr1 == null||addr1.trim().equals("")) {

			mesg = "Please enter Address";
			request.setAttribute("mesg", mesg);
             try{		
			 rd=request.getRequestDispatcher("addCompany.jsp");
			 rd.forward(request,response);
             }
			 catch(Exception e){
				 
			 }
		}
		
		else {  
			try{
				isInserted=DAO.SaveCompany(addc);
				}
			catch(Exception e){
					System.out.print(e);
				}
		        if(isInserted==true){
				request.setAttribute("mesg","successfuly added!");
			try{
				rd=request.getRequestDispatcher("adminHome.jsp");
				 rd.forward(request,response);		
			}
			catch(Exception e){
			}
			}
			
		        else{
		    try{
		        	rd=request.getRequestDispatcher("addCompany.jsp");
				 rd.forward(request,response);
		    }
		    catch(Exception e){
		    }
		    }
		    
		    }
	}

}