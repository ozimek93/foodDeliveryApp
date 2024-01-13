//package org.example.infrastructure.configuration;
//
//import com.zaxxer.hikari.HikariConfig;
//import com.zaxxer.hikari.HikariDataSource;
//import jakarta.persistence.EntityManagerFactory;
//import lombok.AllArgsConstructor;
//import lombok.Setter;
//import org.example.ComponentScanMarker;
//import org.example.infrastructure.database.repository.jpa._JpaRepositoriesMarker;
//import org.flywaydb.core.Flyway;
//import org.flywaydb.core.api.Location;
//import org.flywaydb.core.api.configuration.ClassicConfiguration;
//import org.hibernate.cfg.Environment;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.*;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.thymeleaf.spring6.templateresolver.SpringResourceTemplateResolver;
//import org.thymeleaf.templatemode.TemplateMode;
//
//import javax.sql.DataSource;
//import java.nio.charset.StandardCharsets;
//import java.util.Properties;
//
//@Configuration
//@AllArgsConstructor
//@EnableJpaRepositories(basePackageClasses = _JpaRepositoriesMarker.class)
//@EnableWebMvc
//@EnableTransactionManagement
//@ComponentScan(basePackageClasses = ComponentScanMarker.class)
//public class ApplicationConfiguration {
//
//    @Setter
//    private ApplicationContext applicationContext;
//    @Bean
//    @DependsOn("flyway")
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory(){
//        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
//        entityManagerFactoryBean.setDataSource(dataSource());
//        entityManagerFactoryBean.setJpaProperties(jpaProperties());
//        return entityManagerFactoryBean;
//    }
//
//    private Properties jpaProperties() {
//        final Properties properties = new Properties();
//        properties.setProperty(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
//        properties.setProperty(Environment.HBM2DDL_AUTO, "none");
//        properties.setProperty(Environment.SHOW_SQL, "true");
//        properties.setProperty(Environment.FORMAT_SQL, "false");
//        return properties;
//    }
//    @Bean
//    public PlatformTransactionManager transactionManager(
//            final EntityManagerFactory entityManagerFactory
//            ){
//        final JpaTransactionManager transactionManager = new JpaTransactionManager();
//        transactionManager.setEntityManagerFactory(entityManagerFactory);
//        return transactionManager;
//    }
//
//    @Bean(initMethod = "migrate")
//    Flyway flyway(){
//        ClassicConfiguration configuration = new ClassicConfiguration();
//        configuration.setBaselineOnMigrate(true);
//        configuration.setLocations(new Location("classpath:flyway/migrations"));
//        configuration.setDataSource(dataSource());
//        return new Flyway(configuration);
//    }
//
//    @Bean(destroyMethod = "close")
//    public DataSource dataSource(){
//        HikariConfig hikariConfig = new HikariConfig();
//        hikariConfig.setDriverClassName("org.postgresql.Driver");
//        hikariConfig.setJdbcUrl("jdbc:postgresql://localhost:5432/FoodOrderingApp");
//        hikariConfig.setUsername("postgres");
//        hikariConfig.setPassword("postgres");
//        hikariConfig.setMaximumPoolSize(20);
//        hikariConfig.setConnectionTimeout(20000);
//        hikariConfig.setMinimumIdle(10);
//        hikariConfig.setIdleTimeout(300000);
//        return new HikariDataSource(hikariConfig);
//    }
//
//    @Bean
//    public SpringResourceTemplateResolver templateResolver(){
//        SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
//        templateResolver.setApplicationContext(this.applicationContext);
//        templateResolver.setPrefix("/WEB-INF/templates/");
//        templateResolver.setSuffix(".html");
//        templateResolver.setCharacterEncoding(StandardCharsets.UTF_8.name());
//        templateResolver.setTemplateMode(TemplateMode.HTML);
//        return templateResolver;
//    }
//}
