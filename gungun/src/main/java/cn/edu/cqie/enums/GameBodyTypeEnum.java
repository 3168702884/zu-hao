package cn.edu.cqie.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author potato GameBodyTypeEnum体型
 */
public enum GameBodyTypeEnum {

	LUOLI(1, "000001", "萝莉"),

	ZHENGTAI(2, "000002", "正太"),

	CHENGNAN(3, "000003", "成男"),

	CHENGNV(4, "000004", "成女"),;

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

	private GameBodyTypeEnum(int code, String distCode, String message) {
		this.code = code;
		this.distCode = distCode;
		this.message = message;
	}

	public static GameBodyTypeEnum getByDistCode(String distCode) {
		for (GameBodyTypeEnum c : GameBodyTypeEnum.values()) {
			if (c.getDistCode().equals(distCode)) {
				return c;
			}
		}
		return null;
	}

	public static GameBodyTypeEnum getByCode(int code) {
		for (GameBodyTypeEnum c : GameBodyTypeEnum.values()) {
			if (c.getCode() == code) {
				return c;
			}
		}
		return null;
	}

	public static List<Map<String, Object>> getAll() {
		List<Map<String, Object>> lst = new ArrayList<Map<String, Object>>();
		for (GameBodyTypeEnum c : GameBodyTypeEnum.values()) {
			Map<String, Object> item = new HashMap<String, Object>();
			item.put("gameBodyType", c.getDistCode());
			item.put("name", c.getMessage());

			lst.add(item);
		}
		return lst;
	}

}
