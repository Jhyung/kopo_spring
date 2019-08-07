package kr.co.mlec.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	// RequestMapping : �ش� URI�� ���߾� ���� ���� �����ų �޼ҵ忡�ٰ� ������ ���
	// DispatcherServlet�� ������ �� �ʿ��� Annotation
	// Controller���� ����� ����� JSP ������ �����ϴ� �� : ModelAndView
	// Model : �ڹ� �������� ��� ��Ű���� �ϴ� ������ request ������ �ø��� ��
	// View  : forward������ ������ ������ ���� �� (�������� jsp �ּҰ� �ʿ���)
	// Model�� View�� ���ĳ��� ���� ModelAndView Ŭ����
	@RequestMapping("/hello/hello.do")
	public ModelAndView hello() {
		ModelAndView mav = new ModelAndView("hello/hello");
		mav.addObject("msg", "hi ������ MVC~~");
		mav.addObject("msg2", "�������̾� ������~~");
		return mav;
	}
}
