package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.DAO;
import beans.Login;

/**
 * Servlet implementation class for Servlet: LoginServlet
 *
 */
 public class LoginServlet extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   RequestDispatcher rd;
   boolean isInserted;
  
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
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
	
	
	public void process (HttpServletRequest request, HttpServletResponse response){
		
		String uname=request.getParameter("uname");
		String pswd=request.getParameter("pswd");
		if(pswd=="admin"){
		HttpSession session=request.getSession();
		session.setAttribute("aname","admin");
		}
		Login log=new Login(uname,pswd);
		String mesg = "";
		
			if (uname==null||uname.trim().equals("")) {

				mesg = "Please enter username";
				request.setAttribute("mesg", mesg);
                 try{		
				 rd=request.getRequestDispatcher("login.jsp");
				 rd.forward(request,response);
                 }
				 catch(Exception e){
					 
				 }
			}
			else if (pswd==null||pswd.trim().equals("")){
				mesg = "Please enter password";
				request.setAttribute("mesg", mesg);
				try{
				rd=request.getRequestDispatcher("login.jsp");
				 rd.forward(request,response);
				}
				catch(Exception e){
			
				}

			}
			
			
		
		else {  
			try{
				isInserted=DAO.ValLogin(log);
				}
			catch(Exception e){
					System.out.print(e);
				}
		        if(isInserted==true){
			try{
	             rd=request.getRequestDispatcher("userHome.jsp");
				 rd.forward(request,response);	
	             
			}
			catch(Exception e){
			}
			}
			
		        else{
		    try{
		    	request.setAttribute("mesg","Please enter valid username and password");
		        	rd=request.getRequestDispatcher("login.jsp");
				 rd.forward(request,response);
		    }
		    catch(Exception e){
		    }
		    }
		}
		    }
	
	
	
	              
	                }
	          
	
	
			
	
		
	
	
	
	
