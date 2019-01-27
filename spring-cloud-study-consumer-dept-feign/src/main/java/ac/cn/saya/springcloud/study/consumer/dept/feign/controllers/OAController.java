package ac.cn.saya.springcloud.study.consumer.dept.feign.controllers;

import ac.cn.saya.springcloud.study.api.entity.DeptEntity;
import ac.cn.saya.springcloud.study.api.service.DeptClientService;
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

    @Autowired
    private DeptClientService service;

    @PostMapping(value = "/oa/dept/add")
    public Integer add(@RequestBody DeptEntity dept){
        return this.service.add(dept);
    }

    @GetMapping(value = "/oa/dept/get/{id}")
    public DeptEntity get(@PathVariable("id") Long id){
        return this.service.get(id);
    }

    @GetMapping(value = "/oa/dept/list")
    public List<DeptEntity> list(){
        return this.service.list();
    }

}
