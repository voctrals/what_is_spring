package voctrals.study.springbasic;

/**
 * @author lei.liu
 * @since 19-8-28
 */
public class HelloWorld {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Your Message : " + message);
    }
}