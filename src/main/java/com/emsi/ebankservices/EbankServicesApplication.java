package com.emsi.ebankservices;

import com.emsi.ebankservices.entities.BankAccount;
import com.emsi.ebankservices.enums.AccountType;
import com.emsi.ebankservices.repositories.BankAccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.UUID;

@SpringBootApplication
public class EbankServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EbankServicesApplication.class, args);
	}
	@Bean
	CommandLineRunner start(BankAccountRepository bankAccountRepository){
		return  args -> {
			for (int i=0;i<10;i++){
				BankAccount bankAccount = BankAccount.builder().id(UUID.randomUUID().toString())
						.type(Math.random()>0.5? AccountType.CURRENT_ACCOUNT:AccountType.SAVINGS_ACCOUNT)
						.solde(10000*Math.random()).currency("MAD").dateCreation(new Date())
						.build();
				System.out.println("accounts created");
				bankAccountRepository.save(bankAccount);
		}
	};

}
}
