package com.example.firstproject.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.hibernate.mapping.Join;
import org.springframework.stereotype.Component;

@Aspect // AOP 클래스 선언 : 이 클래스 부가기능을 주입하는 클래스
@Component // IOC 컨테이너가 해당 객체를 생성 및 관리하도록 한다.
@Slf4j
public class DebuggingAspect {
    // 대상 메소드 선택 : commentService#create()
    @Pointcut("execution(* com.example.firstproject.service.CommentService.*(..))")
    // @Pointcut 주입대상 지정
    // 경로가 src/main 들어가서 java 부터가 기준임.
    private void cut() {

    }

    // 실행시점 설정 : cut()의 대상이 수행되기 이전
    // 대상실행 이전에 수행
    @Before("cut()")
    public void loggingArgs(JoinPoint joinPoint) { // cut의 대상 메소드
        // 입력값 가져오기
        Object[] args = joinPoint.getArgs();

        // 클래스명을 가져올 수 있는 공식
        // commentservice
        String className = joinPoint.getTarget().getClass().getSimpleName();

        // 메소드명
        // create
        String methodName = joinPoint.getSignature().getName();

        // 입력값 로딩하기
        // CommentService()#create()의 입력값 => 5 이런식으로. 클래스명과 입력값 필요
        for (Object obj : args) { // foreach 문
            log.info("{}#{}의 입력값 => {}", className, methodName, obj);
        }

    }

    // @After : 대상 실행 후 수행
    // @AfterReturning : 대상 실행 후 수행 (정상수행시)
    // @AfterThrowing : 대상 실행 후 수행 (예약발생시)
    // @Around : 대상 실행 전후로 수행
    @AfterReturning(value = "cut()", returning = "returnObj")
    public void loggingReturnValue (JoinPoint joinPoint, Object returnObj) {
        // 클래스명
        String className = joinPoint.getTarget().getClass().getSimpleName();

        // 메소드명
        String methodName = joinPoint.getSignature().getName();

        // 반환값 로딩
        log.info("{}#{}의 반환값 => {}", className, methodName, returnObj);
    }


}
// 컨트롤 - 서비스 - 리포지토리로 다양한 기능을 구현했다.
// CRUD 기능을 만들었다.
// 위 기능과 같이 핵심 기능과는 별개로 부가적인 코드가 필요 로깅, 보안, 트랜잭션 등의 부가 기능이 각 기능에 반복되어야 한다.
// 부가기능을 특정 지점에 잘라넣는 기능
// DI가 특정 객체를 주입하는 것처럼 특정 로직을 잘라 놓음
//개발자 코드가 아닌 외부에 의해 제어되는 것을 IOC라 한다
//= Inversion Of Control
