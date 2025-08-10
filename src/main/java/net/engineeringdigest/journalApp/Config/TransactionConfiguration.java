package net.engineeringdigest.journalApp.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.MongoTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Component
@EnableTransactionManagement
public class TransactionConfiguration {

    @Bean
    public PlatformTransactionManager transactionImplement(MongoDatabaseFactory dbFactory){
        return new MongoTransactionManager(dbFactory);
    }

}
