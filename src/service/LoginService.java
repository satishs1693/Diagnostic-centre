package service;

import beans.Basic;
import javax.servlet.http.HttpServlet;


import daoimplementation.LoginDAO;

/**
 * Servlet implementation class LoginService
 */
public class LoginService extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	public boolean checkUser(Basic user) 
	 {
		  //Sivaram chaged
		 LoginDAO loginDAO=new LoginDAO();
		 return loginDAO.checkUser(user);    
		} 
}
