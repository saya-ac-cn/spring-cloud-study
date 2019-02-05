package ac.cn.saya.springcloud.study.dept.clientconfig;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@EnableDiscoveryClient //服务发现
public class SpringCloudStudyDeptClientConfigApplication {

	private static final Logger logger = Logger.getLogger(SpringCloudStudyDeptClientConfigApplication.class);


	public static void main(String[] args) {
		/// SpringApplication.run(SpringCloudStudyDeptClientConfigApplication.class, args);
		SpringApplication springApplication = new SpringApplication(SpringCloudStudyDeptClientConfigApplication.class);
		// 禁止命令行设置参数
		springApplication.setAddCommandLineProperties(false);
		springApplication.run(args);
		//项目启动完成打印项目名
		logger.warn("提供者spring-cloud-study-dept-client-config已经启动 ... ");
	}

}

