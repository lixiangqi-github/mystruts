package com.taozi.mvcstruts.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.taozi.mvcstruts.froms.ActionForm;
import com.taozi.mvcstruts.froms.EatvegetableForm;
import com.taozi.mvcstruts.service.EatActionInterface;

/**
 * 吃蔬菜的处理逻辑
 * @author taozi
 *
 */
public class EatvegetableAction implements EatActionInterface {

	@Override
	public void executeEat(HttpServletRequest request, HttpServletResponse response, ActionForm form, Map<String, String> actionForeard) {
		String eatCarrot = request.getParameter("eatCarrot");
		String eatPotatoe = request.getParameter("eatPotatoe");
		String eatCucumber = request.getParameter("eatCucumber");
		String eatTomatoe = request.getParameter("eatTomatoe");
		String eatMelon = request.getParameter("eatMelon");
		String eatChicken = request.getParameter("eatChicken");
		String eatFish = request.getParameter("eatFish");
		String eatLamb = request.getParameter("eatLamb");
		String eatBeef = request.getParameter("eatBeef");
		String eatEggplant = request.getParameter("eatEggplant");
		System.out.println("吃蔬菜啦");
		String forwardSuccessPath = actionForeard.get("success");
		EatvegetableForm eatv = new EatvegetableForm();
		eatv.setEatCarrot(eatCarrot);
		eatv.setEatPotatoe(eatPotatoe);
		eatv.setEatCucumber(eatCucumber);
		eatv.setEatTomatoe(eatTomatoe);
		eatv.setEatMelon(eatMelon);
		eatv.setEatChicken(eatChicken);
		eatv.setEatFish(eatFish);
		eatv.setEatLamb(eatLamb);
		eatv.setEatBeef(eatBeef);
		eatv.setEatEggplant(eatEggplant);
		
		request.setAttribute("eatv", eatv);
		try {
			//转发器，跳转页面
			request.getRequestDispatcher(forwardSuccessPath).forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
	}

}
