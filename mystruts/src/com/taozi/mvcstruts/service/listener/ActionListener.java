package com.taozi.mvcstruts.service.listener;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.taozi.mvcstruts.froms.ActionConfig;
import com.taozi.mvcstruts.utils.domxml.DomXml;

public class ActionListener implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("吃货世界已经注销！");
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		ServletContext context = sce.getServletContext();
		String xmlfath = context.getInitParameter("struts-config");//配置文件.xml前的名称
		String tomcatpath = context.getRealPath(xmlfath);
		try {
			Map<String , ActionConfig> map = DomXml.parseConfigFile(tomcatpath);
			context.setAttribute("struts2", map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("吃货世界加载成功");
	}

}
