package com.leyou.common.exception;

import com.leyou.common.enums.ExceptionEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author 张文军
 * @Description:自定义异常
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/4/1110:29
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class LyException extends RuntimeException{
		private ExceptionEnum exceptionEnum;

}
