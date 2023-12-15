package javabaseconfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pojobeans.AccountRepository;
import pojobeans.AccountRepositoryImp1;
import pojobeans.AccountServices;
import pojobeans.AccountServicesImp1;
@Configuration
public class BeanConfiguration {
        @Bean
        public AccountServices accountService(){
            AccountServicesImp1 bean = new AccountServicesImp1();
            bean.setAccountRepository(accountDao());
            return bean;
        }
        @Bean
        public AccountRepository accountDao (){
            AccountRepositoryImp1 bean = new AccountRepositoryImp1();
            return bean;
        }
    }
