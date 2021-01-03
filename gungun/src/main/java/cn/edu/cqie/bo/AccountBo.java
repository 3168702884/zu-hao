package cn.edu.cqie.bo;

import java.util.List;
import java.util.Map;

/**
 * @author potato
 *
 *         业务逻辑对象
 */
public class AccountBo {

	// load
	private List<Map<String, Object>> gameAreaLst;// Game大区
	private List<Map<String, Object>> gameServerLst;// GameServerEnum游戏服务器，与大区联动
	private List<Map<String, Object>> gameCampLst;// Game阵营
	private List<Map<String, Object>> gameSectLst;// Game门派
	private List<Map<String, Object>> gamebodyTypeLst;// Game体型
	private List<Map<String, Object>> gameEquipmentLst;// Game装备
	private List<Map<String, Object>> gameAccountHighlightsLst;// Game账号亮点
	// end load

	public List<Map<String, Object>> getGameAreaLst() {
		return gameAreaLst;
	}

	public void setGameAreaLst(List<Map<String, Object>> gameAreaLst) {
		this.gameAreaLst = gameAreaLst;
	}

	public List<Map<String, Object>> getGameServerLst() {
		return gameServerLst;
	}

	public void setGameServerLst(List<Map<String, Object>> gameServerLst) {
		this.gameServerLst = gameServerLst;
	}

	public List<Map<String, Object>> getGameCampLst() {
		return gameCampLst;
	}

	public void setGameCampLst(List<Map<String, Object>> gameCampLst) {
		this.gameCampLst = gameCampLst;
	}

	public List<Map<String, Object>> getGameSectLst() {
		return gameSectLst;
	}

	public void setGameSectLst(List<Map<String, Object>> gameSectLst) {
		this.gameSectLst = gameSectLst;
	}

	public List<Map<String, Object>> getGamebodyTypeLst() {
		return gamebodyTypeLst;
	}

	public void setGamebodyTypeLst(List<Map<String, Object>> gamebodyTypeLst) {
		this.gamebodyTypeLst = gamebodyTypeLst;
	}

	public List<Map<String, Object>> getGameEquipmentLst() {
		return gameEquipmentLst;
	}

	public void setGameEquipmentLst(List<Map<String, Object>> gameEquipmentLst) {
		this.gameEquipmentLst = gameEquipmentLst;
	}

	public List<Map<String, Object>> getGameAccountHighlightsLst() {
		return gameAccountHighlightsLst;
	}

	public void setGameAccountHighlightsLst(List<Map<String, Object>> gameAccountHighlightsLst) {
		this.gameAccountHighlightsLst = gameAccountHighlightsLst;
	}

}
