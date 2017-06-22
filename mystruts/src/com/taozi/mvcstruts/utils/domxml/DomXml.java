package com.taozi.mvcstruts.utils.domxml;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.taozi.mvcstruts.froms.ActionConfig;

/**
 * Document 解析xml
 * @author taozi
 *
 */
public class DomXml {

	/**
	 * 解析配置文件struts-config
	 */
	public static Map<String, ActionConfig> parseConfigFile(String fileName) {
		Map<String, ActionConfig> map = new HashMap<String, ActionConfig>();
		SAXReader reader = new SAXReader();
		try {
			Document doc = reader.read(new File(fileName));
			Element root = doc.getRootElement(); //创建根节点对象
			//解析form
			Element elementForm = root.element("forms");
			List<Element> listElementForm = elementForm.elements();
			Map<String, String> formMap = new HashMap<String, String>();
			for(Element formNode : listElementForm) {
				//将form节点的name,type属性值获取到
				String name = formNode.attributeValue("name");
				String formType = formNode.attributeValue("type");
				formMap.put(name, formType);
			}
			//解析action
			Element elementAction = root.element("action-mappering"); //得到根节点
			List<Element> listElementAction = elementAction.elements();//获取跟节点集合
			for(Element actionNode : listElementAction) {
				//封装成ActionConfig对象，保存到map中。
				ActionConfig config = new ActionConfig();
				//将action节点的name, class, method属性值获取到。
				String name = actionNode.attributeValue("name");
				String actionClass = actionNode.attributeValue("class");
				String actionMethod = actionNode.attributeValue("method");
				String formType = formMap.get(name);
				config.setName(name);
				config.setClazz(actionClass);
				config.setMethod(actionMethod);
				config.setType(formType);
				//遍历action节点下的result子节点(页面跳转)
				Iterator itrNodes = actionNode.selectNodes("result").iterator();
				while(itrNodes.hasNext()){
					Element forwardNode = (Element)itrNodes.next();
					String forwardName = forwardNode.attributeValue("name");
					if(forwardName == null || "".equals(forwardName)){
						forwardName = "fail";
					}
					String forwardPath = forwardNode.getTextTrim();
					config.getResultMap().put(forwardName, forwardPath);
				}
				map.put(actionMethod, config);
			}
			System.out.println(map);			
		} catch (DocumentException e) {
			e.printStackTrace();
			map = null;
		}
		return map;
	}

	public static void main(String[] args) {
		String fileName = "E:/Tomcat_Study/apache-tomcat-8.0.12_mvcstruts/webapps/mvc_struts/WEB-INF/classes/struts-config.xml";
		parseConfigFile(fileName);
	}
}
