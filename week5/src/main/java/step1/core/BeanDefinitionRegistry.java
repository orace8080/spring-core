package step1.core;

public interface BeanDefinitionRegistry {
    void registerBeanDefinition(String id, BeanDefinition beanDefinition);
}
