package ac.cn.saya.springcloud.study.clientconfig;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCloudStudyClientConfigApplication {

	private static final Logger logger = Logger.getLogger(SpringCloudStudyClientConfigApplication.class);

	public static void main(String[] args) {
		///SpringApplication.run(SpringCloudStudyClientConfigApplication.class, args);
		SpringApplication springApplication = new SpringApplication(SpringCloudStudyClientConfigApplication.class);
		// 禁止命令行设置参数
		springApplication.setAddCommandLineProperties(false);
		springApplication.run(args);
		//项目启动完成打印项目名
		logger.warn("消费者配置中心已经启动 ... ");
	}

}

