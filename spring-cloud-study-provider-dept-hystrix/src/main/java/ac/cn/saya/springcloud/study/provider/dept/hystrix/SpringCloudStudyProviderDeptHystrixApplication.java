package ac.cn.saya.springcloud.study.provider.dept.hystrix;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@EnableDiscoveryClient //服务发现
@EnableCircuitBreaker//对hystrixR熔断机制的支持
public class SpringCloudStudyProviderDeptHystrixApplication {

	private static final Logger logger = Logger.getLogger(SpringCloudStudyProviderDeptHystrixApplication.class);


	public static void main(String[] args) {
		///SpringApplication.run(SpringCloudStudyProviderDeptHystrixApplication.class, args);
		SpringApplication springApplication = new SpringApplication(SpringCloudStudyProviderDeptHystrixApplication.class);
		// 禁止命令行设置参数
		springApplication.setAddCommandLineProperties(false);
		springApplication.run(args);
		//项目启动完成打印项目名
		logger.warn("提供者spring-cloud-study-provider-dept-hystrix已经启动 ... ");
	}

}

