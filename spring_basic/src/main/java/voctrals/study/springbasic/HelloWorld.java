package voctrals.study.springbasic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author lei.liu
 * @since 19-8-28
 */
@Slf4j
public class HelloWorld implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    private String message;

    public void setMessage(String message) {
        log.debug("properties setting...");
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Your Message : " + message);
    }

    /**
     * 能够获得到spring给bean设置的名字
     *
     * @param name spring给bean设置的名字
     */
    @Override
    public void setBeanName(String name) {
        log.debug("BeanNameAware setBeanName called... name is \n\t" + name);
    }

    /**
     * 能够获得spring初始化该bean的工厂信息
     *
     * @param beanFactory spring初始化该bean的工厂信息
     * @throws BeansException ignore
     */
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        log.debug("BeanFactoryAware setBeanFactory called... beanFactory is \n\t" + beanFactory);
    }

    /**
     * 能够获得spring的上下文对象
     *
     * @param applicationContext spring的上下文对象
     * @throws BeansException ignore
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        log.debug("ApplicationContextAware setApplicationContext called... applicationContext is \n\t" + applicationContext);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.debug("InitializingBean afterPropertiesSet method called...");
    }

    @Override
    public void destroy() throws Exception {
        log.debug("DisposableBean destroy method called...");
    }
}