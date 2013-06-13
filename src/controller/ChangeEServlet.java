package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DAO;
import beans.ChangeEM;
import beans.ChangeM;

/**
 * Servlet implementation class for Servlet: ChangeEServlet
 *
 */
 public class ChangeEServlet extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   String mesg="";
   boolean isInserted;
RequestDispatcher rd;
   
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public ChangeEServlet() {
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
		String oemail=request.getParameter("oemail");
		String mail=request.getParameter("mail");
		
	ChangeEM chEM=new ChangeEM(uname,oemail,mail);
	if (uname==null||uname.trim().equals("")) {

		request.setAttribute("mesg","Please enter the username" );
         try{		
        	 rd=request.getRequestDispatcher("changeEmail.jsp");
        	 rd.forward(request,response);
         }
		 catch(Exception e){
			 
		 }
	}
	else if (oemail==null||oemail.trim().equals("")){
		mesg = "Please enter old email";
		request.setAttribute("mesg", mesg);
		try{
		rd=request.getRequestDispatcher("changeEmail.jsp");
		 rd.forward(request,response);
		}
		catch(Exception e){
	
		}

	}
	else if (mail==null||mail.trim().equals("")){
		mesg = "Please enter new email";
		request.setAttribute("mesg", mesg);
		try{
		rd=request.getRequestDispatcher("changeEmail.jsp");
		 rd.forward(request,response);
		}
		catch(Exception e){
	
		}

	}
	else
		{  
			try{
				isInserted=DAO.changeEmail(chEM);
				}
			catch(Exception e){
					System.out.print(e);
				}
		        if(isInserted==true){
			try{
				mesg="Email has been changed";
				request.setAttribute("mesg",mesg);
				rd=request.getRequestDispatcher("userHome.jsp");
				 rd.forward(request,response);		
			}
			catch(Exception e){
			}
			}
			
		        else{
		    try{
		    	request.setAttribute("mesg","Email could not be changed");
		        	rd=request.getRequestDispatcher("userHome.jsp");
				 rd.forward(request,response);
		    }
		    catch(Exception e){
		    }
		    }
		   
	}
}
	
}