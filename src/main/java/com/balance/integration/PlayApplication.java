package com.balance.integration;

import com.balance.integration.service.wallet.WalletGateway;
import com.balance.integration.service.wallet.dto.GetBalanceRequest;
import com.balance.integration.service.wallet.dto.GetBalanceResponse;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class PlayApplication {

  public static void main(String[] args) {

    ApplicationContext context = new ClassPathXmlApplicationContext("classpath:context.xml");

    // Retrieve the gateway bean
    WalletGateway walletGateway = context.getBean(WalletGateway.class);

    // Send an order for processing
    GetBalanceResponse response = walletGateway.getBalance(new GetBalanceRequest());

    // Print the response
    System.out.println("Balance Response: " + response);
}
}
