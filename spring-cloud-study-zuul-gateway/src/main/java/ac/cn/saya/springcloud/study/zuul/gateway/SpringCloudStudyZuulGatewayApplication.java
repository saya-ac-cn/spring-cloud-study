package ac.cn.saya.springcloud.study.zuul.gateway;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class SpringCloudStudyZuulGatewayApplication {

	private static final Logger logger = Logger.getLogger(SpringCloudStudyZuulGatewayApplication.class);

	public static void main(String[] args) {
		///SpringApplication.run(SpringCloudStudyZuulGatewayApplication.class, args);
		SpringApplication springApplication = new SpringApplication(SpringCloudStudyZuulGatewayApplication.class);
		// 禁止命令行设置参数
		springApplication.setAddCommandLineProperties(false);
		springApplication.run(args);
		//项目启动完成打印项目名
		logger.warn("服务网关已经启动 ... ");
	}

}

