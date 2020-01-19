package kr.or.connect.daoexam.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/*
 * Spring의 ApplicationContext는 ApplicationConfig를 읽어들임
 * ApplicationConfig에서는 @ComponentScan 어느테이션으로 DAO클래스를 찾도록 설정
 * 찾은 모든 DAO 클래스는 Spring 컨테이너가 관리
 * ApplicationConfig 클래스에서 DBConfig import
 */

@Configuration
@ComponentScan(basePackages = { "kr.or.connect.daoexam.dao" })
// ComponentScan 어노테이션은 basePackages에 정의한 디렉토리 내에 존재하는
// Component, streotype 어노테이션이 부여된 Class들을 자동 Scan하여 Bean으로 등록
@Import({DBConfig.class})  //DB에 관뎐된 설정은 DBConfig에서 따로 관리하겠다는 뜻
public class ApplicationConfig {
	// ComponentScan으로 읽어내기 위한 코드
}
