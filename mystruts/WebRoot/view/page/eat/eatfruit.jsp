<%@ page language="java" import="com.taozi.mvcstruts.froms.EatfruitForm" pageEncoding="UTF-8"%>

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
  	<%
  		EatfruitForm eatf = (EatfruitForm)request.getAttribute("eatf");
  	 %>
  <div>
  	夏天到了，要多多吃水果,水果有<br/>
  	<%=eatf.getEatGrape() == null ? "" : eatf.getEatGrape() %><br/>
  	<%=eatf.getEatWatermelon() == null ? "" : eatf.getEatWatermelon() %><br/>
  	<%=eatf.getEatDragon() == null ? "" : eatf.getEatDragon() %><br/>
  	<%=eatf.getEatBanana() == null ? "" : eatf.getEatBanana() %><br/>
  	<%=eatf.getEatStrawberry() == null ? "" : eatf.getEatStrawberry() %><br/>
  	<%=eatf.getEatApple() == null ? "" : eatf.getEatApple() %><br/>
  	<%=eatf.getEatPear() == null ? "" : eatf.getEatPear() %><br/>
  	<%=eatf.getEatKiwi() == null ? "" : eatf.getEatKiwi() %><br/><br/>
  	
  	周一吃苹果 <br/>
  	周二吃梨子<br/>
  	周三吃香蕉<br/>
  	周四吃猕猴桃<br/>
  	周五吃葡萄<br/>
  	周六吃草莓、香瓜、甜瓜、哈密瓜、西瓜、羊角蜜瓜<br/>
  	周日吃火龙果<br/>
  </div>
    
  </body>
</html>
