package ac.cn.saya.springcloud.study.hystrix.dashboard;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class SpringCloudStudyHystrixDashboardApplication {

	private static final Logger logger = Logger.getLogger(SpringCloudStudyHystrixDashboardApplication.class);

	public static void main(String[] args) {
		///SpringApplication.run(SpringCloudStudyHystrixDashboardApplication.class, args);
		SpringApplication springApplication = new SpringApplication(SpringCloudStudyHystrixDashboardApplication.class);
		// 禁止命令行设置参数
		springApplication.setAddCommandLineProperties(false);
		springApplication.run(args);
		//项目启动完成打印项目名
		logger.warn("HystrixDashboard监控已经启动 ... ");
	}

}

