package com.leyou.common.advice;

import com.leyou.common.enums.ExceptionEnum;
import com.leyou.common.exception.LyException;
import com.leyou.common.vo.ExceptionResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author 张文军
 * @Description:通用异常处理类
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/4/1110:16
 */
@ControllerAdvice
public class CommonExceptionHandler {

		@ExceptionHandler(LyException.class)
		public ResponseEntity<ExceptionResult> handerException(LyException e) {
				ExceptionEnum exceptionEnum = e.getExceptionEnum();
				ResponseEntity<ExceptionResult> body = ResponseEntity.status(exceptionEnum.getCode()).body(new ExceptionResult(e.getExceptionEnum()));
				return body;
		}
}
