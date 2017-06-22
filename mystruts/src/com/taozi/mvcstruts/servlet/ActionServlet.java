package com.taozi.mvcstruts.servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.taozi.mvcstruts.froms.ActionConfig;
import com.taozi.mvcstruts.froms.ActionForm;
import com.taozi.mvcstruts.service.EatActionInterface;
import com.taozi.mvcstruts.utils.full.FullForm;


/**
 * 加载解析配置文件,并处理请求的action
 * @author taozi
 *
 */
public class ActionServlet extends HttpServlet {

	private static final long serialVersionUID = -647500189336723468L;

	private static final String CODING = "utf-8";
	
	public ActionServlet() {}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding(CODING);
		response.setCharacterEncoding(CODING);
		//获取uri
		String requestURI = request.getRequestURI(); // /mvc_struts/eatFruit.go
		String uri = parseURI(requestURI); // /eatFruit
		System.out.println("uri="+uri);		
		Map<String, ActionConfig> map = (Map<String, ActionConfig>) this.getServletContext().getAttribute("struts2");//之后这个可以做成监听,放到map缓存中
		ActionConfig aconfig = map.get(uri);
		if(aconfig != null) {
			String formType = aconfig.getType();
			ActionForm af = null;
			if(formType != "" && formType != null) {
				af = FullForm.executeFull(formType, request);
			}
			String actionClass = aconfig.getClazz();
			try {
				Class clazz = Class.forName(actionClass);
				EatActionInterface eat = (EatActionInterface) clazz.newInstance();
				eat.executeEat(request, response, af, aconfig.getResultMap());
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		} else {
			request.getRequestDispatcher("/view/page/failall.jsp").forward(request, response);//转发器，跳转页面
		}
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}
	public void init() throws ServletException {
		
	}
    public void destroy() {
    	
    }
    /** 解析URl **/  
    protected String parseURI(String uri) {
        return uri.substring(uri.indexOf("/",1),uri.indexOf("."));  
    }

}
