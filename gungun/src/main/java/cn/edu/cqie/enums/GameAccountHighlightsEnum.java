package cn.edu.cqie.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author potato GameAccountHighlightsEnum 账号亮点
 */
public enum GameAccountHighlightsEnum {

	CHANGAN(10, "000010", "红发", "四红"),

	LONGHU(11, "000011", "红发", "五红"),

	LI(12, "000012", "红发", "六红"),

	HUAJIAN(20, "000020", "金发", "一代金"),

	BINGXIN(21, "000021", "金发", "狐金"),

	YUNSHANG(22, "000022", "金发", "猴金"),

	QICHUN(30, "000030", "外观", "五限"),

	JIANCHUN(31, "000031", "外观", "六限"),

	AOXUE(32, "000032", "外观", "热门"),

	TIELAO(33, "000033", "外观", "赤兔"),

	DANXINFA(40, "000040", "披风", "一代"),

	BUTIAN(41, "000041", "披风", "二代黑"),

	DUJING(42, "000042", "披风", "狐狸毛"),

	FENYING(43, "000043", "披风", "六翼");

	private int code; // 本地数据库值
	private String distCode; // 远程
	private String fDesc;// 父描述
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

	private GameAccountHighlightsEnum(int code, String distCode, String fDesc, String message) {
		this.code = code;
		this.distCode = distCode;
		this.fDesc = fDesc;
		this.message = message;
	}

	public String getfDesc() {
		return fDesc;
	}

	public void setfDesc(String fDesc) {
		this.fDesc = fDesc;
	}

	public static GameAccountHighlightsEnum getByDistCode(String distCode) {
		for (GameAccountHighlightsEnum c : GameAccountHighlightsEnum.values()) {
			if (c.getDistCode().equals(distCode)) {
				return c;
			}
		}
		return null;
	}

	public static GameAccountHighlightsEnum getByCode(int code) {
		for (GameAccountHighlightsEnum c : GameAccountHighlightsEnum.values()) {
			if (c.getCode() == code) {
				return c;
			}
		}
		return null;
	}

	public static List<Map<String, Object>> getAll() {
		List<Map<String, Object>> lst = new ArrayList<Map<String, Object>>();
		for (GameAccountHighlightsEnum c : GameAccountHighlightsEnum.values()) {
			Map<String, Object> item = new HashMap<String, Object>();
			item.put("desc", c.getMessage());
			item.put("fDesc", c.getfDesc());
			item.put("code", c.getDistCode());

			lst.add(item);
		}
		return lst;
	}

}
