package ac.cn.saya.springcloud.study.provider.dept2.controllers;

import ac.cn.saya.springcloud.study.api.entity.DeptEntity;
import ac.cn.saya.springcloud.study.provider.dept2.service.impl.DeptServiceImpl;
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
        logger.info("提供者2执行部门创建");
        return deptServiceImpl.add(dept);
    }

    @GetMapping(value = "/dept/get/{id}")
    public DeptEntity get(@PathVariable("id") Long id) {
        logger.info("提供者2执行部门查询："+id);
        return deptServiceImpl.get(id);
    }

    @GetMapping(value = "/dept/list")
    public List<DeptEntity> list() {
        logger.info("提供者2执行部门列表展示");
        return deptServiceImpl.list();
    }

}
