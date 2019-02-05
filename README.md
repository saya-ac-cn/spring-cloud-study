# spring-cloud-study
## spring-cloud 学习实践
### 版本节点：
#### 1.0.8.0205(20190205)
描述：增加spring-config配置模式
#### 1.0.7.0129(20190129)
描述：增加zuul-gateway
#### 1.0.6.0128(20190128)
描述：增加hystrix-dashboard监控。走过的坑，必须在hystrix提供者中开启@EnableCircuitBreaker//对hystrixR熔断机制的支持，并且在Controller层的方法增加@HystrixCommand(fallbackMethod = "processHystrix_Get")，切记，否则无法无法连接，一直处于ping的状态
#### 1.0.5.0127(20190127)
描述：完成Ribbon自定义负载均衡算法，完成Feign客户端负载均衡，完成Hystrix熔断器器服务降级
#### 1.0.4.0126(20190126)
描述：完成Ribbon集群配置，实现负载均衡
#### 1.0.3.0124(20190124)
描述：完成Eureka集群配置，实现高可用
#### 1.0.1.0123(20190123)
描述：完成EurekaServer服务注册中心建立、完善主机映射名称修改、主机IP信息提示及info内容构建
#### 1.0.0.0122(20190122)
描述：完成消费者调用生产者（spring-cloud-study-consumer-dept-1 -> spring-cloud-study-provider-dept-1）
