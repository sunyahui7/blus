//package cn.itcast.config;
//
//import com.alibaba.druid.pool.DruidDataSource;
//
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.sql.DataSource;
//
//@Configuration
////@PropertySource("classpath:application.properties")
////@EnableConfigurationProperties(JdbcProperties.class)
//public class JdbcConfig {
////    @Value("${jdbc.driverClassName}")
////    String driverClassName;
////    @Value("${jdbc.url}")
////    String url;
////    @Value("${jdbc.userName}")
////    String userName;
////    @Value("${jdbc.password}")
////    String password;
////    @Bean
////    public DataSource dataSource(JdbcProperties prop){
////        DruidDataSource dataSource = new DruidDataSource();
////        dataSource.setDriverClassName(prop.driverClassName);
////        dataSource.setUrl(prop.url);
////        dataSource.setUsername(prop.userName);
////        dataSource.setPassword(prop.password);
////        return  dataSource;
////    }
//    @Bean
//    @ConfigurationProperties(prefix = "jdbc")
//    public DataSource dataSource(){
//        DruidDataSource dataSource = new DruidDataSource();
//        return  dataSource;
//    }
//}
