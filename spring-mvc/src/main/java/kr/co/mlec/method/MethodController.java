package kr.co.mlec.method;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/method/method.do")
public class MethodController {

	@RequestMapping(method=RequestMethod.GET)
	public String callGet() {
		// 공유영역에 등록시킬 주소는 없고, 포워딩영역에만 등록할 주소가 있으면 String으로 리턴
		return "method/methodForm";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String callPost() {
		return "method/methodProcess";
	}
	
}
