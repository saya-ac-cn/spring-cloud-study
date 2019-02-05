package ac.cn.saya.springcloud.study.dept.clientconfig.service;

import ac.cn.saya.springcloud.study.api.entity.DeptEntity;

import java.util.List;

/**
 * @Title: DeptService
 * @ProjectName spring-cloud-study
 * @Description: TODO
 * @Author Saya
 * @Date: 2019/1/21 21:58
 * @Description:
 * 部门业务层
 */

public interface DeptService {

    /**
     * @描述 添加部门
     * @参数
     * @返回值
     * @创建人  saya.ac.cn-刘能凯
     * @创建时间  2019/1/21
     * @修改人和其它信息
     */
    public Integer add(DeptEntity dept);

    /**
     * @描述 查询部门
     * @参数
     * @返回值
     * @创建人  saya.ac.cn-刘能凯
     * @创建时间  2019/1/21
     * @修改人和其它信息
     */
    public DeptEntity get(Long id);

    /**
     * @描述 获取所有的部门
     * @参数  []
     * @返回值  java.util.List<ac.cn.saya.springcloud.study.api.entity.DeptEntity>
     * @创建人  saya.ac.cn-刘能凯
     * @创建时间  2019/1/21
     * @修改人和其它信息
     */
    public List<DeptEntity> list();

}
