package xmlconfig;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojobeans.AccountServices;
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("xmlconfiguration/beans.xml");
         AccountServices accountServices = applicationContext.getBean("accountService", AccountServices.class);

        System.out.println("Before money transfer");
        System.out.println("Account 1 balance:"+accountServices.getAccount(1).getBalance());
        System.out.println("Account 2 balance:"+accountServices.getAccount(2).getBalance());

        accountServices.transferMoney(1,2,5.0);
        System.out.println("==================");
        System.out.println("After money transfer");
        System.out.println("Acount 1 balance:"+accountServices.getAccount(1).getBalance());
        System.out.println("Acount 2 balance:"+accountServices.getAccount(2).getBalance());


    }
}
