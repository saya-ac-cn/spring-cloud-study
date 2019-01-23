package ac.cn.saya.springcloud.study.eureka1;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * @描述
 * @参数
 * @返回值
 * @创建人  saya.ac.cn-刘能凯
 * @创建时间  2019/1/23
 * @修改人和其它信息
 * EurekaServer服务注册中心启动入口
 */


@SpringBootApplication
@EnableEurekaServer // EurekaServer服务器端启动类,接受其它微服务注册进来
public class SpringCloudStudyEureka1Application {

	private static final Logger logger = Logger.getLogger(SpringCloudStudyEureka1Application.class);

	public static void main(String[] args) {
		/// SpringApplication.run(SpringCloudStudyEureka1Application.class, args);
		SpringApplication springApplication = new SpringApplication(SpringCloudStudyEureka1Application.class);
		// 禁止命令行设置参数
		springApplication.setAddCommandLineProperties(false);
		springApplication.run(args);
		//项目启动完成打印项目名
		logger.warn("服务注册中心Eureka1已经启动 ... ");
	}

}

