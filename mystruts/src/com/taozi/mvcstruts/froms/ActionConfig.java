package com.taozi.mvcstruts.froms;

import java.util.HashMap;
import java.util.Map;

/**
 * 配置文件实体
 * @author taozi
 *
 */
public class ActionConfig{

	private String name;
	private String clazz;
	private String method;
	private String type;
	Map<String, String> resultMap = new HashMap<String, String>();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClazz() {
		return clazz;
	}
	public void setClazz(String clazz) {
		this.clazz = clazz;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public Map<String, String> getResultMap() {
		return resultMap;
	}
	public void setResultMap(Map<String, String> resultMap) {
		this.resultMap = resultMap;
	}
	@Override
	public String toString() {
		return "ActionConfig [name=" + name + ", clazz=" + clazz + ", method="
				+ method + ", type=" + type + ", resultMap=" + resultMap + "]";
	}
	
}
