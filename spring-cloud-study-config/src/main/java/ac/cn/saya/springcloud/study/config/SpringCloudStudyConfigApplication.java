package ac.cn.saya.springcloud.study.config;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudStudyConfigApplication {

	private static final Logger logger = Logger.getLogger(SpringCloudStudyConfigApplication.class);

	public static void main(String[] args) {
		/// SpringApplication.run(SpringCloudStudyConfigApplication.class, args);
		SpringApplication springApplication = new SpringApplication(SpringCloudStudyConfigApplication.class);
		// 禁止命令行设置参数
		springApplication.setAddCommandLineProperties(false);
		springApplication.run(args);
		//项目启动完成打印项目名
		logger.warn("配置中心已经启动 ... ");
	}

}

