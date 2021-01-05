package cn.edu.cqie.entity;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; // 商品表主键

	@Column(nullable = false)
	private int gameArea; // 大区

	@Column(nullable = false)
	private int gameServer; // 服务器

	@Column(nullable = false, length = 100)
	private String gameAccoutrement; // 游戏账号

	@Column(nullable = false, length = 100)
	private String gamePwd; // 游戏密码

	@Column(nullable = false, length = 20)
	private String gameRoleName; // 角色名

	@Column(nullable = false)
	private int gameCamp; // 阵营

	@Column(nullable = false)
	private int gameSect; // 门派

	@Column(nullable = false)
	private int gameBodyType; // 体型

	@Column(columnDefinition = "tinyint not null DEFAULT 0")
	private int allowCw; // 0-无；1-有

	@Column(columnDefinition = "tinyint not null DEFAULT 0")
	private int allowJJC; // 是否允许JJC 0-不允许；1-允许

	@Column(columnDefinition = "decimal(12,2) not null DEFAULT 0.00")
	private BigDecimal JJC22Code;// 22后台分 当allow_JJC为1时必填

	@Column(columnDefinition = "decimal(12,2) not null DEFAULT 0.00")
	private BigDecimal JJC33Code;// 33后台分 当allow_JJC为1时必填

	@Column(columnDefinition = "decimal(12,2) not null DEFAULT 0.00")
	private BigDecimal JJC55Code;// 55后台分 当allow_JJC为1时必填

	@Column(columnDefinition = "tinyint not null DEFAULT 0")
	private int redHair;// 红发 0-无；1-四红；2-五红；3-六红

	@Column(columnDefinition = "tinyint not null DEFAULT 0")
	private int goodenHair;// 金发 0-无；1-一代金；2-狐金；3-猴金

	@Column(columnDefinition = "tinyint not null DEFAULT 0")
	private int appearance;// 外观 0-无；1-五限；2-六限；3-热门；4-赤兔

	@Column(columnDefinition = "tinyint not null DEFAULT 0")
	private int cloak; // 披风 0-无；1-一代；2-二代黑；3-狐狸毛；4-六翼

	@Column(nullable = false, length = 60)
	private String productTitle; // 商品标题

	@Column(nullable = false, length = 1024)
	private String productContent; // 商品详情

	@Column(columnDefinition = "decimal(12,2) not null DEFAULT 0.00")
	private BigDecimal rentHour; // 时租金

	@Column(columnDefinition = "decimal(12,2) not null DEFAULT 0.00")
	private BigDecimal rentDay; // 日租金

	@Column(columnDefinition = "decimal(12,2) not null DEFAULT 0.00")
	private BigDecimal rentMonth; // 月租金

	@Column(nullable = false)
	private int userId; // 用户表主键

	@Column(columnDefinition = "varchar(1024) not null default ''")
	private String coverMap1;// 封面图1

	@Column(columnDefinition = "varchar(1024) not null default ''")
	private String coverMap2;// 封面图2

	@Column(columnDefinition = "varchar(1024) not null default ''")
	private String coverMap3;// 封面图3

	@Column(columnDefinition = "varchar(1024) not null default ''")
	private String coverMap4;// 封面图4

	@Column(columnDefinition = "varchar(1024) not null default ''")
	private String coverMap5;// 封面图5

	@Column(columnDefinition = "varchar(1024) not null default ''")
	private String accountMap1;// 账号描述1

	@Column(columnDefinition = "varchar(1024) not null default ''")
	private String accountMap2;// 账号描述2

	@Column(columnDefinition = "varchar(1024) not null default ''")
	private String accountMap3;// 账号描述3

	@Column(columnDefinition = "varchar(1024) not null default ''")
	private String accountMap4;// 账号描述4

	@Column(columnDefinition = "varchar(1024) not null default ''")
	private String accountMap5;// 账号描述5

	@Column(columnDefinition = "varchar(1024) not null default ''")
	private String accountMap6;// 账号描述6

	@Column(columnDefinition = "varchar(1024) not null default ''")
	private String accountMap7;// 账号描述7

	@Column(columnDefinition = "varchar(1024) not null default ''")
	private String accountMap8;// 账号描述8

	@Column(columnDefinition = "varchar(1024) not null default ''")
	private String accountMap9;// 账号描述9

	@Column(columnDefinition = "varchar(1024) not null default ''")
	private String accountMap10;// 账号描述10

	@Column(columnDefinition = "timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP")
	private Date createTime;

	@Column(columnDefinition = "timestamp NOT NULL ON UPDATE CURRENT_TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date updateTime;

	@Column(columnDefinition = "boolean not null default 0 comment '0-无效；1-有效'")
	private boolean state;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGameArea() {
		return gameArea;
	}

	public void setGameArea(int gameArea) {
		this.gameArea = gameArea;
	}

	public int getGameServer() {
		return gameServer;
	}

	public void setGameServer(int gameServer) {
		this.gameServer = gameServer;
	}

	public String getGameAccoutrement() {
		return gameAccoutrement;
	}

	public void setGameAccoutrement(String gameAccoutrement) {
		this.gameAccoutrement = gameAccoutrement;
	}

	public String getGamePwd() {
		return gamePwd;
	}

	public void setGamePwd(String gamePwd) {
		this.gamePwd = gamePwd;
	}

	public String getGameRoleName() {
		return gameRoleName;
	}

	public void setGameRoleName(String gameRoleName) {
		this.gameRoleName = gameRoleName;
	}

	public int getGameCamp() {
		return gameCamp;
	}

	public void setGameCamp(int gameCamp) {
		this.gameCamp = gameCamp;
	}

	public int getGameSect() {
		return gameSect;
	}

	public void setGameSect(int gameSect) {
		this.gameSect = gameSect;
	}

	public int getGameBodyType() {
		return gameBodyType;
	}

	public void setGameBodyType(int gameBodyType) {
		this.gameBodyType = gameBodyType;
	}

	public int getAllowCw() {
		return allowCw;
	}

	public void setAllowCw(int allowCw) {
		this.allowCw = allowCw;
	}

	public int getAllowJJC() {
		return allowJJC;
	}

	public void setAllowJJC(int allowJJC) {
		this.allowJJC = allowJJC;
	}

	public BigDecimal getJJC22Code() {
		return JJC22Code;
	}

	public void setJJC22Code(BigDecimal jJC22Code) {
		JJC22Code = jJC22Code;
	}

	public BigDecimal getJJC33Code() {
		return JJC33Code;
	}

	public void setJJC33Code(BigDecimal jJC33Code) {
		JJC33Code = jJC33Code;
	}

	public BigDecimal getJJC55Code() {
		return JJC55Code;
	}

	public void setJJC55Code(BigDecimal jJC55Code) {
		JJC55Code = jJC55Code;
	}

	public int getRedHair() {
		return redHair;
	}

	public void setRedHair(int redHair) {
		this.redHair = redHair;
	}

	public int getGoodenHair() {
		return goodenHair;
	}

	public void setGoodenHair(int goodenHair) {
		this.goodenHair = goodenHair;
	}

	public int getAppearance() {
		return appearance;
	}

	public void setAppearance(int appearance) {
		this.appearance = appearance;
	}

	public int getCloak() {
		return cloak;
	}

	public void setCloak(int cloak) {
		this.cloak = cloak;
	}

	public String getProductTitle() {
		return productTitle;
	}

	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}

	public String getProductContent() {
		return productContent;
	}

	public void setProductContent(String productContent) {
		this.productContent = productContent;
	}

	public BigDecimal getRentHour() {
		return rentHour;
	}

	public void setRentHour(BigDecimal rentHour) {
		this.rentHour = rentHour;
	}

	public BigDecimal getRentDay() {
		return rentDay;
	}

	public void setRentDay(BigDecimal rentDay) {
		this.rentDay = rentDay;
	}

	public BigDecimal getRentMonth() {
		return rentMonth;
	}

	public void setRentMonth(BigDecimal rentMonth) {
		this.rentMonth = rentMonth;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getCoverMap1() {
		return coverMap1;
	}

	public void setCoverMap1(String coverMap1) {
		this.coverMap1 = coverMap1;
	}

	public String getCoverMap2() {
		return coverMap2;
	}

	public void setCoverMap2(String coverMap2) {
		this.coverMap2 = coverMap2;
	}

	public String getCoverMap3() {
		return coverMap3;
	}

	public void setCoverMap3(String coverMap3) {
		this.coverMap3 = coverMap3;
	}

	public String getCoverMap4() {
		return coverMap4;
	}

	public void setCoverMap4(String coverMap4) {
		this.coverMap4 = coverMap4;
	}

	public String getCoverMap5() {
		return coverMap5;
	}

	public void setCoverMap5(String coverMap5) {
		this.coverMap5 = coverMap5;
	}

	public String getAccountMap1() {
		return accountMap1;
	}

	public void setAccountMap1(String accountMap1) {
		this.accountMap1 = accountMap1;
	}

	public String getAccountMap2() {
		return accountMap2;
	}

	public void setAccountMap2(String accountMap2) {
		this.accountMap2 = accountMap2;
	}

	public String getAccountMap3() {
		return accountMap3;
	}

	public void setAccountMap3(String accountMap3) {
		this.accountMap3 = accountMap3;
	}

	public String getAccountMap4() {
		return accountMap4;
	}

	public void setAccountMap4(String accountMap4) {
		this.accountMap4 = accountMap4;
	}

	public String getAccountMap5() {
		return accountMap5;
	}

	public void setAccountMap5(String accountMap5) {
		this.accountMap5 = accountMap5;
	}

	public String getAccountMap6() {
		return accountMap6;
	}

	public void setAccountMap6(String accountMap6) {
		this.accountMap6 = accountMap6;
	}

	public String getAccountMap7() {
		return accountMap7;
	}

	public void setAccountMap7(String accountMap7) {
		this.accountMap7 = accountMap7;
	}

	public String getAccountMap8() {
		return accountMap8;
	}

	public void setAccountMap8(String accountMap8) {
		this.accountMap8 = accountMap8;
	}

	public String getAccountMap9() {
		return accountMap9;
	}

	public void setAccountMap9(String accountMap9) {
		this.accountMap9 = accountMap9;
	}

	public String getAccountMap10() {
		return accountMap10;
	}

	public void setAccountMap10(String accountMap10) {
		this.accountMap10 = accountMap10;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public Product() {
		super();
	}

}
