package kr.co.mlec.body;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.mlec.form.MemberVO;

@Controller
@RequestMapping("/ajax")
public class ResBodyController {

	// ResponseBody : 리턴타입을 jsp가 아닌 문자열 그대로 응답함
	@ResponseBody
	@RequestMapping("/resBody.do")
	public String resStringBody() {
		return "OK, 성공";
	}
	
	@ResponseBody
	@RequestMapping("/resVOListBody.json")
	public List<MemberVO> resJsonVOListBody() {
		
		List<MemberVO> list = new ArrayList<MemberVO>();
		for(int i=1; i<4; i++) {
			list.add(new MemberVO("hong", "1234", "홍길동"));
//			list.add(new MemberVO("hong", String.valueOf(i), "홍길동"));
		}
		
		return list;
	}
	
	@ResponseBody
	@RequestMapping("/resStringListBody.json")
	public List<String> resJsonStringListBody() {
		List<String> list = new ArrayList<>();
		for(int i=1; i<4; i++) {
			// i를 문자열로 치환하여 배열에 추가
			list.add(String.valueOf(i));
		}
		return list;
	}
	
	@ResponseBody
	@RequestMapping("/resVOBody.json")
	public MemberVO resJsonVOBody() {
		MemberVO vo = new MemberVO();
		vo.setId("hong");
		vo.setPassword("1234");
		vo.setName("홍길동");
		return vo;
	}
	
	@ResponseBody
	@RequestMapping("/resBody.json")
	public Map<String, String> resJsonBody() {
		Map<String, String> result = new HashMap<>();
		result.put("id", "sbc");
		result.put("name", "hong");
		result.put("addr", "서울");
		return result;
	}
}
