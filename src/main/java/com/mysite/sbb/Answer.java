package com.mysite.sbb;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Answer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id; //id: 답변 고유 번호
	
	@Column(columnDefinition = "TEXT")
	private String content; //content: 답변 내용
	
	private LocalDateTime createDate; //createDate: 답변 작성 일시
	
	@ManyToOne //@ManyToOne: 여러 Answer가 1개의 Question을 참조하는 'N:1' 관계 매핑. → DB의 Answer 테이블에 Question을 참조하는 FK 생성.
	private Question question; //Question Entity 참조용.
	
} //class: Answer Entity 클래스 → SBB의 답변 저장용 DB 테이블과 매핑됨.

//Answer 객체가 참조하는 Question 객체를 가져온 뒤, 해당 Question의 subject 값을 조회하기 : answer.getQuestion().getSubject();
