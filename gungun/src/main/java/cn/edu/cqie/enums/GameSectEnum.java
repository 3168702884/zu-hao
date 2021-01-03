package cn.edu.cqie.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author potato GameSectEnum 门派
 */
public enum GameSectEnum {

	SHAOLIN(1, "000001", "少林"),

	WANHUA(2, "000002", "万花"),

	QIXIU(3, "000003", "七秀"),

	CHUNYANG(4, "000004", "纯阳"),

	TIANCE(5, "000005", "天策"),

	ZANGJIAN(6, "000006", "藏剑"),

	WUDU(7, "000007", "五毒"),

	MING(8, "000008", "明教");

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

	private GameSectEnum(int code, String distCode, String message) {
		this.code = code;
		this.distCode = distCode;
		this.message = message;
	}
	
	public static GameSectEnum getByDistCode(String distCode) {
		for (GameSectEnum c : GameSectEnum.values()) {
			if (c.getDistCode().equals(distCode)) {
				return c;
			}
		}
		return null;
	}

	public static GameSectEnum getByCode(int code) {
		for (GameSectEnum c : GameSectEnum.values()) {
			if (c.getCode() == code) {
				return c;
			}
		}
		return null;
	}

	public static List<Map<String, Object>> getAll() {
		List<Map<String, Object>> lst = new ArrayList<Map<String, Object>>();
		for (GameSectEnum c : GameSectEnum.values()) {
			Map<String, Object> item = new HashMap<String, Object>();
			item.put("gameSect", c.getDistCode());
			item.put("name", c.getMessage());

			lst.add(item);
		}
		return lst;
	}

}
