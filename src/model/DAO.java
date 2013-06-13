package model;
import model.DBManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import beans.*;




	public class DAO{
		static boolean valid=false;
		static Connection con=null;
		static Statement stmt=null;
		static ResultSet rs;	
		
	public static boolean SaveReg(Register reg){

	try{
		//Registration registerBean=new Registration();
		System.out.println("hi");
		con=DBManager.getConnection();
		System.out.println("Connected");
		String ins="insert into student(uname,name,pswd,college,branch,mobile,mail) values(?,?,?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(ins);
		//ps.setInt(1, reg.getId());
	    ps.setString(1, reg.getUname());
	    ps.setString(2, reg.getName());
	    ps.setString(3,reg.getPswd());
	    ps.setString(4, reg.getCollege());
	    ps.setString(5,reg.getBranch());
	    ps.setString(6,reg.getMobile());
	    ps.setString(7,reg.getMail());
	    
	    int result=ps.executeUpdate();
	    
	    if(result>0){
	    	valid=true;
	    
	}
	    else{
	    	valid=false;
	    }}
	catch(Exception ae){
		//JOptionPane.showMessageDialog(null, ae);
		//valid=false;
	}

	
	
	return valid;
	
	}
	
	public static boolean ValLogin(Login log){
		//Statement stmt=null;
		try{
			//JOptionPane.showMessageDialog(null,user.getUname());
			//String u=user.getUname();
			//String p=user.getPswd();
			//Registration registerBean=new Registration();
			System.out.println("hi");
			con=DBManager.getConnection();
			System.out.println("Connected");
			//stmt=con.createStatement();
			String ins="select * from student where uname=? and pswd=?";
			//rs=stmt.executeQuery(ins);
			PreparedStatement ps=con.prepareStatement(ins);
			ps.setString(1,log.getUname());
		    ps.setString(2,log.getPswd());
			rs=ps.executeQuery();
			if(rs.next()){
				System.out.println("true");
		      valid=true;
		     // return valid;
			}
			else{
				valid=false;
				//return valid;
			}	    
		    
		}
		catch(Exception ae){
			//JOptionPane.showMessageDialog(null, ae);	
		}

	/*	finally{
			try{
			
		     		con.close();
			        stmt.close();
			}
			catch(SQLException e){

		}
		}*/
	return valid;


	}
	
	
	public static boolean changePswd(Change ch){
		//Statement stmt=null;
		try{
			//JOptionPane.showMessageDialog(null,user.getUname());
			//String u=user.getUname();
			//String p=user.getPswd();
			//Registration registerBean=new Registration();
			System.out.println("hi");
			con=DBManager.getConnection();
			System.out.println("Connected");
			
			//stmt=con.createStatement();
			System.out.println("Before");
		
			
			//String ins="update student set pswd = '"
					//+ ch.getPswd() + "' where uname ='" + ch.getUname()+"'";
			
			//rs=stmt.executeQuery(ins);
			PreparedStatement ps=con.prepareStatement("update student set pswd = ? where uname = ?");
		
		ps.setString(1, ch.getPswd());
		ps.setString(2, ch.getUname());
		
		
			int n=ps.executeUpdate();
			if(n>0){
				System.out.println("true");
		      valid=true;
		     // return valid;
			}
			else{
				valid=false;
				//return valid;
			}	    
		    
		}
		catch(Exception ae){
			//JOptionPane.showMessageDialog(null,ae);	
		}

	/*	finally{
			try{
			
		     		con.close();
			        stmt.close();
			}
			catch(SQLException e){

		}
		}*/
	return valid;


	}
	
	
	public static boolean changeMobile(ChangeM chM){
		//Statement stmt=null;
		try{
			//JOptionPane.showMessageDialog(null,user.getUname());
			//String u=user.getUname();
			//String p=user.getPswd();
			//Registration registerBean=new Registration();
			System.out.println("hi");
			con=DBManager.getConnection();
			System.out.println("Connected");
			
			//stmt=con.createStatement();
			System.out.println("Before");
		
			
			//String ins="update student set pswd = '"
					//+ ch.getPswd() + "' where uname ='" + ch.getUname()+"'";
			
			//rs=stmt.executeQuery(ins);
			PreparedStatement ps=con.prepareStatement("update student set mobile = ? where uname = ?");
		
		ps.setString(1, chM.getMobile());
		ps.setString(2, chM.getUname());
		
		
			int n=ps.executeUpdate();
			if(n>0){
				System.out.println("true");
		      valid=true;
		     // return valid;
			}
			else{
				valid=false;
				//return valid;
			}	    
		    
		}
		catch(Exception ae){
			//JOptionPane.showMessageDialog(null,ae);	
		}

	/*	finally{
			try{
			
		     		con.close();
			        stmt.close();
			}
			catch(SQLException e){

		}
		}*/
	return valid;


	}
	
	
	
	public static boolean SaveCompany(AddCompany addc){

		try{
			//Registration registerBean=new Registration();
			System.out.println("hi");
			con=DBManager.getConnection();
			System.out.println("Connected");
			String ins="insert into company(cname,addr1,addr2) values(?,?,?)";
			PreparedStatement ps=con.prepareStatement(ins);
			//ps.setInt(1, reg.getId());
		    ps.setString(1, addc.getCname());
		    ps.setString(2, addc.getAddr1());
		    ps.setString(3,addc.getAddr2());
		    
		    
		    int result=ps.executeUpdate();
		    
		    if(result>0){
		    	valid=true;
		    
		}
		    else{
		    	valid=false;
		    }}
		catch(Exception ae){
			//JOptionPane.showMessageDialog(null, ae);
			//valid=false;
		}

		
		
		return valid;
		
		}
		
	public static List getCompanies() throws Exception{
		ArrayList list=new ArrayList();
			try{
				System.out.println("hi");
			con=DBManager.getConnection();
			System.out.println("Connected");
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from company");
			while(rs.next()){
				AddCompany topic=new AddCompany();
				
				
				
				topic.setCname(rs.getString("cname"));
				list.add(topic);
			}
			
		}
		catch(SQLException ae){
			ae.printStackTrace();	
		}

		catch(ClassNotFoundException e){
		e.printStackTrace();
		}

		/*finally{
			try{
			
		     		con.close();
			        stmt.close();
			}
			catch(SQLException e){

		}
		}*/
		return list;
		}
	
	
	
	
	
	public static boolean saveWQues(AddW addwq){

		try{
			//Registration registerBean=new Registration();
			System.out.println("hi");
			con=DBManager.getConnection();
			System.out.println("Connected");
			String ins="insert into writtenq(ques,opA,opB,opC,opD,ans,cname) values(?,?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(ins);
			//ps.setInt(1, reg.getId());
			System.out.println("after query");
		    ps.setString(1, addwq.getQues());
		    ps.setString(2, addwq.getOpA());
		    ps.setString(3, addwq.getOpB());
		    ps.setString(4, addwq.getOpC());
		    ps.setString(5,addwq.getOpD());
		    ps.setString(6,addwq.getAns());
		    ps.setString(7,addwq.getCname());
		    
		    
		    int result=ps.executeUpdate();
		    
		    if(result>0){
		    	System.out.println("True");
		    	valid=true;
		    
		}
		    else{
		    	valid=false;
		    }}
		catch(Exception ae){
			//JOptionPane.showMessageDialog(null, ae);
			//valid=false;
		}

		
		
		return valid;
		
		}
	
	
	public static List getWrittenQ(SelectCompany sel) throws Exception{
		ArrayList list=new ArrayList();
			try{
				System.out.println("hi");
			con=DBManager.getConnection();
			System.out.println("Connected");
			stmt=con.createStatement();
			String ins="select * from writtenq where cname=?";
			PreparedStatement ps=con.prepareStatement(ins);
			ps.setString(1,sel.getCompany());
			rs=ps.executeQuery();
			while(rs.next()){
				AddW ad=new AddW();
				
				
				
				ad.setCname(rs.getString("cname"));
				ad.setQues(rs.getString("ques"));
				ad.setOpA(rs.getString("opA"));
				ad.setOpB(rs.getString("opB"));
				ad.setOpC(rs.getString("opC"));
				ad.setOpD(rs.getString("opD"));
				ad.setAns(rs.getString("ans"));
				list.add(ad);
			}
			
		}
		catch(SQLException ae){
			ae.printStackTrace();	
		}

		catch(ClassNotFoundException e){
		e.printStackTrace();
		}

		/*finally{
			try{
			
		     		con.close();
			        stmt.close();
			}
			catch(SQLException e){

		}
		}*/
		return list;
		}
	
	public static List getIQuestions(SelectCompany sel) throws Exception{
		ArrayList list=new ArrayList();
			try{
				System.out.println("hi");
			con=DBManager.getConnection();
			System.out.println("Connected");
			stmt=con.createStatement();
			String ins="select * from interviewq where cname=?";
			PreparedStatement ps=con.prepareStatement(ins);
			ps.setString(1,sel.getCompany());
			rs=ps.executeQuery();
			while(rs.next()){
				AddI ad=new AddI();
				ad.setCname(rs.getString("cname"));
				ad.setQues(rs.getString("ques"));
				list.add(ad);
			}
			
		}
		catch(SQLException ae){
			ae.printStackTrace();	
		}

		catch(ClassNotFoundException e){
		e.printStackTrace();
		}

		/*finally{
			try{
			
		     		con.close();
			        stmt.close();
			}
			catch(SQLException e){

		}
		}*/
		return list;
		}
	
	
	
	
	
	
	
	
	

	public static boolean saveComment(AddComment comment){

		try{
			
			//Registration registerBean=new Registration();
			System.out.println("hi");
			con=DBManager.getConnection();
			System.out.println("Connected");
			String ins="insert into comment(uname,cmnt,cname) values(?,?,?)";
			PreparedStatement ps=con.prepareStatement(ins);
			//ps.setInt(1, reg.getId());
		    ps.setString(1, comment.getUname());
		    ps.setString(2, comment.getCmnt());
		    ps.setString(3, comment.getCname());
			   
		    
		    
		    int result=ps.executeUpdate();
		    
		    if(result>0){
		    	
		    	valid=true;
		    
		}
		    else{
		    	valid=false;
		    }
		    }
		catch(Exception ae){
			//JOptionPane.showMessageDialog(null, ae);
			//valid=false;
		}

		
		
		return valid;
		
		}

	
	
	public static boolean saveIQues(AddI addiq){

		try{
			//Registration registerBean=new Registration();
			System.out.println("hi");
			con=DBManager.getConnection();
			System.out.println("Connected");
			String ins="insert into interviewq(ques,cname) values(?,?)";
			PreparedStatement ps=con.prepareStatement(ins);
			//ps.setInt(1, reg.getId());
			System.out.println("after query");
		    ps.setString(1, addiq.getQues());
		     ps.setString(2,addiq.getCname());
		    
		    
		    int result=ps.executeUpdate();
		    
		    if(result>0){
		    	System.out.println("True");
		    	valid=true;
		    
		}
		    else{
		    	valid=false;
		    }}
		catch(Exception ae){
			//JOptionPane.showMessageDialog(null, ae);
			//valid=false;
		}

		
		
		return valid;
		
		}
	
	public static boolean changeEmail(ChangeEM chEM){
		//Statement stmt=null;
		try{
			//JOptionPane.showMessageDialog(null,user.getUname());
			//String u=user.getUname();
			//String p=user.getPswd();
			//Registration registerBean=new Registration();
			System.out.println("hi");
			con=DBManager.getConnection();
			System.out.println("Connected");
			
			//stmt=con.createStatement();
			System.out.println("Before");
		
			
			//String ins="update student set pswd = '"
					//+ ch.getPswd() + "' where uname ='" + ch.getUname()+"'";
			
			//rs=stmt.executeQuery(ins);
			PreparedStatement ps=con.prepareStatement("update student set mail = ? where uname = ?");
		
		ps.setString(1, chEM.getMail());
		ps.setString(2, chEM.getUname());
		
		
			int n=ps.executeUpdate();
			if(n>0){
				System.out.println("true");
		      valid=true;
		     // return valid;
			}
			else{
				valid=false;
				//return valid;
			}	    
		    
		}
		catch(Exception ae){
			//JOptionPane.showMessageDialog(null,ae);	
		}

	/*	finally{
			try{
			
		     		con.close();
			        stmt.close();
			}
			catch(SQLException e){

		}
		}*/
	return valid;


	}


	
	
	

	
	
		
	
		

	public static List getQuestions() throws Exception{
		ArrayList list=new ArrayList();
			try{
				System.out.println("hi");
			con=DBManager.getConnection();
			System.out.println("Connected");
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from writtenq");
			while(rs.next()){
				AddW topic=new AddW();
				
				
				topic.setQues(rs.getString("ques"));
				topic.setCname(rs.getString("cname"));
				list.add(topic);
			}
			
		}
		catch(SQLException ae){
			ae.printStackTrace();	
		}

		catch(ClassNotFoundException e){
		e.printStackTrace();
		}

		/*finally{
			try{
			
		     		con.close();
			        stmt.close();
			}
			catch(SQLException e){

		}
		}*/
		return list;
		}
		
	
	

	public static List getComments(AddComment ac, SelectCompany sel) throws Exception{
		ArrayList list=new ArrayList();
			try{
				System.out.println("hi");
			con=DBManager.getConnection();
			System.out.println("Connected");
			stmt=con.createStatement();
			String ins="select * from comment where cname=?";
			PreparedStatement ps=con.prepareStatement(ins);
			ps.setString(1, sel.getCompany());
			rs=ps.executeQuery();
			if(rs.next()){
				System.out.println("in while");
				AddComment top=new AddComment();

				top.setCmnt(rs.getString("cmnt"));
				
				list.add(top);
			}
			
		}
		catch(SQLException ae){
			//JOptionPane.showMessageDialog(null,ae);
		}

		catch(ClassNotFoundException e){
		e.printStackTrace();
		}

		/*finally{
			try{
			
		     		con.close();
			        stmt.close();
			}
			catch(SQLException e){

		}
		}*/
		return list;
		}
	
	

	
	
	public static boolean deleteQues(DeleteQues del){
		//Statement stmt=null;
		try{
			//JOptionPane.showMessageDialog(null,user.getUname());
			//String u=user.getUname();
			//String p=user.getPswd();
			//Registration registerBean=new Registration();
			System.out.println("hi");
			con=DBManager.getConnection();
			System.out.println("Connected");
			//stmt=con.createStatement();
			
			//rs=stmt.executeQuery(ins);
			PreparedStatement ps=con.prepareStatement("delete from writtenq where ques=?");
			ps.setString(1,del.getDelques());
			int n=ps.executeUpdate();
			
			if(n>0){
				System.out.println("true");
		      valid=true;
		     // return valid;
			}
			else{
				valid=false;
				//return valid;
			}	    
		    
		}
		catch(Exception ae){
			//JOptionPane.showMessageDialog(null, ae);	
		}

	/*	finally{
			try{
			
		     		con.close();
			        stmt.close();
			}
			catch(SQLException e){

		}
		}*/
	return valid;


	}
	
	


	

}
