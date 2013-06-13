package controller;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;

import beans.Register;
import model.*;
/**
 * Servlet implementation class for Servlet: RegServlet
 *
 */
 public class RegServlet extends HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   RequestDispatcher rd;
   boolean isInserted;
   
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public RegServlet() {
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
		//super.doPost(request, response);
		process(request,response);
	
	}
	private void process (HttpServletRequest request, HttpServletResponse response){
		String uname=request.getParameter("uname");
		String name=request.getParameter("name");
		String pswd=request.getParameter("pswd");
		String cpswd=request.getParameter("cpswd");
		String mobile=request.getParameter("mobile");
		String college=request.getParameter("college");
		String branch=request.getParameter("branch");
		String mail=request.getParameter("mail");
		Register reg=new Register(uname,name,pswd,cpswd,mobile,college,branch,mail);
		String mesg = "";
		
			if (uname == null||uname.trim().equals("")) {

				mesg = "Please enter username";
				request.setAttribute("mesg", mesg);
                 try{		
				 rd=request.getRequestDispatcher("register.jsp");
				 rd.forward(request,response);
                 }
				 catch(Exception e){
					 
				 }
			} else if (name==null||name.trim().equals("")){
				mesg = "Please enter name";
				request.setAttribute("mesg", mesg);
				try{
				rd=request.getRequestDispatcher("register.jsp");
				 rd.forward(request,response);
				}
				catch(Exception e){
			
				}

			}
			
			else if (pswd==null||pswd.trim().equals("")){
				mesg = "Please enter the password";
				request.setAttribute("mesg", mesg);
				try{
				rd=request.getRequestDispatcher("register.jsp");
				 rd.forward(request,response);
				}
				catch(Exception e){
					
				}

			}

			else if (cpswd==null||cpswd.trim().equals("")){
				mesg = "Please enter the confirm password field";
				request.setAttribute("mesg", mesg);
				try{
				rd=request.getRequestDispatcher("register.jsp");
				 rd.forward(request,response);
				}
				catch(Exception e){

			}
			}			
			else if (college==null||college.trim().equals("")){
				mesg = "Please enter the college";
			try{
				request.setAttribute("mesg", mesg);
				rd=request.getRequestDispatcher("register.jsp");
				 rd.forward(request,response);
			}
			catch(Exception e){

			}
			}
			else if (branch==null||branch.trim().equals("")){
				mesg = "Please enter your branch";
				request.setAttribute("mesg", mesg);
				try{
				rd=request.getRequestDispatcher("register.jsp");
				 rd.forward(request,response);
				}
				catch(Exception e){
				}
			}
			
			
			else if (mobile==null||mobile.trim().equals("")){
				mesg = "Please enter your mobile number";
				request.setAttribute("mesg", mesg);
			try{
				rd=request.getRequestDispatcher("register.jsp");
				 rd.forward(request,response);
			}
			catch(Exception e){
			}
			}
			
			else if (name==mail||mail.trim().equals("")){
				mesg = "Please enter e-mail id";
			try{
				request.setAttribute("mesg", mesg);
				rd=request.getRequestDispatcher("register.jsp");
				 rd.forward(request,response);
			}
			catch(Exception e){

			}	  
			}
		else {  
			try{
				isInserted=DAO.SaveReg(reg);
				}
			catch(Exception e){
					System.out.print(e);
				}
		        if(isInserted==true){
				request.setAttribute("mesg","successfully registered!<br>Please login to continue");
			try{
				rd=request.getRequestDispatcher("login.jsp");
				 rd.forward(request,response);		
			}
			catch(Exception e){
			}
			}
			
		        else{
		    try{
		        	rd=request.getRequestDispatcher("index.jsp");
				 rd.forward(request,response);
		    }
		    catch(Exception e){
		    }
		    }
		    
		    }
	}
			
			}
		

 