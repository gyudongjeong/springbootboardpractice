package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

	@GetMapping("/sbb") // GET 방식의 HTTP 요청을 처리함. // 도메인명 & 포트는 작성 X. → 서버 설정에 따라 변하기 때문.
	public void index() {
		System.out.println("index");
	} //index 메서드	
	
} //class


/*
 	HTTP Status Code
 	[1] 404 : 요청한 URL에 해당하는 리소스(페이지, API)를 Server에서 못 찾음.
 		(1) 해결법 : Controller에 해당 URL에 대한 매핑 추가하기.
 			① URL 매핑 : 'URL'과 'Controller 메서드'를 연결하는 것.
	
	[2] 500 : Controller 메서드 실행 중 예외가 발생한 경우 or 응답(반환값) 처리 과정에서 오류가 발생한 경우.
		(1) 해결법 : 클라이언트에게 응답 반환하기.
 */