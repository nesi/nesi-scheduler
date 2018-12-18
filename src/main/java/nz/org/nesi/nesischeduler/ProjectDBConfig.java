package nz.org.nesi.nesischeduler;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(
        entityManagerFactoryRef = "projectEntityManagerFactory",
        transactionManagerRef = "projectTransactionManager",
        basePackages = "nz.org.nesi.nesischeduler.project.repository"
)
@ComponentScan("nz.org.nesi.nesischeduler.project.repository")
@EnableTransactionManagement
public class ProjectDBConfig {
	@Primary
    @Bean(name = "projectEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean projectEntityManagerFactory(final EntityManagerFactoryBuilder builder,
                                                                            final @Qualifier("projectDataSource") DataSource dataSource) {
        return builder
                .dataSource(dataSource)
                .packages("nz.org.nesi.nesischeduler.project.model")
                .persistenceUnit("project")
                .build();
    }
    @Primary
    @Bean(name = "projectTransactionManager")
    public PlatformTransactionManager projectTransactionManager(@Qualifier("projectEntityManagerFactory")
                                                              EntityManagerFactory projectEntityManagerFactory) {
        return new JpaTransactionManager(projectEntityManagerFactory);
    }
}
