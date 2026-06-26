package com.mysite.sbb;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor // 필수 필드(final 및 @NonNull)를 매개변수로 하는 생성자를 자동 생성함. 
@Getter
public class HelloLombok {
	//Field
	private final String hello;
	private final int lombok;
	
	//Method
	public static void main(String[] args) {
		HelloLombok helloLombok = new HelloLombok("헬로", 5);
//		helloLombok.setHello("헬로");
//		helloLombok.setLombok(5);
		
		System.out.println(helloLombok.getHello());
		System.out.println(helloLombok.getLombok());
	} //main 메서드
	
} //class
