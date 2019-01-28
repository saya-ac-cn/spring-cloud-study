package ac.cn.saya.springcloud.study.provider.dept.hystrix.controllers;

import ac.cn.saya.springcloud.study.api.entity.DeptEntity;
import ac.cn.saya.springcloud.study.provider.dept.hystrix.service.impl.DeptServiceImpl;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.log4j.Logger;
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

    private static final Logger logger = Logger.getLogger(DeptController.class);

    @Autowired
    @Qualifier("deptServiceImpl")
    private DeptServiceImpl deptServiceImpl;

    @PostMapping(value = "/dept/add")
    public Integer add(@RequestBody DeptEntity dept){
        logger.info("hystrix提供者执行部门创建");
        Integer flog = deptServiceImpl.add(dept);
        if(flog < 0){
            throw new RuntimeException("添加部门信息失败");
        }
        return flog;
    }

    @GetMapping(value = "/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public DeptEntity get(@PathVariable("id") Long id) {
        logger.info("hystrix提供者执行部门查询："+id);
        DeptEntity entity = deptServiceImpl.get(id);
        if(entity == null){
            throw new RuntimeException("该ID：" + id + "没有对应的信息");
        }
        return  entity;
    }

    @GetMapping(value = "/dept/list")
    public List<DeptEntity> list() {
        logger.info("hystrix提供者执行部门列表展示");
        List<DeptEntity> list = deptServiceImpl.list();
        if(list.size() <= 0){
            throw new RuntimeException("没有部门列表对应的信息");
        }
        return list;
    }

    public DeptEntity processHystrix_Get(@PathVariable("id") Long id)
    {
        return new DeptEntity().setDeptno(id).setDname("该ID：" + id + "没有没有对应的信息,null--@HystrixCommand")
                .setDb_source("no this database in MySQL");
    }

}
