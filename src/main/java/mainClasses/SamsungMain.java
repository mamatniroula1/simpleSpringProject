package mainClasses;

import model.Samsung;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SamsungMain {
    public static void main(String[] args) {
//        Samsung samsung= new Samsung();
        ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
        Samsung s7= context.getBean(Samsung.class);
        s7.config();
    }
}
