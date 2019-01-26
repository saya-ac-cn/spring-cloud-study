package ac.cn.saya.springcloud.study.consumer.dept1.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Title: ConfigBean
 * @ProjectName spring-cloud-study
 * @Description: TODO
 * @Author Saya
 * @Date: 2019/1/22 21:39
 * @Description:
 * 项目配置类
 */

@Configuration
public class ConfigBean {

    @Bean
    /**
     * 负载均衡 默认轮训算方法
     */
    @LoadBalanced
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }

}
