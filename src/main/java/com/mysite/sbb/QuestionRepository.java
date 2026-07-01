package com.mysite.sbb;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {

} //interface: QuestionRepository

//Repository: 도메인 객체(Entity)의 저장 및 조회 기능 제공.
//JpaRepository: Spring Data JPA가 제공하는 인터페이스. Entity의 CRUD, 페이징, 정렬 기능 제공.