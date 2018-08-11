package entity;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
* @author shouqing E-mail:shouqing777@gmail.com
* @version 創建時間：2018年8月10日 下午1:28:44
* 類說明
*/
public class SpringApp {
	
	public static void main(String[] args) {
		
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		
		Adventurer Anduin = context.getBean("Anduin",Adventurer.class);
		System.out.println(Anduin.getDailyWork());
		
		Adventurer Jenna = context.getBean("magician",Adventurer.class);
		System.out.println(Jenna.getDailyWork());		
		System.out.println(Jenna.getService());
		
		
		Magician Mary = context.getBean("magician",Magician.class);
		System.out.println(Mary.getName());
		System.out.println(Mary.getAge());
		
		Magician Jean = context.getBean("magician",Magician.class);
		System.out.println(Jean.getName());
		System.out.println(Jean.getAge());		
		
		Boolean Result =(Mary==Jean);
		
		System.out.println(Result);
		
		context.close();
	}

}
