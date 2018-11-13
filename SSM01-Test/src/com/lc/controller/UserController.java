package com.lc.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lc.pojo.User;
import com.lc.service.impl.UserServiceImpl;

@Controller
public class UserController {
	Logger logger=Logger.getLogger(UserController.class);
	HttpSession hs=null;
	@Resource
	private UserServiceImpl userServiceImpl;
	@RequestMapping("user")
	public void opreate(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		String oper=req.getParameter("oper");
		if(oper!=null){
			switch (oper) {
			case "login":
				checkUserLogin(req,resp);
				break;
	        case "register":
				checkUserRegister(req,resp);
				break;
	        case "out":
				UserOut(req,resp);
				break;
	        case "newpwd":
				newpwd(req,resp);
				break;
	        case "show":
				showUserInfo(req,resp);
				break;
			default:
				logger.debug("未找到对应操作符");
				break;
			}
		}
		
	}
	private void showUserInfo(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<User> lu=null;
		lu=userServiceImpl.showUser();
		if(lu!=null){
		req.setAttribute("userinfo", lu);
		req.getRequestDispatcher("/main/userinfo.jsp").forward(req, resp);
		}
	}

	private void newpwd(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// TODO Auto-generated method stub
		String newpwd=req.getParameter("newpwd");
		int uid=((User)req.getSession().getAttribute("user")).getUid();
		int index= userServiceImpl.changepwd(uid,newpwd);
		if(index>0){
			resp.sendRedirect("/SSM01-Test/Lc777");
		}else{
			req.getRequestDispatcher("/main/main.jsp");
		}
		System.out.println(index);
	}

	private void UserOut(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// TODO Auto-generated method stub
		hs=req.getSession();
		hs.invalidate();
		resp.sendRedirect("Lc777");
	}

	private void checkUserRegister(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		
	}

	private void checkUserLogin(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		String uname=req.getParameter("uname");
		String pwd=req.getParameter("pwd");
		System.out.println(uname+pwd);
		User u=userServiceImpl.checkLoginService(uname, pwd);
		System.out.println(u);
		if(u!=null){
			hs=req.getSession();
			hs.setAttribute("uname", req.getParameter("uname"));
			hs.setAttribute("user", u);
			System.out.println(hs.getAttribute("uname"));
			resp.sendRedirect("/SSM01-Test/main/main.jsp");
		}else{
			req.setAttribute("flag", "false");
			req.getRequestDispatcher("/Lc777").forward(req, resp);
		}
	
	}
}
