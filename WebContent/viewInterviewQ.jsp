<!DOCTYPE html>
<html lang="en">
<%@page import="beans.*" %>
<%@page import="model.*" %>
<%@page import="java.util.*" %>
<head>
<title>View Written Questions</title>
<meta charset="utf-8">
<link rel="stylesheet" href="css/reset.css" type="text/css" media="all">
<link rel="stylesheet" href="css/layout.css" type="text/css" media="all">
<link rel="stylesheet" href="css/style.css" type="text/css" media="all">
<script type="text/javascript" src="js/jquery-1.5.2.js" ></script>
<script type="text/javascript" src="js/cufon-yui.js"></script>
<script type="text/javascript" src="js/cufon-replace.js"></script>
<script type="text/javascript" src="js/Molengo_400.font.js"></script>
<script type="text/javascript" src="js/Expletus_Sans_400.font.js"></script>
<!--[if lt IE 9]>
<script type="text/javascript" src="js/html5.js"></script>
<style type="text/css">
	.bg, .box2 {behavior:url(js/PIE.htc)}
</style>
<![endif]-->
<!--[if lt IE 7]>
	<div style=' clear: both; text-align:center; position: relative;'>
		<a href="http://www.microsoft.com/windows/internet-explorer/default.aspx?ocid=ie6_countdown_bannercode">
		<img src="http://www.theie6countdown.com/images/upgrade.jpg" border="0"  alt="" /></a>
	</div>
<![endif]-->
</head>

<body id="page1">
	<div class="body1">
		<div class="main">
<!-- header -->
			<header>
				<div class="wrapper">
					<nav>
					<%String u=Login.getUname(); %>
						<ul id="menu">
						<li><a href="userHome.jsp"><%=u %></a></li>
							<li><a href="editProfile.jsp">Edit Profile</a></li>
							<li><a href="companyList.jsp">Placement Preparation</a></li>
							<li><a href="signOut.jsp">Sign Out</a></li>
						</ul>
					</nav>

	<%if(u==null){
						%>
						<jsp:forward page="login.jsp" />
					<%} %>
				


					
				</div>
				<div class="wrapper">
					<h1><a href="index.jsp" id="logo">PLACEMENT PREPARATION</a></h1>
				</div>
				
				<div id="slogan">
					PLACEMENT PREPARATION
					</div>
				
				<br>
				<ul class="banners">
					<li><a href="#"><img src="images/banner1.jpg" alt=""></a></li>
					</ul>
					
					<div id="slogan">
					We Will Open The World<span><br>of knowledge for you!</span>
				</div>
				<br>
					
			</header>
<!-- / header -->
		</div>
	</div>
	<br>
	<br>
<article class="col_4 pad_left2">

<%
//SelectCompany sel=new SelectCompany();
SelectCompany sel=new SelectCompany();

List topics=DAO.getIQuestions(sel);
AddComment ac=new AddComment();
List comment=DAO.getComments(ac,sel);
%>

<center class="font1"><h1 align="center"><%=sel.getCompany()%></h1></center>
<br>

	                                
<%	                                  
int i=1;
for(Object obj:topics){
AddI t=(AddI)obj;	
	i++;
	%>
		
		
		                    <br>  
		                <br>
		                <br>   
		                <table>   	
		  				<tr><td>	<h3 align="left">Question:</h3>
							
							<div class="pad_top2"><%=t.getQues() %></div></td>
							<% 
							int j=1;
							for(Object ob:comment){
								AddComment a=(AddComment)ob;
								j++;
								%>
	
								<div class="pad_top2"><%=a.getCmnt() %></div>
						<%	}
							
							
							%>
							
							
							 </tr>
							</article>
		
		
			  
	




									
<form id="comment" action="AddCommentServlet" method="post">
                                             <div class="wrapper">
                 
                             <input type="hidden" name="cname" value="<%=t.getCname() %>"/></div>
											<td>
											
											<br>
											<br>
				
					<br>
					<tr>
					<td>
						<div class="bg">
					<br><h3>Comment:</h3><textarea cols="5" rows="2" class="textarea1" name="cmnt"></textarea>
					</div>
										</td>
										</tr>
										
										
										
									
											
											

									</table>
										<br>
										<h3></h3>
										<div class="wrapper">
										<div class="bg"><input type="hidden" name="uname" value="<%=Login.getUname()%>"></div>
										
										
										</div>

                      
                      
<a href="#" class="button" onclick="document.getElementById('comment').submit()"><span><span><strong>Share</strong></span></span></a>
<a href="#" class="button" onclick="location.href='viewInterviewQ.jsp'"><span><span><strong>Reset</strong></span></span></a>


<%} %>
								</article>
	
	