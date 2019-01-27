package ac.cn.saya.springcloud.study.consumer.dept.feign;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"ac.cn.saya.springcloud.study"})
@ComponentScan("ac.cn.saya.springcloud.study")
public class SpringCloudStudyConsumerDeptFeignApplication {

	private static final Logger logger = Logger.getLogger(SpringCloudStudyConsumerDeptFeignApplication.class);

	public static void main(String[] args) {
		///SpringApplication.run(SpringCloudStudyConsumerDeptFeignApplication.class, args);
		SpringApplication springApplication = new SpringApplication(SpringCloudStudyConsumerDeptFeignApplication.class);
		// 禁止命令行设置参数
		springApplication.setAddCommandLineProperties(false);
		springApplication.run(args);
		//项目启动完成打印项目名
		logger.warn("消费者spring-cloud-study-consumer-dept-feign已经启动 ... ");
	}

}

