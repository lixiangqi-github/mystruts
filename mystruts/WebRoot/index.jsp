<%@ page language="java" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>吃货桃子</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  <body>
  <div align="center" style="margin-top: 14%">
    	<h1>欢迎来到吃货的世界</h1>
    	<form action="/mystruts/eat.go" method="post">
	    	请输入吃货凭证：<input name="name" value="" type="text"/>
	    	<input type="submit" value="验证"/>
    	</form>
  </div>
  </body>
</html>
