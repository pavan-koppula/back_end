package com.servletfilters;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet Filter implementation class SFilter2
 */

@WebFilter("/Sf")
public class SFilter2 extends HttpFilter implements Filter {
       
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * @see HttpFilter#HttpFilter()
     */
    public SFilter2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroyed");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		System.out.println("we are at dofilter");
		
		HttpServletRequest htreq=(HttpServletRequest) request;
		
		String uname=htreq.getParameter("uname");
		String pass=htreq.getParameter("pass");
		System.out.println(uname.getClass());
		System.out.println(pass);
		String un="pavan";
		
		if (uname.length()==5 ) {
			System.out.println("correct");
			chain.doFilter(request, response);//default connection to web servlet
		}else {
			System.out.println("incorrect");
			RequestDispatcher rqdis = htreq.getRequestDispatcher("incorrect.html");	
			rqdis.include(htreq, response);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init loded");
	}

}
