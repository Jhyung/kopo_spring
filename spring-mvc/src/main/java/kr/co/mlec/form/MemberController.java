package kr.co.mlec.form;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/form")
public class MemberController {
	
	@RequestMapping("/joinForm.do")
	public String joinForm() {
		return "form/joinForm";
	}
	
	// MemberVO를 사용하기 위해선 멤버인자의 이름이 꼭 같아야 한다. (줄때와 받을때의 이름이 꼭 같아야 함)
	// MemberVO로 받으면 자동으로 request공유영역에 등록까지 함. class이름으로(단, 첫글자는 소문자)
	@RequestMapping("/join.do")
	public String join(MemberVO member, Model model) {
//		System.out.println(member.getId());
//		System.out.println(member.getPassword());
//		System.out.println(member.getName());
		System.out.println(member);
		model.addAttribute("msg", "가입이 완료되었습니다.");
		
//		return "form/joinForm.do";
		return "redirect:/form/joinForm.do";
	}
	
	// ModelAndView 객체를 활용한 방법이 가장 많이 사용
	// MemberVO를 사용하기 위해선 멤버인자의 이름이 꼭 같아야 한다. (줄때와 받을때의 이름이 꼭 같아야 함)
	// 같은 객체를 "memberVO"와 "member"로 공유영역에 등록됨
//	@RequestMapping("/join.do")
//	public ModelAndView join(MemberVO member) {
//		ModelAndView mav = new ModelAndView("form/memberInfo");
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("form/memberInfo");
//		mav.addObject("member", member);
	
//		return mav;
//	}
	
	/*
//	@RequestMapping("/join.do")
	public String join(HttpServletRequest request,
						@RequestParam("id") String id,
						@RequestParam("password") String password,
						@RequestParam("name") String name) {
		
		// @RequestParam = request.getParameter 랑 같은 역할. (다만, 개발자가 하는지 스프링이 하는지에 차이만 존재)
//		String id = request.getParameter("id");
//		String password = request.getParameter("password");
//		String name = request.getParameter("name");
		
		MemberVO member = new MemberVO();
		member.setId(id);
		member.setPassword(password);
		member.setName(name);
//		
		// request 영역에 개발자가 직접 등록시킬 때 request.setAttribute 사용
		request.setAttribute("member",  member);
		// 포워딩 영역에 등록하면서 jsp파일로 포워딩
		return "form/memberInfo";
	}
//		*/
	
//	@RequestMapping("/join.do")
//	public String join(MemberVO member) {
//		System.out.println(member.getId());
//		System.out.println(member.getPassword());
//		System.out.println(member.getName());
//		return "form/memberInfo";
//	}
	
	
	// 공유영역에 등록시킬때 클래스명이 아닌 개발자가 지정해서 등록할 때 @ModelAttribute 사용
	// 그래서 "member"라는 이름으로 등록
//	@RequestMapping("/join.do")
//	public String join(@ModelAttribute("member") MemberVO member) {
//		System.out.println(member.getId());
//		System.out.println(member.getPassword());
//		System.out.println(member.getName());
//		return "form/memberInfo";
//	}
	
}
