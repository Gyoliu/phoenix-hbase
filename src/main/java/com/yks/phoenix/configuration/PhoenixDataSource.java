package com.yks.phoenix.configuration;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * Created by cgt on 17-12-6.
 */
@Configuration
public class PhoenixDataSource {

    @Autowired
    private Environment env;

    @Bean(name = "phoenixJdbcDataSource")
    @Qualifier("phoenixJdbcDataSource")
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(env.getProperty("phoenix.url"));
        dataSource.setDriverClassName(env.getProperty("phoenix.driver-class-name"));
        dataSource.setUsername(env.getProperty("phoenix.username"));//phoenix的用户名默认为空
        dataSource.setPassword(env.getProperty("phoenix.password"));//phoenix的密码默认为空
        dataSource.setDefaultAutoCommit(Boolean.valueOf(env.getProperty("phoenix.default-auto-commit")));
        dataSource.setConnectionProperties("phoenix.schema.isNamespaceMappingEnabled=true");

        return dataSource;
    }

    @Bean(name = "phoenixJdbcTemplate")
    public JdbcTemplate phoenixJdbcTemplate(@Qualifier("phoenixJdbcDataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}