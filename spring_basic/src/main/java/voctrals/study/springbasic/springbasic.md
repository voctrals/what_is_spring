![avatar](spring-structs.png)

### 业务Bean

#### 1 ...实例
#### 2 ...属性设置
#### 3 BeanNameAware
#### 4 BeanFactoryAware
#### 5 ApplicationContextAware
#### 7 InitializingBean
#### 8 init-method
#### 10 BeanPostProcessor
#### 11 destroy-method

### 组件Bean

#### 6 BeanPostProcessor.postProcessBeforeInitialization
#### 9 BeanPostProcessor.postProcessAfterInitialization

### MyBeanFactoryPostProcessor.postProcessBeanFactory
>bean工厂的bean属性处理容器，说通俗一些就是可以管理我们的bean工厂内所有的beandefinition（未实例化）数据，可以随心所欲的修改属性。
>
