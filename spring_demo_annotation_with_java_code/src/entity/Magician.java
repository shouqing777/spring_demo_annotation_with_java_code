package entity;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
* @author shouqing E-mail:shouqing777@gmail.com
* @version 創建時間：2018年8月10日 下午6:26:04
* 類說明
*/
//@Scope("prototype")
@Component
@Scope("singleton")
public class Magician implements Adventurer{
	
	@Value("Mary")
	private String name;
	
	@Value("${magician.age}")
	private int age;
	
	/*
	 * 第三種方法利用Field注入，Qualifier是因為同時有多個service implements AdventurerService
	 * Qualifier只限於用在Field and Method
	 */

	@Autowired
	@Qualifier("magicianService")
	private AdventurerService adventurerService;

	/*
	 * 第一種方法，利用建構子注入(Constructor Injection)
	@Autowired	
	public Magician(AdventurerService adventurerService) {
		this.adventurerService = adventurerService;
	}
	*/
	
	/*
	 * 第二種方法，利用Setter方法注入
	@Autowired
	@Qualifier("magicianService")
	public void setAdventurerService(AdventurerService adventurerService) {
		this.adventurerService = adventurerService;
	}
	*/
	
	@Override
	public String getDailyWork() {
		return "魔法師每天都要練習法術";
	}

	@Override
	public String getService() {
		return adventurerService.getService();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("法師初始化");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("法師消失囉");
	}
	
}
