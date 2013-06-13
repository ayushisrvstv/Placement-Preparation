<!DOCTYPE html>
<html lang="en">
<%@page import="model.*" %>
<%@page import="beans.*" %>
<%@page import="java.util.*" %>
<head>
<title>AdminHome</title>
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
						<ul id="menu">
							<li><a href="adminHome.jsp">Home</a></li>
							<li><a href="editProfile.jsp">Edit Profile</a></li>
							<li><a href="companyList.jsp">Placement Preparation</a></li>
							<li><a href="contact.jsp">Contact Us</a></li>
							<li><a href="signOut.jsp">Sign Out</a></li>
						</ul>
					</nav>
					
					
	\				
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
					
		</div>
	</div>
	
	
	
	
				<br>
				<br>
				
	<%List topics=DAO.getCompanies();%>
		
				
				<br>                    	<form id="addCompany" action="AddCompanyServlet" method="post">
				<br> 
	<select>			
				<%
int i=1;
for(Object obj:topics){
AddCompany t=(AddCompany)obj;	
	i++;
	%>
				
				<option><%=t.getCname() %></option>
				
				
			  
	
<%} %>
</select>	
	<center>
	
                                               <h3>
                                             <%
                                           String a=(String)request.getAttribute("mesg");
                                           if(a!=null)
                                           out.println(a);
                                           
                                           
                                           %>
                                           </h3>

	
	
										<h3>Add Company:</h3>
										<div class="wrapper">
										<br>
									
										<div class="bg"><input class="tb5" type="text" name="cname"></div>
										
										
										</div>
										<br>
										<h3>Address 1:</h3>
										<div class="wrapper">
										<br>
									
										<div class="bg"><input class="tb5" type="text" name="addr1"></div>
										
										
										</div>
										<br>
										<h3>Address 2:</h3>
										<div class="wrapper">
										<br>
									
										<div class="bg"><input class="tb5" type="text" name="addr2"></div>
										
										
										</div>
				
				
				<br>
				<br>
				
				
				<a href="#" class="button" onclick="document.getElementById('addCompany').submit()"><span><span><strong>Add</strong></span></span></a>
<a href="#" class="button" onclick="location.href='addCompany.jsp'"><span><span><strong>Reset</strong></span></span></a>
									
									</center>
									</form>
				
				