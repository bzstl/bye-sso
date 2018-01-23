package com.bye.sso.controller;

import java.util.HashMap;
import java.util.UUID;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bye.common.pojo.Result;
import com.bye.disk.mapper.TestMapper;
import com.bye.disk.pojo.Test;

@Controller
public class TestController {
	@Autowired
	TestMapper testMapper;
	
	@RequestMapping("/testhttp")
	public @ResponseBody Result getName(HttpServletRequest request,HttpServletResponse response) {
		
/*		Cookie[] cookies = request.getCookies();
		
		for (int i = 0; cookies!=null && i < cookies.length; i++) {
			Cookie c =cookies[i];
			if ("byeSession".equals(c.getName())) {
				return Result.ok(httpSession.getAttribute(c.getValue()));
			}
		}
		
			String uuid = UUID.randomUUID().toString();
			Cookie cookie = new Cookie("byeSession", uuid);
			cookie.setMaxAge(60*5);
			response.addCookie(cookie);
			HashMap<String, Object> map = new HashMap<String,Object>();
			map.put("name", "bzs");
			httpSession.setAttribute(uuid, map);*/
			
		HttpSession session = request.getSession();
		session.setAttribute("name", "bzs");
		return Result.ok(session.getAttribute("name"));
	}
	
	@RequestMapping("/testhttp2")
	public @ResponseBody Result getName2(HttpServletRequest request,HttpServletResponse response) {
		
/*		Cookie[] cookies = request.getCookies();
		
		for (int i = 0; cookies!=null && i < cookies.length; i++) {
			Cookie c =cookies[i];
			if ("byeSession".equals(c.getName())) {
				return Result.ok(httpSession.getAttribute(c.getValue()));
			}
		}
		
			String uuid = UUID.randomUUID().toString();
			Cookie cookie = new Cookie("byeSession", uuid);
			cookie.setMaxAge(60*5);
			response.addCookie(cookie);
			HashMap<String, Object> map = new HashMap<String,Object>();
			map.put("name", "bzs");
			httpSession.setAttribute(uuid, map);*/
			
		HttpSession session = request.getSession();
		return Result.ok(session.getAttribute("name"));
	}
	
	@RequestMapping("/login")
	public String  hello() {
		

		
		return "hello";
	}
}
