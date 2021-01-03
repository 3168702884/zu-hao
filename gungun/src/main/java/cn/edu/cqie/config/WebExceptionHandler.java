package cn.edu.cqie.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.edu.cqie.enums.RespToAppEnum;
import cn.edu.cqie.utils.BizException;

@ControllerAdvice
@ResponseBody
public class WebExceptionHandler {

	// 打印日志
	// logback
	private final static Logger logger = LoggerFactory.getLogger(WebExceptionHandler.class);

	/**
	 * 自定义异常
	 * 
	 * @param BizException e
	 * @return
	 */
	@ExceptionHandler
	public ResultBean BizExceptions(BizException e) {

		logger.error("BizException异常", e);

		// 打印日志
		return ResultBean.error(e.getCode(), e.getMessage());
	}

	@ExceptionHandler
	public ResultBean unknownException(Exception e) {

		logger.error("未知异常", e);

		// 打印日志
		return ResultBean.error(RespToAppEnum.ERROR.getCode(), RespToAppEnum.ERROR.getMessage());
	}
}
