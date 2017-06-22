package com.taozi.mvcstruts.utils.full;

import java.lang.reflect.Field;

import javax.servlet.http.HttpServletRequest;

import com.taozi.mvcstruts.froms.ActionForm;

public class FullForm {
	
	public FullForm(){}
	
	public static ActionForm executeFull(String fullPath, HttpServletRequest request) {
		
		ActionForm af = null;
		try {
			Class clazz = Class.forName(fullPath);
			af = (ActionForm) clazz.newInstance();
			Field[] fields = clazz.getDeclaredFields();
			for(Field fi : fields) {
				fi.setAccessible(true);
				fi.set(af, request.getParameter(fi.getName()));
				fi.setAccessible(false);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return af;
	}

}
