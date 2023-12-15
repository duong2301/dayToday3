package javabaseconfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pojobeans.AccountServices;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        AccountServices accountService = applicationContext.getBean("accountService", AccountServices.class);

        System.out.println("Before money transfer");
        System.out.println("Account 1 balance:"+accountService.getAccount(1).getBalance());
        System.out.println("Account 2 balance:"+accountService.getAccount(2).getBalance());

        accountService.transferMoney(1,2,5.0);
        System.out.println("==================");
        System.out.println("After money transfer");
        System.out.println("Acount 1 balance:"+accountService.getAccount(1).getBalance());
        System.out.println("Acount 2 balance:"+accountService.getAccount(2).getBalance());


    }
}
