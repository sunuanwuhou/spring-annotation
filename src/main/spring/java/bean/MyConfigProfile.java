package spring.java.bean;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.util.StringValueResolver;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 *
 *  Spring为我们提供的可以根据当前环境，动态的激活和切换一系列组件的功能；
 *
 *  local dev test 数据源
 *  @Profile:指定组件在哪个环境的情况下才能被注册到容器中，不指定，任何环境下都能注册这个组件
 *
 * @version 1.0
 * @description
 * @date 2020/7/3 21:26
 */
@PropertySource("classpath:db.properties")
@Configuration
public class MyConfigProfile implements EmbeddedValueResolverAware {



    @Value("${db.user}")
    String user;

    @Value("${db.password}")
    String password;

    String driver;

    // @Profile("local")
    @Bean("local")
    public DataSource local() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();

        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/40028");
        dataSource.setPassword(password);
        dataSource.setUser(user);
        dataSource.setDriverClass(driver);
        return dataSource;
    }

    @Profile("dev")
    @Bean("dev")
    public DataSource dev() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();

        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/kmyx");
        dataSource.setPassword(password);
        dataSource.setUser(user);
        dataSource.setDriverClass(driver);
        return dataSource;
    }

    @Profile("test")
    @Bean("test")
    public DataSource test() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();

        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/24");
        dataSource.setPassword(password);
        dataSource.setUser(user);
        dataSource.setDriverClass(driver);
        return dataSource;
    }


    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {

        String driver = resolver.resolveStringValue("${db.driver}");
        this.driver=driver;
    }
}
