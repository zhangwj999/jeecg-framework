package com.pub;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class RepSendJson {
	
	private static Log log = LogFactory.getLog(RepSendJson.class);
	public  static void sendJson(Object obj,HttpServletResponse rep){
		
		String jsonString =JsonUtil.object2json(obj);
		
		//rep.setContentType("text/plain");
		try {
			PrintWriter out = rep.getWriter();
			out.write(jsonString);
			out.close();
		} catch (IOException e) {
			log.debug("e.getMessage==="+e.getMessage());
		}
		
	}
public  static void sendJson(Object obj,HttpServletResponse rep,String encoding){
		
		String jsonString =JsonUtil.object2json(obj);
		
		try {
			
			rep.setContentType("application/json;charset="+encoding); 
			rep.setCharacterEncoding(encoding); 
			 PrintWriter out = rep.getWriter();
			out.write(jsonString);
			out.close();
		} catch (IOException e) {
			log.debug("e.getMessage==="+e.getMessage());
		}
		
	}

}
