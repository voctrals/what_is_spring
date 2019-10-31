package voctrals.study.springbasic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author lei.liu
 * @since 19-8-28
 */
@Slf4j
public class HelloWorld2 implements InitializingBean {

    private String message;

    public void setMessage(String message) {
        log.debug("properties setting...");
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Your Message : " + message);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.debug("InitializingBean afterPropertiesSet method called...");
    }
}