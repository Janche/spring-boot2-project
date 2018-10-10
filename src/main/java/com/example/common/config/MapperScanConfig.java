package com.example.common.config;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;

import static com.example.common.config.ProjectConstant.DAO_PACKAGE;

/**
 *
 * @author lirong
 */
@Configuration
@AutoConfigureAfter(MybatisConfig.class)// Mybatis的扫描配置必须在SqlSessionFactory被创建之后
public class MapperScanConfig {

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage(DAO_PACKAGE);
        return mapperScannerConfigurer;
    }

}
