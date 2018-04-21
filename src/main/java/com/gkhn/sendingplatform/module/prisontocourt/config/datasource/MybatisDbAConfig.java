package com.gkhn.sendingplatform.module.prisontocourt.config.datasource;

import com.github.pagehelper.PageHelper;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Properties;


@Configuration
@MapperScan(basePackages = {"com.gkhn.sendingplatform.module.prisontocourt.mapper"}, sqlSessionFactoryRef = "sqlSessionFactory1")
public class MybatisDbAConfig {

    @Autowired
    @Qualifier("dynamicDS1")
    private DataSource ds1;

    @Bean
    public SqlSessionFactory sqlSessionFactory1() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        // 使用titan数据源, 连接titan库
        factoryBean.setDataSource(ds1);
        //由于自己配置了SqlSessionFactory，需要在这里配置pagehelper，不然分页不起作用
        Interceptor[] plugins =  new Interceptor[]{pageHelper()};
        factoryBean.setPlugins(plugins);
        //配置需要在这里配置pagehelper结束
        return factoryBean.getObject();
    }

    /**
     * @author: Phn
     * @description: 配置mybatis的分页插件pageHelper
     * @date: 22:39 2018/4/16
     */
    @Bean
    public static PageHelper pageHelper(){
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("offsetAsPageNum","true");
        properties.setProperty("rowBoundsWithCount","true");
        properties.setProperty("reasonable","true");
        //配置mysql数据库的方言
        properties.setProperty("dialect","mysql");
        pageHelper.setProperties(properties);
        return pageHelper;
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate1() throws Exception {
        SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactory1()); // 使用上面配置的Factory
        return template;
    }
}
