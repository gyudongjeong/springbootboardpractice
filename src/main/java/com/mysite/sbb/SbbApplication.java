package com.mysite.sbb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * @SpringBootApplication = @SpringBootConfiguration + @EnableAutoConfiguration + @ComponentScan
 * @SpringBootConfiguration: 해당 클래스를 Spring의 설정 클래스로 등록함.
 * @EnableAutoConfiguration: classpath의 라이브러리 및 설정(ex: application.properties)을 기반으로 필요한 Bean을 자동 구성함.
 * @ComponentScan: 해당 클래스의 패키지 및 그 하위 패키지를 스캔해서 컴포넌트 스캔 대상 어노테이션(ex: @Component, @Service, @Repository, @Controller 등)이 붙은 클래스를 자동으로 Bean으로 등록함.
*/

@SpringBootApplication
public class SbbApplication { //Spring Boot 애플리케이션의 시작 클래스(Entry Point)

	public static void main(String[] args) {
		SpringApplication.run(SbbApplication.class, args);
	}

} //class: '프로젝트명 + Application.java' 파일
