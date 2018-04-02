package com.rongdu.cashloan.api.filter;


import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class myCORSFilter implements Filter
{
     @Override
     public void init(FilterConfig filterConfig) throws ServletException {

     }
     @Override
     public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException
     {
         HttpServletResponse response = (HttpServletResponse) servletResponse;
         HttpServletRequest reqs = (HttpServletRequest)servletRequest;
         String origin = (String) servletRequest.getRemoteHost()+":"+servletRequest.getRemotePort();
         response.setHeader("Access-Control-Allow-Origin", reqs.getHeader("Origin"));
         response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
         response.setHeader("Access-Control-Max-Age", "3600");
         response.setHeader("Access-Control-Allow-Headers", "x-requested-with,Authorization,signMsg,token");
         response.setHeader("Access-Control-Allow-Credentials","true");
         filterChain.doFilter(servletRequest, servletResponse);
     }
     @Override
     public void destroy() {    }
}
