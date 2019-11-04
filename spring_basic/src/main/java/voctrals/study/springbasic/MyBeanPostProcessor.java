package voctrals.study.springbasic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

/**
 * @author lei.liu
 * @since 19-10-30
 */
@Slf4j
public class MyBeanPostProcessor implements BeanPostProcessor, Ordered {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        log.debug("BeanPostProcessor postProcessBeforeInitialization on " + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.debug("BeanPostProcessor postProcessAfterInitialization on " + beanName);
        return bean;
    }

    /**
     * Ordered接口用来约束该接口被加载的顺序，数字越小越早被加载
     */
    @Override
    public int getOrder() {
        return 0;
    }
}
