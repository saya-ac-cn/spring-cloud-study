package ac.cn.saya.springcloud.study.api.service;

import ac.cn.saya.springcloud.study.api.entity.DeptEntity;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Title: DeptClientServiceFallbackFactory
 * @ProjectName spring-cloud-study
 * @Description: TODO
 * @Author Saya
 * @Date: 2019/1/27 17:28
 * @Description:
 */
@Component // 不要忘记添加，不要忘记添加
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {

    @Override
    public DeptClientService create(Throwable throwable){
        return new DeptClientService(){
            @Override
            public DeptEntity get(Long id)
            {
                return new DeptEntity().setDeptno(id).setDname("该ID：" + id + "没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭")
                        .setDb_source("no this database in MySQL");
            }

            @Override
            public List<DeptEntity> list()
            {
                return null;
            }

            @Override
            public Integer add(DeptEntity dept)
            {
                return 0;
            }
        };
    }

}
