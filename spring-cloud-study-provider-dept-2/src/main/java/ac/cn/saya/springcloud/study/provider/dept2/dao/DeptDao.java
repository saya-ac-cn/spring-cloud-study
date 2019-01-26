package ac.cn.saya.springcloud.study.provider.dept2.dao;

import ac.cn.saya.springcloud.study.api.entity.DeptEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Title: DeptDao
 * @ProjectName spring-cloud-study
 * @Description: TODO
 * @Author Saya
 * @Date: 2019/1/21 21:56
 * @Description:
 * 部门Dao
 */
@Mapper
@Repository(value = "deptDao")
public interface DeptDao {

    /**
     * @描述 添加部门
     * @参数
     * @返回值
     * @创建人  saya.ac.cn-刘能凯
     * @创建时间  2019/1/21
     * @修改人和其它信息
     */
    public Integer addDept(DeptEntity dept);

    /**
     * @描述 查询部门
     * @参数
     * @返回值
     * @创建人  saya.ac.cn-刘能凯
     * @创建时间  2019/1/21
     * @修改人和其它信息
     */
    public DeptEntity findById(Long id);

    /**
     * @描述 获取所有的部门
     * @参数
     * @返回值
     * @创建人  saya.ac.cn-刘能凯
     * @创建时间  2019/1/21
     * @修改人和其它信息
     */
    public List<DeptEntity> findAll();

}
