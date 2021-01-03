package cn.edu.cqie.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author potato GameServerEnum游戏服务器，与大区联动
 */
public enum GameServerEnum {

	CHANGAN(110, "000110", "000011", "长安城"),

	LONGHU(111, "000111", "000011", "龙虎"),

	DIE(112, "000112", "000011", "蝶服"),

	SHAUNGMENG(150, "000150", "000015", "双梦"),

	WEIMANXIA(151, "000151", "000015", "唯满侠"),

	HUAQIAN(152, "000152", "000015", "华乾"),

	YIMA(153, "000153", "000015", "姨妈"),

	JIANDAN(154, "000154", "000015", "剑胆"),

	YOUYUE(155, "000155", "000015", "幽月轮"),

	ZHIZI(156, "000156", "000015", "执子之手"),

	JUEDAI(180, "000180", "000018", "绝代"),

	ZONGYUE(210, "000210", "000021", "纵月"),

	NIANPO(211, "000211", "000021", "念破"),

	FEILONG(220, "000220", "000022", "飞龙"),

	FENGTIAN(240, "000240", "000024", "奉天"),

	QINGMEI(241, "000241", "000024", "青梅"),

	SHANYU(1270, "001270", "000127", "山雨欲来");

	private int code; // 本地数据库值
	private String distCode; // 远程
	private String gameArea;// 大区code
	private String message; // 内容

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getDistCode() {
		return distCode;
	}

	public void setDistCode(String distCode) {
		this.distCode = distCode;
	}

	public String getGameArea() {
		return gameArea;
	}

	public void setGameArea(String gameArea) {
		this.gameArea = gameArea;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	private GameServerEnum(int code, String distCode, String gameArea, String message) {
		this.code = code;
		this.distCode = distCode;
		this.gameArea = gameArea;
		this.message = message;
	}

	public static GameServerEnum getByDistCode(String distCode) {
		for (GameServerEnum c : GameServerEnum.values()) {
			if (c.getDistCode().equals(distCode)) {
				return c;
			}
		}
		return null;
	}

	public static GameServerEnum getByCode(int code) {
		for (GameServerEnum c : GameServerEnum.values()) {
			if (c.getCode() == code) {
				return c;
			}
		}
		return null;
	}

	public static List<Map<String, Object>> getAll() {
		List<Map<String, Object>> lst = new ArrayList<Map<String, Object>>();
		for (GameServerEnum c : GameServerEnum.values()) {
			Map<String, Object> item = new HashMap<String, Object>();
			item.put("gameServer", c.getDistCode());
			item.put("gameArea", c.getGameArea());
			item.put("name", c.getMessage());

			lst.add(item);
		}
		return lst;
	}

}
