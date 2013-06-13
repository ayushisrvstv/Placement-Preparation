package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO;
import beans.ChangeM;

/**
 * Servlet implementation class for Servlet: ChangeMServlet
 *
 */
 public class ChangeMServlet extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   String mesg="";
   boolean isInserted;
RequestDispatcher rd;
   
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public ChangeMServlet() {
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
		String uname=request.getParameter("uname");
		String omobile=request.getParameter("omobile");
		String mobile=request.getParameter("mobile");
		
	ChangeM chM=new ChangeM(uname,omobile,mobile);
	if (uname==null||uname.trim().equals("")) {

		request.setAttribute("mesg","Please enter the username" );
         try{		
        	 rd=request.getRequestDispatcher("changeMobile.jsp");
        	 rd.forward(request,response);
         }
		 catch(Exception e){
			 
		 }
	}
	else if (omobile==null||omobile.trim().equals("")){
		mesg = "Please enter old mobile";
		request.setAttribute("mesg", mesg);
		try{
		rd=request.getRequestDispatcher("changeMobile.jsp");
		 rd.forward(request,response);
		}
		catch(Exception e){
	
		}

	}
	else if (mobile==null||mobile.trim().equals("")){
		mesg = "Please enter new new mobile";
		request.setAttribute("mesg", mesg);
		try{
		rd=request.getRequestDispatcher("changeMobile.jsp");
		 rd.forward(request,response);
		}
		catch(Exception e){
	
		}

	}
	else
		{  
			try{
				isInserted=DAO.changeMobile(chM);
				}
			catch(Exception e){
					System.out.print(e);
				}
		        if(isInserted==true){
			try{
				mesg="Mobile has been changed";
				request.setAttribute("mesg",mesg);
				rd=request.getRequestDispatcher("userHome.jsp");
				 rd.forward(request,response);		
			}
			catch(Exception e){
			}
			}
			
		        else{
		    try{
		    	request.setAttribute("mesg","Mobile could not be changed");
		        	rd=request.getRequestDispatcher("userHome.jsp");
				 rd.forward(request,response);
		    }
		    catch(Exception e){
		    }
		    }
		   
	}
}
}