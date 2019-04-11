package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 张文军
 * @Description:
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/4/1019:13
 */
@SpringBootApplication
@EnableDiscoveryClient
public class LyItemService {
		public static void main(String[] args) {
				SpringApplication.run(LyItemService.class, args);
		}
}
