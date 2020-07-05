package spring.java.tx;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 *  环境准备
 *  1.导入依赖 Spring-jdbc
 *  2. 创建数据源 jdbcTemplate
 *  3.
 *  + 开启事务管理功能
 * + 使用@transactional
 * + 配置事务管理器 加入容器中
 *
 * @description
 */
@PropertySource("classpath:db.properties")
@Configuration
public class TxConfig {
    @Value("${db.user}")
    String user;

    @Value("${db.password}")
    String password;

    String driver;

    @Bean("local")
    public DataSource local() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();

        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/40028");
        dataSource.setPassword(password);
        dataSource.setUser(user);
        dataSource.setDriverClass(driver);
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }

}
