package ac.cn.saya.springcloud.study.consumer.dept1;

import ac.cn.saya.springcloud.study.consumer.myrule.MySelfRule;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "SPRING-CLOUD-STUDY-PROVIDER-DEPT",configuration = MySelfRule.class)
public class SpringCloudStudyConsumerDept1Application {

	private static final Logger logger = Logger.getLogger(SpringCloudStudyConsumerDept1Application.class);

	public static void main(String[] args) {
		///SpringApplication.run(SpringCloudStudyConsumerDept1Application.class, args);
		SpringApplication springApplication = new SpringApplication(SpringCloudStudyConsumerDept1Application.class);
		// 禁止命令行设置参数
		springApplication.setAddCommandLineProperties(false);
		springApplication.run(args);
		//项目启动完成打印项目名
		logger.warn("消费者spring-cloud-study-consumer-dept-1已经启动 ... ");
	}

}

