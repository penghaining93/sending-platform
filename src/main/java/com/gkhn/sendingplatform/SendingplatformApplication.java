package com.gkhn.sendingplatform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;


/**
* @author: Phn
* @description:
* @date: 12:00 2018/1/21
*/
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableScheduling
public class SendingplatformApplication {

	public static void main(String[] args) {
		SpringApplication.run(SendingplatformApplication.class, args);
	}

	/**
	* @author: Phn
	* @description: 用来设置Session的过期时间
	* @date: 20:46 2018/2/23
	*/
	@Bean
	public EmbeddedServletContainerCustomizer containerCustomizer(){
		return new EmbeddedServletContainerCustomizer() {
			@Override
			public void customize(ConfigurableEmbeddedServletContainer container) {
				//单位为S
				container.setSessionTimeout(7200);
			}
		};
	}

}
