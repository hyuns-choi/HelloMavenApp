package kr.oraclejava.spring.sample;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//Aspect Oriented Programming
// 시점 + 처리
@Aspect
public class PersonAspect {
	
	// 사전처리 xml에서
	public void addDataBefore() {
		System.out.println("사전처리입니다.");
	}
	
	// 함수에서
	@Before("execution(* getAge())")
	public void addDataBefore2() {
		//System.out.println("사전2222처리입니다.");
	}
	
	@AfterReturning(pointcut="execution(* getName())", returning="retVal")
	public void addDataAfter(Object retVal) {
		String name = retVal.toString();
		System.out.println("retVal:" + name);
	}

	@AfterReturning(pointcut="execution(* getAge())", returning="retVal")
	public void addDataAfterAge(Object retVal) {
		int nAge = (Integer)retVal;
		
		if(nAge > 19)
		{
			System.out.println("당신은 술을 마실 수 있는 나이입니다.");
		}
		else {
			System.out.println("당신은 술을 마실 수 없는 나이입니다.");
		}
	}	
}
