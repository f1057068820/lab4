<%@ page language="java" import="java.util.*,biao.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'booklist.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <table width="706" border="1" align="center">
  <tr>
     <td colspan="6" align="center" >图书列表</td>
   </tr>
  </table>
    <table width="706" border="1" align="center">
   <tr>
     <td width="180" colspan="1" align="left" >书名</td>
      <td width="180" colspan="12" align="right" >操作</td>
   </tr>
    <%
    	List list=(List)request.getAttribute("list");
    	
    	Iterator iter=list.iterator();
    	while(iter.hasNext())
    	{
    		book book=(book)iter.next();
    	%>
    	<tr>
		<td align="lfet"> <form  name="form" method='post' action='showbook'> 
		  <input type="hidden" name="title" value=<%=book.getTitle()%>>
		  <input type="submit" name="action" value=<%=book.getTitle()%> ></form></td>
		<td align="right"> <form  name="form" method='post' action='deletebook'> 
		  <input type="hidden" name="title" value=<%=book.getTitle()%>>
		  <input type="submit" name="action" value="delete" ></form></td>
		</tr>
    	<% 
    	} 
    	%>
    </table>
    <table width="706" border="1" align="center">
    	<tr>
    	<td align="right"> 
    		<form  name="form" method="post" action="addbook.jsp"> 
    		
      		<input type="submit"  value="add" ></form></td>
		</tr>
		
	</table>
	
 	<p><a href="main.jsp">返回</a></p>
  </body>
</html>
