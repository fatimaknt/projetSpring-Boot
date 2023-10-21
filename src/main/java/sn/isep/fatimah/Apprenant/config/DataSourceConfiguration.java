package sn.isep.fatimah.Apprenant.config;

import java.sql.DriverManager;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class DataSourceConfiguration {
    @Value("${db.url}")
    private String dbUrl;
    @Value("${db.Username}")
    private String dbUsername;
    @Value("${db.password}")
    private String dbPassword;
    @Value("${db.driver}")
    private String dbDriver;


    @Bean
    public DriverManagerDataSouce  datasource(){
        DriverManagerDataSource dataSource=new DriverManagerDataSource();
        dataSource.setUrl(dbUrl);
        dataSource.dbUsername
    }


    
}
