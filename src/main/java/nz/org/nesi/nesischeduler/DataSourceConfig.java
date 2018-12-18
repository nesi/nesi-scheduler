package nz.org.nesi.nesischeduler;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

//@PropertySource("file:E:\\etc\\nesi\\daa\\application.properties")
@Configuration
@PropertySource("file:/etc/nesi/schedular/application.properties")
@ComponentScan("nz.org.nesi.nesischedular")
public class DataSourceConfig {
	final static Logger logger = LoggerFactory.getLogger(DataSourceConfig.class);
	
	@Bean
	@Primary
	@ConfigurationProperties(prefix = "spring.datasource.second")
	public DataSource projectDataSource() {
        return DataSourceBuilder.create().build();
    }

//	@Bean
//	@ConfigurationProperties(prefix = "spring.datasource.first")
//	public DataSource dwDataSource() {
//        return DataSourceBuilder.create().build();
//    }
}
