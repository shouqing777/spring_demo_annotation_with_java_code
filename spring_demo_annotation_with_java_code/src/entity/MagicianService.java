package entity;

import org.springframework.stereotype.Component;

/**
* @author shouqing E-mail:shouqing777@gmail.com
* @version 創建時間：2018年8月10日 下午7:09:36
* 類說明
*/

@Component
public class MagicianService implements AdventurerService{

	@Override
	public String getService() {
		return "魔法師教導魔法";
	}

}
