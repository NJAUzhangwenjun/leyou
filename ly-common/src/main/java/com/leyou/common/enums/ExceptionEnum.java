package com.leyou.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author 张文军
 * @Description:异常枚举类
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/4/1110:31
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum ExceptionEnum {
		PRICE_CANNOT_BE_NULL(400, "价格不能为空！"),
		;
		/**
		 * 异常状态码
		 */
		private int code;

		/**
		 * 异常信息
		 */
		private String msg;
}
