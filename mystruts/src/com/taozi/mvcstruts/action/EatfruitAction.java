package com.taozi.mvcstruts.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.taozi.mvcstruts.froms.ActionForm;
import com.taozi.mvcstruts.froms.EatfruitForm;
import com.taozi.mvcstruts.service.EatActionInterface;

/**
 * 吃水果的处理逻辑
 * @author taozi
 *
 */
public class EatfruitAction implements EatActionInterface {

	@Override
	public void executeEat(HttpServletRequest request, HttpServletResponse response, ActionForm form, Map<String, String> actionForeard) {
		
		String eatGrape = request.getParameter("eatGrape");
		String eatWatermelon = request.getParameter("eatWatermelon");
		String eatDragon = request.getParameter("eatDragon");
		String eatBanana = request.getParameter("eatBanana");
		String eatStrawberry = request.getParameter("eatStrawberry");
		String eatApple = request.getParameter("eatApple");
		String eatPear = request.getParameter("eatPear");
		String eatKiwi = request.getParameter("eatKiwi");
		System.out.println("吃水果啦");
		String forwardSuccessPath = actionForeard.get("success");
		EatfruitForm eatf = new EatfruitForm();
		eatf.setEatGrape(eatGrape);
		eatf.setEatWatermelon(eatWatermelon);
		eatf.setEatDragon(eatDragon);
		eatf.setEatBanana(eatBanana);
		eatf.setEatStrawberry(eatStrawberry);
		eatf.setEatApple(eatApple);
		eatf.setEatPear(eatPear);
		eatf.setEatKiwi(eatKiwi);
		
		request.setAttribute("eatf", eatf);
		try {
			//转发器，跳转页面
			request.getRequestDispatcher(forwardSuccessPath).forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}


}
