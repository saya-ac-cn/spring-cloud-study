package ac.cn.saya.springcloud.study.consumer.dept1.controllers;

import ac.cn.saya.springcloud.study.api.entity.DeptEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Title: OAController
 * @ProjectName spring-cloud-study
 * @Description: TODO
 * @Author Saya
 * @Date: 2019/1/22 21:42
 * @Description:
 */
@RestController
public class OAController {

    /// private static final String REST_URL_PREFIX = "http://127.0.0.1:8001";

    private static final String REST_URL_PREFIX = "http://SPRING-CLOUD-STUDY-PROVIDER-DEPT";

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping(value = "/oa/dept/add")
    public Integer add(@RequestBody DeptEntity dept)
    {
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Integer.class);
    }

    @GetMapping(value = "/oa/dept/get/{id}")
    public DeptEntity get(@PathVariable("id") Long id)
    {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/"+ id, DeptEntity.class);
    }

    @GetMapping(value = "/oa/dept/list")
    public List<DeptEntity> list()
    {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
    }

}
