package org.raspberry.cho.merrychristmas.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@MapperScan(value = {"org.raspberry.cho.merrychristmas.mapper"})
@EnableTransactionManagement
public class MybatisConfig {

    /**
     *     @Bean
     *     public DataSource customDataSource() {
     *         return DataSourceBuilder.create()
     *                                 .url("jdbc:mysql://ip:3306/~?useSSL=false&serverTimezone=UTC")
     *                                 .driverClassName("com.mysql.cj.jdbc.Driver")
     *                                 .username("id")
     *                                 .password("pw")
     *                                 .build();
     *     }
     *
     *     ==
     *
     *     application.properties 와 같은 방식
     */

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource)throws Exception{
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);

        Resource[] res = new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*Mapper.xml");

        sessionFactory.setMapperLocations(res);

        return sessionFactory.getObject();
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
