package com.zhangheng;

import java.util.Properties;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import com.github.pagehelper.PageHelper;

/**
 * 程序启动入口
 * 
 * @author zhangh
 * @date 2018年4月26日上午9:16:27
 */
@SpringBootApplication
@EnableAspectJAutoProxy
@MapperScan("com.zhangheng.dao")
public class Application {

	/**
	 * @author zhangh
	 * @date 2018年4月28日下午5:18:38
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		// 下面的代码可以自定义banner 还可以控制banner的显示方式（log console off）
		// SpringApplication app = new SpringApplication(Application.class);
		// app.setBannerMode(Banner.Mode.OFF);
		// app.run(args);
	}

	@Bean
	public PageHelper pageHelper() {
		PageHelper pageHelper = new PageHelper();
		Properties properties = new Properties();
		properties.setProperty("rowBoundsWithCount", "true");
		properties.setProperty("reasonable", "true");
		properties.setProperty("dialect", "mysql");
		pageHelper.setProperties(properties);
		return pageHelper;
	}
}