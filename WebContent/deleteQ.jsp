<!DOCTYPE html>
<%@page import="beans.*"%>
<%@page import="model.*" %>
<%@page import="java.util.* "%>
<html lang="en">
<head>
<title>Home</title>
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
				
<article class="col_4 pad_left2">
<p class="font1">
<%String a=(String)request.getAttribute("mesg");
if(a!=null)
out.println(a);%>

<form id="deleteq" action="DelServlet" method="post">
<table  align="center" cellspacing="0" cellpadding="0" border="0" width="300%">
				<tr>
				
				<th width="25%">Question<th>
				<th width="25%">Company</th>
				<th width="25%"></th>
				</tr>

<%
	                                
	                                                              	
	                                    
	                                  
	                                  
	                                  List topics=DAO.getQuestions();
	                                
	                                  
	                                 
int i=1,j=1;
for(Object obj:topics){
AddW t=(AddW)obj;	
	i++;
	%>





				
				
				<tr>
				<td valign="top"><table cellspacing="0" cellpadding="0" border="0" width="300%">
				<tr>
				<td width="49%"><%=t.getQues() %></td>
				<td width="49%"><%=t.getCname() %></td>
				<td width="49%"><a href="del.jsp?id=<%=t.getQues() %>"/>Delete</a></td>
				</tr>
				
				</table>
				</tr>
				</table>
				
				
				
				
				
				
				<%} %>
				
				
				
				
				
				</form>
				<article>