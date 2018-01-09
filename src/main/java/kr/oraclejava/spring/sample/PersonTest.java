package kr.oraclejava.spring.sample;

import java.io.InputStream;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		IPerson person = (IPerson)ac.getBean("hyungkuim");
//		System.out.println("이름:" + person.getName() );
		//System.out.println("나이:" + person.getAge() );
		
				
		Scanner scan = new Scanner(System.in);

		while(true) {

			System.out.print("당신의 나이는:");

			String cId = scan.nextLine();

			if("".equals(cId)) {
				break;
			}
			
			person.setAge(Integer.parseInt(cId));
			person.getAge();
		}	
	}
}
