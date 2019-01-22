package ac.cn.saya.springcloud.study.provider.dept1.service.impl;

import ac.cn.saya.springcloud.study.api.entity.DeptEntity;
import ac.cn.saya.springcloud.study.provider.dept1.dao.DeptDao;
import ac.cn.saya.springcloud.study.provider.dept1.service.DeptService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Title: DeptServiceImpl
 * @ProjectName spring-cloud-study
 * @Description: TODO
 * @Author Saya
 * @Date: 2019/1/21 22:01
 * @Description:
 */
@Service("deptServiceImpl")
public class DeptServiceImpl implements DeptService {

    @Resource
    @Qualifier("deptDao")
    private DeptDao deptDao;

    /**
     * @param dept
     * @描述 添加部门
     * @参数
     * @返回值
     * @创建人 saya.ac.cn-刘能凯
     * @创建时间 2019/1/21
     * @修改人和其它信息
     */
    @Override
    public Integer add(DeptEntity dept) {
        return deptDao.addDept(dept);
    }

    /**
     * @param id
     * @描述 查询部门
     * @参数
     * @返回值
     * @创建人 saya.ac.cn-刘能凯
     * @创建时间 2019/1/21
     * @修改人和其它信息
     */
    @Override
    public DeptEntity get(Long id) {
        return deptDao.findById(id);
    }

    /**
     * @描述 获取所有的部门
     * @参数 []
     * @返回值 java.util.List<ac.cn.saya.springcloud.study.api.entity.DeptEntity>
     * @创建人 saya.ac.cn-刘能凯
     * @创建时间 2019/1/21
     * @修改人和其它信息
     */
    @Override
    public List<DeptEntity> list() {
        return deptDao.findAll();
    }
}
