package cn.edu.cqie.impl;

import org.springframework.stereotype.Service;

import cn.edu.cqie.bo.AccountBo;
import cn.edu.cqie.enums.GameAccountHighlightsEnum;
import cn.edu.cqie.enums.GameAreaEnum;
import cn.edu.cqie.enums.GameBodyTypeEnum;
import cn.edu.cqie.enums.GameCampEnum;
import cn.edu.cqie.enums.GameEquipmentEnum;
import cn.edu.cqie.enums.GameSectEnum;
import cn.edu.cqie.enums.GameServerEnum;
import cn.edu.cqie.service.AccountService;

@Service
public class AccountImpl implements AccountService {

	@Override
	public AccountBo load(AccountBo bo) {

		// 1加载大区
		bo.setGameAreaLst(GameAreaEnum.getAll());

		// 2加载服务器，与大区联动
		bo.setGameServerLst(GameServerEnum.getAll());

		// 3.加载阵营
		bo.setGameCampLst(GameCampEnum.getAll());

		// 4.加载门派
		bo.setGameSectLst(GameSectEnum.getAll());

		// 5.加载体型
		bo.setGamebodyTypeLst(GameBodyTypeEnum.getAll());

		// 6.加载装备
		bo.setGameEquipmentLst(GameEquipmentEnum.getAll());

		// 7.加载账号亮点
		bo.setGameAccountHighlightsLst(GameAccountHighlightsEnum.getAll());
		
		return bo;
	}

}
