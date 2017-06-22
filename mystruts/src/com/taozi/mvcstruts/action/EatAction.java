package com.taozi.mvcstruts.action;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.taozi.mvcstruts.froms.ActionForm;
import com.taozi.mvcstruts.service.EatActionInterface;

/**
 * 吃货凭证的处理逻辑(本Action没有对应的form,具体看struts-config.xml)
 * @author taozi
 *
 */
public class EatAction implements EatActionInterface {

	@Override
	public void executeEat(HttpServletRequest request, HttpServletResponse response, ActionForm form, Map<String, String> actionForeard) {
		String name = request.getParameter("name");
		System.out.println("吃好吃的啦");
		String forwardSuccessPath = actionForeard.get("success");
		String forwardFailPath = actionForeard.get("fail");
		if("taozi".equals(name)) {
			try {
				request.getRequestDispatcher(forwardSuccessPath).forward(request, response);//转发器，跳转页面
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			try {
				request.getRequestDispatcher(forwardFailPath).forward(request, response);//转发器，跳转页面
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}


}
