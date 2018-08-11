package entity;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
* @author shouqing E-mail:shouqing777@gmail.com
* @version 創建時間：2018年8月10日 下午1:28:44
* 類說明
*/
public class SpringApp2 {
	
	public static void main(String[] args) {
		
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Adventurer alan = context.getBean("summoner",Adventurer.class);
		System.out.println(alan.getDailyWork());
		System.out.println(alan.getService());
		
		context.close();
	}

}
