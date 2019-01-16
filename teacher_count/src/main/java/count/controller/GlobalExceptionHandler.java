
package count.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(RuntimeException.class)
	@ResponseBody
	public Map<String, Object> exceptionHandler() {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("errorCode", "500");
		result.put("errorMsg", "系统错误!");
		return result;
	}
	@ExceptionHandler(RuntimeException.class)
	public Map<String, Object> exceptionHandler404() {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("errorCode1", "404");
		result.put("errorMsg1", "找不到页面！");
		return result;
	}

}
