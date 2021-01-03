package cn.edu.cqie.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author potato GameCampEnum 阵营
 */
public enum GameCampEnum {
	GOODBOY(1, "000001", "浩气盟"),

	BADBOY(2, "000002", "恶人谷");

	private int code; // 本地数据库值
	private String distCode; // 远程
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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	private GameCampEnum(int code, String distCode, String message) {
		this.code = code;
		this.distCode = distCode;
		this.message = message;
	}

	public static GameCampEnum getByDistCode(String distCode) {
		for (GameCampEnum c : GameCampEnum.values()) {
			if (c.getDistCode().equals(distCode)) {
				return c;
			}
		}
		return null;
	}

	public static GameCampEnum getByCode(int code) {
		for (GameCampEnum c : GameCampEnum.values()) {
			if (c.getCode() == code) {
				return c;
			}
		}
		return null;
	}

	public static List<Map<String, Object>> getAll() {
		List<Map<String, Object>> lst = new ArrayList<Map<String, Object>>();
		for (GameCampEnum c : GameCampEnum.values()) {
			Map<String, Object> item = new HashMap<String, Object>();
			item.put("gameCamp", c.getDistCode());
			item.put("name", c.getMessage());

			lst.add(item);
		}
		return lst;
	}
}
