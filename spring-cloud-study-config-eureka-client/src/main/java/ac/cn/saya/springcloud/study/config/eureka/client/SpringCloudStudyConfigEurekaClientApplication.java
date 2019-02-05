package ac.cn.saya.springcloud.study.config.eureka.client;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudStudyConfigEurekaClientApplication {

	private static final Logger logger = Logger.getLogger(SpringCloudStudyConfigEurekaClientApplication.class);

	public static void main(String[] args) {
		/// SpringApplication.run(SpringCloudStudyConfigEurekaClientApplication.class, args);
		SpringApplication springApplication = new SpringApplication(SpringCloudStudyConfigEurekaClientApplication.class);
		// 禁止命令行设置参数
		springApplication.setAddCommandLineProperties(false);
		springApplication.run(args);
		//项目启动完成打印项目名
		logger.warn("配置版eureka中心已经启动 ... ");
	}

}

