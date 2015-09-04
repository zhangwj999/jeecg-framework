package com.pub;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;


/**
 * 包装类，把form表单包装成javabean
 * @author Administrator
 *
 */
public class ModuleToBeanWarrp {
	/**
	 * 根据bean的结构，把表单转成javabean
	 * @param request
	 * @param bean
	 * @return
	 */
	public static Object FromToBean(HttpServletRequest request,Object bean){
		 Field[]  field=bean.getClass().getDeclaredFields();
		 for(int i=0;i<field.length;i++){
			 field[i].setAccessible(true);
			 String name =field[i].getName();
			String parm =request.getParameter(field[i].getName());
			try {
				BeanUtils.setProperty(bean, name, parm);
			} catch (IllegalAccessException e) {	
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
			
		 }
		return bean;
	}
	/**
	 * 功能：传输json到页面
	 * 
	 */
	public static void formToJson(HttpServletRequest request, HttpServletResponse response,Object obj){
		response.setContentType("application/json");
		response.setHeader("Cache-Control", "no-store");
		try {
			PrintWriter pw=response.getWriter();
			pw.write(obj.toString());
			pw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 功能：传输text到页面
	 * 
	 */
	public static void formToText(HttpServletRequest request, HttpServletResponse response,Object obj){
		response.setContentType("application/text");
		response.setHeader("Cache-Control", "no-store");
		try {
			PrintWriter pw=response.getWriter();
			pw.write(obj.toString());
			pw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
