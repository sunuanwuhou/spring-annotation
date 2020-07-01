package spring.java.config;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @author qiumeng
 * @version 1.0
 * @description
 * @date 2020/7/1 14:14
 */
public class MyFilterType implements TypeFilter {

    //metadataReader
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        //metadataReader:the metadata reader for the target class 当前类信息
        //metadataReaderFactory:a factory for obtaining metadata readers  其他类信息
        //获取当前类注解的信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        //获取当前正在扫描的类的信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        //获取当前类的资源信息，例如：类的路径等信息
        Resource resource = metadataReader.getResource();
        //获取当前正在扫描的类名
        String className = classMetadata.getClassName();
        System.out.println(className);

        return false;// true表示加入进去
    }
}
