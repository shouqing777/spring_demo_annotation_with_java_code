package entity;

import org.springframework.stereotype.Component;

/**
* @author shouqing E-mail:shouqing777@gmail.com
* @version 創建時間：2018年8月10日 下午6:30:21
* 類說明
*/

@Component("Anduin")
public class Priest implements Adventurer {

	@Override
	public String getDailyWork() {
		return "牧師每天都要祈禱";
	}

	@Override
	public String getService() {
		return null;
	}

}
