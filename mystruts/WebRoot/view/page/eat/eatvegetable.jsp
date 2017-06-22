<%@ page language="java" import=" com.taozi.mvcstruts.froms.EatvegetableForm" pageEncoding="UTF-8"%>

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
  		EatvegetableForm eatv = (EatvegetableForm)request.getAttribute("eatv");
  	 %>
  <div>
  	夏天到了，要多多吃蔬菜,蔬菜有<br/>
  	<%=eatv.getEatCarrot() == null ? "" : eatv.getEatCarrot() %><br/>
  	<%=eatv.getEatPotatoe() == null ? "" : eatv.getEatPotatoe() %><br/>
  	<%=eatv.getEatCucumber() == null ? "" : eatv.getEatCucumber() %><br/>
  	<%=eatv.getEatTomatoe() == null ? "" : eatv.getEatTomatoe() %><br/>
  	<%=eatv.getEatMelon() == null ? "" : eatv.getEatMelon() %><br/>
  	<%=eatv.getEatChicken() == null ? "" : eatv.getEatChicken() %><br/>
  	<%=eatv.getEatFish() == null ? "" : eatv.getEatFish() %><br/>
  	<%=eatv.getEatLamb() == null ? "" : eatv.getEatLamb() %><br/>
  	<%=eatv.getEatBeef() == null ? "" : eatv.getEatBeef() %><br/>
  	<%=eatv.getEatEggplant() == null ? "" : eatv.getEatEggplant() %><br/><br/>
  	
  	周一吃胡萝卜<br/>
  	周二吃土豆<br/>
  	周三吃黄瓜<br/>
  	周四吃西红柿<br/>
  	周五吃冬瓜<br/>
  	周六吃鸡肉、鱼、羊肉、牛肉<br/>
  	周日吃茄子<br/>
  </div>
    
  </body>
</html>
