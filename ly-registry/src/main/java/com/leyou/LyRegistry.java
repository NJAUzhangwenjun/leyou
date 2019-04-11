package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 张文军
 * @Description:
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/4/1018:46
 */
@SpringBootApplication
@EnableEurekaServer
public class LyRegistry {
		public static void main(String[] args) {
				SpringApplication.run(LyRegistry.class, args);
		}
}
