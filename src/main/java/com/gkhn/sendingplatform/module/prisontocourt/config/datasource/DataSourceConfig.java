package com.gkhn.sendingplatform.module.prisontocourt.config.datasource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
* @author: Phn
* @Description:
* @Date: 10:50 2018/1/19
*/
@Configuration
public class DataSourceConfig {

    @Bean(name = "masterDS")
    @ConfigurationProperties(prefix = "spring.datasource.master") // application.properteis中对应属性的前缀
    public DataSource dataSource1() {
        return DataSourceBuilder.create().build();
    }


    @Bean(name = "ds2")
    @ConfigurationProperties(prefix = "spring.datasource.deshan") // application.properteis中对应属性的前缀
    public DataSource dataSource2() {
        return DataSourceBuilder.create().build();
    }


    @Bean(name = "dynamicDS1")
    public DataSource dataSource() {
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        // 默认数据源
        dynamicDataSource.setDefaultTargetDataSource(dataSource1());
        // 配置多数据源
        Map<Object, Object> dsMap = new HashMap(5);
        dsMap.put("master", dataSource1());
        dynamicDataSource.setTargetDataSources(dsMap);
        return dynamicDataSource;
    }


}
