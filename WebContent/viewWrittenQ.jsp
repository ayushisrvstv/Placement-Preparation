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
					
				<div class="col_4 pad_left2">
				
				
				  <%
	                                
	                                                              	
	                                    
	                                  SelectCompany sel=new SelectCompany();
				  
	                                  
	                                  List topics=DAO.getWrittenQ(sel);
	                                  %>
	                                 <h3 class="font1"><%=sel.getCompany()%></h3>
	                                  
	                                  <%
	                                  int i=1;
	                                  for(Object obj:topics){
	                                  AddW t=(AddW)obj;	
	                                  	i++;
	                                   
	                                  
	                                  
	                       %>   
	                       
	                        
	            <!--span class="font1">
	            <p>Company:   <%=SelectCompany.getCompany() %></p>
	                 </span-->
				  <table  align="center" cellspacing="0" cellpadding="0" border="0" width="100%">
				  <tr>
				  
				  <td valign="top"><b><p>Q.<%=t.getQues() %></p></b></td></tr>
			<tr>
		<td valign="top"><table cellspacing="0" cellpadding="0" border="0" width="300%">
		<tr>
		<td width="15%"><p>A. <%=t.getOpA() %></p></td>
		<td width="15%"><p>B. <%=t.getOpB() %></p></td>
		<td width="15%"><p>C. <%=t.getOpC() %></p></td>
		<td width="15%"><p>D. <%=t.getOpD() %></p></td>
		</tr>
		<tr>
		<td width="15%"><b><p>Ans. <%=t.getAns() %></p></b></td>
		</tr>
		
		</table></td></tr>
		
		
		
			  
	
<%}
%>


</table>

</div>

	