package entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
* @author shouqing E-mail:shouqing777@gmail.com
* @version 創建時間：2018年8月11日 下午5:42:08
* 類說明
*/

@Configuration
//@ComponentScan("entity")
@PropertySource("classpath:data.properties")
public class SpringConfig {
	
	@Bean
	public AdventurerService summonerService() {
		return new SummonerService();
	}
	
	@Bean
	public Adventurer summoner() {
		return new Summoner(summonerService());
	}
	

}
