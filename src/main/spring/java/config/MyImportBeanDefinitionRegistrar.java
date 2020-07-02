package spring.java.config;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.filter.AssignableTypeFilter;
import org.springframework.core.type.filter.TypeFilter;
import spring.java.bean.Book;

import java.util.Map;

/**
 * @author qiumeng
 * @version 1.0
 * @description
 * @date 2020/7/2 9:56
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        //扫描注解
        Map<String, Object> annotationAttributes = importingClassMetadata
                .getAnnotationAttributes(ComponentScan.class.getName());
        String[] basePackages = (String[]) annotationAttributes.get("basePackages");

        //扫描类
        ClassPathBeanDefinitionScanner scanner =
                new ClassPathBeanDefinitionScanner(registry, false);

        TypeFilter helloServiceFilter = new AssignableTypeFilter(Book.class);

        scanner.addIncludeFilter(helloServiceFilter);
        scanner.scan(basePackages);

        //也可以直接调用registry注册bean
        // registry.registerBeanDefinition();
    }
}
