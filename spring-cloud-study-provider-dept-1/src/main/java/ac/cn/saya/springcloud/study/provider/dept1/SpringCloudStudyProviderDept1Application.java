package ac.cn.saya.springcloud.study.provider.dept1;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudStudyProviderDept1Application {

	private static final Logger logger = Logger.getLogger(SpringCloudStudyProviderDept1Application.class);

	public static void main(String[] args) {
		///SpringApplication.run(SpringCloudStudyProviderDept1Application.class, args);
		SpringApplication springApplication = new SpringApplication(SpringCloudStudyProviderDept1Application.class);
		// 禁止命令行设置参数
		springApplication.setAddCommandLineProperties(false);
		springApplication.run(args);
		//项目启动完成打印项目名
		logger.warn("提供者spring-cloud-study-provider-dept-1已经启动 ... ");
	}

}

