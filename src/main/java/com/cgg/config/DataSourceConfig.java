package com.cgg.config;

import org.apache.shardingsphere.shardingjdbc.api.yaml.YamlMasterSlaveDataSourceFactory;
import org.junit.jupiter.api.Order;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;

import javax.sql.DataSource;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @author cgg
 * @version 1.0.0
 * @date 2021/10/27
 */
//@Configuration
public class DataSourceConfig {


    @Bean
    @Order(-10000)
    public DataSource dataSource() throws FileNotFoundException, SQLException, IOException {
        return YamlMasterSlaveDataSourceFactory.createDataSource(ResourceUtils.getFile("classpath:sharding.yml"));
    }


}
