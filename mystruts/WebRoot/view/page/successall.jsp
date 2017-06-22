<%@ page language="java" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>    
    <title>好好吃饭</title>    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  
  <body>
  	<div align="center" style="margin-top: 10%">
  		亲,请选择吃的种类
  		<form action="/mystruts/eatFruit.go" method="post">
	    	<input name="eatGrape" type="hidden" value="葡萄"/>
	    	<input name="eatWatermelon" type="hidden" value="西瓜"/>
	    	<input name="eatDragon" type="hidden" value="火龙果"/>
	    	<input name="eatBanana" type="hidden" value="香蕉"/>
	    	<input name="eatStrawberry" type="hidden" value="草莓"/>
	    	<input name="eatApple" type="hidden" value="苹果"/>
	    	<input name="eatPear" type="hidden" value="梨"/>
	    	<input name="eatKiwi" type="hidden" value="猕猴桃"/>
	    	<input type="submit" value="吃水果"/>
    	</form>
    	<form action="/mystruts/eatVegetable.go" method="post">
	    	<input name="eatCarrot" type="hidden" value="胡萝卜"/>
	    	<input name="eatPotatoe" type="hidden" value="土豆"/>
	    	<input name="eatCucumber" type="hidden" value="黄瓜"/>
	    	<input name="eatTomatoe" type="hidden" value="西红柿"/>
	    	<input name="eatMelon" type="hidden" value="冬瓜"/>
	    	<input name="eatChicken" type="hidden" value="鸡肉"/>
	    	<input name="eatFish" type="hidden" value="鱼"/>
	    	<input name="eatLamb" type="hidden" value="羊肉"/>
	    	<input name="eatBeef" type="hidden" value="牛肉"/>
	    	<input name="eatEggplant" type="hidden" value="茄子"/>
	    	<input type="submit" value="吃蔬菜"/>
    	</form>
  	</div>
  </body>
</html>
