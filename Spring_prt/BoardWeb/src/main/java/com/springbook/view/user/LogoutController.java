package com.springbook.view.user;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogoutController {

	//Spring �����̳ʿ� ���°� ���µ� �ϴ�.
	@RequestMapping("/logout.do")
	public String logout(HttpSession session){
		session.invalidate();
		return "login.jsp";
	}
	
	/*@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("�α׾ƿ� ó��");
		
		//1. �������� ����� ���� ��ü�� ���� ����
		HttpSession session = request.getSession();
		session.invalidate();
		
		//2 ���� ������, ���� ȭ������ �̵�.
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:login.jsp");
		return mav;
	}
*/
	/*@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("�α׾ƿ� ó��");
		
		//1. �������� ����� ���� ��ü�� ���� ����
		HttpSession session = request.getSession();
		session.invalidate();
		
		//2 ���� ������, ���� ȭ������ �̵�.
		return "login";
	}
*/
}