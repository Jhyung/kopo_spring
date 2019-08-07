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
	
	// MemberVO�� ����ϱ� ���ؼ� ��������� �̸��� �� ���ƾ� �Ѵ�. (�ٶ��� �������� �̸��� �� ���ƾ� ��)
	// MemberVO�� ������ �ڵ����� request���������� ��ϱ��� ��. class�̸�����(��, ù���ڴ� �ҹ���)
	@RequestMapping("/join.do")
	public String join(MemberVO member, Model model) {
//		System.out.println(member.getId());
//		System.out.println(member.getPassword());
//		System.out.println(member.getName());
		System.out.println(member);
		model.addAttribute("msg", "������ �Ϸ�Ǿ����ϴ�.");
		
//		return "form/joinForm.do";
		return "redirect:/form/joinForm.do";
	}
	
	// ModelAndView ��ü�� Ȱ���� ����� ���� ���� ���
	// MemberVO�� ����ϱ� ���ؼ� ��������� �̸��� �� ���ƾ� �Ѵ�. (�ٶ��� �������� �̸��� �� ���ƾ� ��)
	// ���� ��ü�� "memberVO"�� "member"�� ���������� ��ϵ�
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
		
		// @RequestParam = request.getParameter �� ���� ����. (�ٸ�, �����ڰ� �ϴ��� �������� �ϴ����� ���̸� ����)
//		String id = request.getParameter("id");
//		String password = request.getParameter("password");
//		String name = request.getParameter("name");
		
		MemberVO member = new MemberVO();
		member.setId(id);
		member.setPassword(password);
		member.setName(name);
//		
		// request ������ �����ڰ� ���� ��Ͻ�ų �� request.setAttribute ���
		request.setAttribute("member",  member);
		// ������ ������ ����ϸ鼭 jsp���Ϸ� ������
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
	
	
	// ���������� ��Ͻ�ų�� Ŭ�������� �ƴ� �����ڰ� �����ؼ� ����� �� @ModelAttribute ���
	// �׷��� "member"��� �̸����� ���
//	@RequestMapping("/join.do")
//	public String join(@ModelAttribute("member") MemberVO member) {
//		System.out.println(member.getId());
//		System.out.println(member.getPassword());
//		System.out.println(member.getName());
//		return "form/memberInfo";
//	}
	
}
