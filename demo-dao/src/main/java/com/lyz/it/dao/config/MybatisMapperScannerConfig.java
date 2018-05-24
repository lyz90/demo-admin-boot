package com.lyz.it.dao.config;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Configuration;

/**
 * @Author:LYZ
 * @Description:
 * @Date:Created in 15:37 2018/5/24
 * @Modified By:
 */
@Configuration
@AutoConfigureAfter(MyBatisConfig.class)
public class MybatisMapperScannerConfig {

    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        mapperScannerConfigurer.setBasePackage("com.lyz.it.dao.mapper");
        return  mapperScannerConfigurer;
    }
}
