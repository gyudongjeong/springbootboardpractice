package com.mysite.sbb;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity // Entity: DB의 테이블과 매핑되는 Java의 클래스.
public class Question {

	@Id //PK 지정
	@GeneratedValue(strategy = GenerationType.IDENTITY) //@GeneratedValue: PK 값 자동 생성 //GenerationType.IDENTITY: DB의 자동 증가 기능(ex: AUTO_INCREMENT)을 이용해서 PK를 생성함.
	private Integer id; //id: 질문 고유 번호
	
	@Column(length = 200) //@Column: DB 컬럼의 세부 설정. //length: 열 길이 설정.
	private String subject; //subject: 질문 제목
	
	@Column(columnDefinition = "TEXT") //columnDefinition: 컬럼 생성 시 사용할 SQL DDL을 직접 지정함. //TEXT: 컬럼을 TEXT 타입으로 생성함. 글자 수 제한을 직접 지정하기 어려울 때 씀.
	private String content; //content: 질문 내용
	
	private LocalDateTime createDate; //createDate: 질문 작성 일시
	
	@OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE) //mappedBy: 연관관계의 주인(= Answer)의 참조 필드명(= question) 지정. //CascadeType.REMOVE: Question 삭제 시, 연관된 Answer도 함께 삭제되게 함.
	private List<Answer> answerList; //Answer Entity 참조용 필드. //'1:N' 관계에서 1개의 Question이 여러 Answer를 가질 수 있으므로, List로 관리함.
	
} //class: Question Entity 클래스 → SBB의 질문 저장용 DB 테이블과 매핑됨.

//@Transient: Entity 클래스의 Field로는 씀. But, 테이블 컬럼으로는 매핑 X(→ JPA 영속성 매핑 대상에서 제외됨).

//Question에서 연관된 Answer 목록 조회하기: question.getAnswerList();