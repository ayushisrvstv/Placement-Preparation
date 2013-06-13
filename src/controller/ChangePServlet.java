package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO;
import beans.Change;

/**
 * Servlet implementation class for Servlet: ChangePServlet
 *
 */
 public class ChangePServlet extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   String mesg="";
   boolean isInserted;
RequestDispatcher rd;   
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
 */
	public ChangePServlet() {
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
		String opswd=request.getParameter("opswd");
		String pswd=request.getParameter("pswd");
		String uname=request.getParameter("uname");
		
	Change ch=new Change(opswd,pswd,uname);
	if (opswd==null||opswd.trim().equals("")) {

		request.setAttribute("mesg","Please enter the old password" );
         try{		
        	 rd=request.getRequestDispatcher("changePswd.jsp");
        	 rd.forward(request,response);
         }
		 catch(Exception e){
			 
		 }
	}
	else if (pswd==null||pswd.trim().equals("")){
		mesg = "Please enter new password";
		request.setAttribute("mesg", mesg);
		try{
		rd=request.getRequestDispatcher("changePswd.jsp");
		 rd.forward(request,response);
		}
		catch(Exception e){
	
		}

	}
	else if (uname==null||uname.trim().equals("")){
		mesg = "Please enter new username";
		request.setAttribute("mesg", mesg);
		try{
		rd=request.getRequestDispatcher("changePswd.jsp");
		 rd.forward(request,response);
		}
		catch(Exception e){
	
		}

	}
	else
		{  
			try{
				isInserted=DAO.changePswd(ch);
				}
			catch(Exception e){
					System.out.print(e);
				}
		        if(isInserted==true){
			try{
				mesg="Password has been changed";
				request.setAttribute("mesg",mesg);
				rd=request.getRequestDispatcher("userHome.jsp");
				 rd.forward(request,response);		
			}
			catch(Exception e){
			}
			}
			
		        else{
		    try{
		    	request.setAttribute("mesg","Password could not be changed");
		        	rd=request.getRequestDispatcher("userHome.jsp");
				 rd.forward(request,response);
		    }
		    catch(Exception e){
		    }
		    }
		   

	}
}
 }