import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 =
                applicationContext.getBean("helloworld", HelloWorld.class);
        Cat bean2 =
                (Cat) applicationContext.getBean("cat");
        Cat bean3 =
                applicationContext.getBean(Cat.class);
        System.out.println(bean.getMessage());
        System.out.println(bean1.getMessage());
        System.out.println(bean2.toString());
        System.out.println(bean3.toString());
        System.out.println("helloworld beans comparison: " + (bean == bean1));
        System.out.println("cat beans comparison: " + (bean2 == bean3));
    }
}