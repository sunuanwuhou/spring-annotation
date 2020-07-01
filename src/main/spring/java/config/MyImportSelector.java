package spring.java.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author qiumeng
 * @version 1.0
 * @description
 * @date 2020/7/1 21:47
 */
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {

        String className = importingClassMetadata.getClassName();
        //自定义选择注入的类
        return new String[0];
    }
}
