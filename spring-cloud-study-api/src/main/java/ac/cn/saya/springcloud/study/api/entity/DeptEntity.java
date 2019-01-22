package ac.cn.saya.springcloud.study.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Title: DeptEntity
 * @ProjectName spring-cloud-study
 * @Description: TODO
 * @Author Saya
 * @Date: 2019/1/21 20:56
 * @Description:
 * 部门实体类
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain = true)
public class DeptEntity implements Serializable {

    /**
     * 部门编号 主键
     */
    private Long 	deptno;
    /**
     * 部门名称
     */
    private String 	dname;

    /**
     * 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
     */
    private String 	db_source;

    public DeptEntity(String dname)
    {
        super();
        this.dname = dname;
    }

}
