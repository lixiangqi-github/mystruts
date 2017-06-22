package com.taozi.mvcstruts.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.taozi.mvcstruts.froms.ActionForm;

/**
 * 吃的接口
 * @author taozi
 *
 */
public abstract interface EatActionInterface {

	public void executeEat(HttpServletRequest request, HttpServletResponse response, ActionForm form, Map<String,String> actionForeard);
	
}
