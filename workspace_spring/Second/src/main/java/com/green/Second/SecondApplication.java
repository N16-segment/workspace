package com.green.Second;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextInitializer;

@SpringBootApplication
public class SecondApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(SecondApplication.class, args);

		//스프링 컨테이너가 생성한 모든 객체의 이름을 배열로 가져온다.
		//스프링에서는 객체를 bean이라고 표현합니다.
		String[]beanNames = context.getBeanDefinitionNames();
		//만들어진 객체의 이름과 자료형을 차례대로 출력한다.
		for(String beanName : beanNames){
			Object beanType = context.getBean(beanName);
			System.out.println("객체명 :" + beanName + ", 자료형 :" + beanType);
		}
	}

}
