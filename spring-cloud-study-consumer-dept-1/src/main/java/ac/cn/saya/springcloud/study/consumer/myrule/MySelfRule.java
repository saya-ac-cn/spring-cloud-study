package ac.cn.saya.springcloud.study.consumer.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Title: MySelfRule
 * @ProjectName spring-cloud-study
 * @Description: TODO
 * @Author Saya
 * @Date: 2019/1/27 14:00
 * @Description:
 */

@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        /**
         * Ribbon默认是轮询，我自定义为随机
         */
        //return new RandomRule();
        return new ac.cn.saya.springcloud.study.consumer.myrule.RandomRule();
    }

}
