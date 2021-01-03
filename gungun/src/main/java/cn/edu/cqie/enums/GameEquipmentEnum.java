package cn.edu.cqie.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author potato game_equipment装备表，与门派关联
 */
public enum GameEquipmentEnum {

	CHANGAN(10, "000010", "000001", "易筋经"),

	LONGHU(11, "000011", "000001", "洗髓"),

	LI(20, "000020", "000002", "离经"),

	HUAJIAN(21, "000021", "000002", "花间"),

	BINGXIN(30, "000030", "000003", "冰心"),

	YUNSHANG(31, "000031", "000003", "云裳"),

	QICHUN(40, "000040", "000015", "气纯"),

	JIANCHUN(41, "000041", "000004", "剑纯"),

	AOXUE(50, "000050", "000005", "傲血"),

	TIELAO(51, "000051", "000005", "铁牢"),

	DANXINFA(60, "000060", "000006", "单心法"),

	BUTIAN(70, "000070", "000007", "补天"),

	DUJING(71, "000071", "000007", "毒经"),

	FENYING(80, "000080", "000008", "焚影"),

	MINGZUN(81, "000081", "000008", "明尊");

	private int code; // 本地数据库值
	private String distCode; // 远程
	private String gameSect;// 门派code
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

	public String getGameSect() {
		return gameSect;
	}

	public void setGameSect(String gameSect) {
		this.gameSect = gameSect;
	}

	private GameEquipmentEnum(int code, String distCode, String gameSect, String message) {
		this.code = code;
		this.distCode = distCode;
		this.gameSect = gameSect;
		this.message = message;
	}

	public static GameEquipmentEnum getByDistCode(String distCode) {
		for (GameEquipmentEnum c : GameEquipmentEnum.values()) {
			if (c.getDistCode().equals(distCode)) {
				return c;
			}
		}
		return null;
	}

	public static GameEquipmentEnum getByCode(int code) {
		for (GameEquipmentEnum c : GameEquipmentEnum.values()) {
			if (c.getCode() == code) {
				return c;
			}
		}
		return null;
	}

	public static List<Map<String, Object>> getAll() {
		List<Map<String, Object>> lst = new ArrayList<Map<String, Object>>();
		for (GameEquipmentEnum c : GameEquipmentEnum.values()) {
			Map<String, Object> item = new HashMap<String, Object>();
			item.put("gameEquipment", c.getDistCode());
			item.put("gameSect", c.getGameSect());
			item.put("name", c.getMessage());

			lst.add(item);
		}
		return lst;
	}

}
