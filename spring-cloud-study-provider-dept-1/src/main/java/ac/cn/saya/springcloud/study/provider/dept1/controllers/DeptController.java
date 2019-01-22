package ac.cn.saya.springcloud.study.provider.dept1.controllers;

import ac.cn.saya.springcloud.study.api.entity.DeptEntity;
import ac.cn.saya.springcloud.study.provider.dept1.service.impl.DeptServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @Title: DeptController
 * @ProjectName spring-cloud-study
 * @Description: TODO
 * @Author Saya
 * @Date: 2019/1/21 22:04
 * @Description:
 * 部门对外接口
 */
@RestController
public class DeptController {

    @Autowired
    @Qualifier("deptServiceImpl")
    private DeptServiceImpl deptServiceImpl;

    @PostMapping(value = "/dept/add")
    public Integer add(@RequestBody DeptEntity dept)
    {
        return deptServiceImpl.add(dept);
    }

    @GetMapping(value = "/dept/get/{id}")
    public DeptEntity get(@PathVariable("id") Long id)
    {
        return deptServiceImpl.get(id);
    }

    @GetMapping(value = "/dept/list")
    public List<DeptEntity> list()
    {
        return deptServiceImpl.list();
    }

}
