package com.callentry.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.callentry.model.User;
import com.callentry.util.IConstants;

public class UserFilter implements Filter {

	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpSession session = ((HttpServletRequest) request).getSession();
		Boolean loggedin = (Boolean) session.getAttribute("loggedin");
		User user = (User) session.getAttribute("user");
		if (loggedin != null && loggedin == true && user != null
				&& user.getUserType() == IConstants.USER) {
			chain.doFilter(request, response);
		} else {
			System.out.println("user is not logged in.... or unauthorised access..");
			((HttpServletResponse) response).sendRedirect("/callentry");
		}
	}

	@Override
	public void init(FilterConfig config) throws ServletException {

	}

}
