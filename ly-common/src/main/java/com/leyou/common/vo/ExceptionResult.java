package com.leyou.common.vo;

import com.leyou.common.enums.ExceptionEnum;
import lombok.Data;

/**
 * @author 张文军
 * @Description:异常分装类
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/4/1110:50
 */
@Data
public class ExceptionResult {

		private int status;

		private String message;

		private Long timestamp;

		public ExceptionResult(ExceptionEnum em) {

				this.message = em.getMsg();
				this.status = em.getCode();
				this.timestamp = System.currentTimeMillis();

		}
}
