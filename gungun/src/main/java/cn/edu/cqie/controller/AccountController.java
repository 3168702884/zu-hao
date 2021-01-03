package cn.edu.cqie.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.edu.cqie.bo.AccountBo;
import cn.edu.cqie.config.ResultBean;
import cn.edu.cqie.dto.AccountRequestDto;
import cn.edu.cqie.service.AccountService;
import cn.edu.cqie.utils.LoginVerify;

/**
 * @author potato 账号入驻
 */
@RestController
@RequestMapping("/account")
public class AccountController {

	@Autowired
	private AccountService accountService;

	@GetMapping("/load")
	@ResponseBody
	public ResultBean load(AccountRequestDto dto) {
		Map<String, Object> result = new HashMap<String, Object>();

		// 1登录校验，后期可以放到切面中实现
		LoginVerify.checkLogin(dto.getToken());

		// 2封装业务逻辑对象bo
		AccountBo bo = new AccountBo();
		BeanUtils.copyProperties(dto, bo);

		// 3业务逻辑处理
		accountService.load(bo);

		result.put("gameAreaLst", bo.getGameAreaLst());
		result.put("gameServerLst", bo.getGameServerLst());
		result.put("gameCampLst", bo.getGameCampLst());
		result.put("gameSectLst", bo.getGameSectLst());
		result.put("gamebodyTypeLst", bo.getGamebodyTypeLst());
		result.put("gameEquipmentLst", bo.getGameEquipmentLst());
		result.put("gameAccountHighlightsLst", bo.getGameAccountHighlightsLst());

		return ResultBean.success(result);
	}

}
