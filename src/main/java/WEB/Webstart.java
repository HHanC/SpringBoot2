package WEB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // @ : 어노테이션 // 스프링부트 실행하는데 필요한 설정 셋팅
public class Webstart {
    public static void main(String[] args) { // 메인 스레드 메소드
        SpringApplication.run(Webstart.class);
        // SpringApplication : 스프링 어플리케이션 클래스
            // SpringApplication.run(현재 클래스명.class); // 스프링 어플리케이션 실행
    }
}
// Springboot 패키지 구성 규칙
    // * src -> main -> java
    // 1. 최상단(root)의 패키지 [홈페이지 명]
    // 2. Springboot 시작 클래스는 최상단 (root) 패키지내 존재
    // 3. 컨트롤, 서비스 , DTO폴더 , DAO폴더 구성

// @ : 어노테이션
    // @ vs extend : 상속 vs implement : 구현
    // 1. extend : 하나의 클래스로부터 클래스 메모리 상속받음
    // 2. implement : 여러개의 인터페이스를 구현
    // 3. @ : 해당 클래스에 메타데이터[프로그램] 주입

// 어노테이션
    // 1. @SpringBootApplication : 스프링부트 실행 설정 어노테이션
        // 1. 스프링 부트 실행하는데 기본 설정값 셋팅 [mvc컴포너트]
        // 2. 내장 서버(톰캣)와 클래스 연결
            // 내장 서버는 기본 포트번호 8080 [주의 : jsp 프로젝트 충돌]
            // 변경 : src -> main -> resources -> application.properties 파일
                // server.port : 포트번호


// 클래스
    // 1. SpringApplication.run(현재 클래스명.class); // 스프링 어플리케이션 실행

// 프론트엔드 패키지 [html, js, css 파일등]
    // src -> mamin -> resources ->
        // -> static : js , css, img파일 등등
        // -> templates : html파일 등등









