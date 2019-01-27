package ac.cn.saya.springcloud.study.api.service;

import ac.cn.saya.springcloud.study.api.entity.DeptEntity;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @Title: DeptClientService
 * @ProjectName spring-cloud-study
 * @Description: TODO
 * @Author Saya
 * @Date: 2019/1/27 15:06
 * @Description:
 * 对外暴露提供者的服务方法
 */

@FeignClient(value = "SPRING-CLOUD-STUDY-PROVIDER-DEPT",fallbackFactory=DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

    @PostMapping(value = "/dept/add")
    public Integer add(@RequestBody DeptEntity dept);

    @GetMapping(value = "/dept/get/{id}")
    public DeptEntity get(@PathVariable("id") Long id);

    @GetMapping(value = "/dept/list")
    public List<DeptEntity> list();

}
