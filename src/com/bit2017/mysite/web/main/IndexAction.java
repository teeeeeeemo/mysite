package com.bit2017.mysite.web.main;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit2017.web.Action;
import com.bit2017.web.util.WebUtil;

public class IndexAction implements Action {
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		WebUtil.forward( "/WEB-INF/views/main/index.jsp", request, response);
	}

}
