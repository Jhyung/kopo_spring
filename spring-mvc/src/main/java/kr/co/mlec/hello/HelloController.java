package kr.co.mlec.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	// RequestMapping : 해당 URI에 맞추어 가장 먼저 실행시킬 메소드에다가 붙혀서 사용
	// DispatcherServlet이 구분할 때 필요한 Annotation
	// Controller에서 결과를 출력할 JSP 파일을 연결하는 것 : ModelAndView
	// Model : 자바 영역에서 등록 시키려고 하는 변수를 request 영역에 올리는 것
	// View  : forward영역에 공유할 변수를 가질 것 (포워딩할 jsp 주소가 필요함)
	// Model과 View를 합쳐놓은 것이 ModelAndView 클래스
	@RequestMapping("/hello/hello.do")
	public ModelAndView hello() {
		ModelAndView mav = new ModelAndView("hello/hello");
		mav.addObject("msg", "hi 스프링 MVC~~");
		mav.addObject("msg2", "오랜만이야 스프링~~");
		return mav;
	}
}
