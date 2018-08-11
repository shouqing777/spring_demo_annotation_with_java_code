package entity;
/**
* @author shouqing E-mail:shouqing777@gmail.com
* @version 創建時間：2018年8月11日 下午7:48:36
* 類說明
*/
public class Summoner implements Adventurer {
	
	private AdventurerService adventurerService;
	
	public Summoner(AdventurerService adventurerService) {
		this.adventurerService = adventurerService;
	}

	@Override
	public String getDailyWork() {
		return "招喚師每日行程:練習招喚術";
	}

	@Override
	public String getService() {
		return adventurerService.getService();
	}

}
