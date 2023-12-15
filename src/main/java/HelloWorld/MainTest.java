package HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Helloworld helloWorld= (Helloworld) context.getBean("helloBean");
        helloWorld.printHello();

    }
}
