package com.kosa.strategy;
import com.kosa.strategy.clients.*;
import com.kosa.strategy.jinsangs.*;
import com.kosa.strategy.payments.*;

public class PaymentSystemTestDrive {
	
	public static void main(String[] args) {
		
		Client humanClient = new HumanClient();
		humanClient.setPaymentBehavior(new Cash());
		humanClient.setJinsangBehavior(new AlcoholJinsang());
		
		Client duckClient = new DuckClient();
		duckClient.setPaymentBehavior(new Runaway());
		duckClient.setJinsangBehavior(new SonnimIsKingJinsang());
		
		Client alienClient = new AlienClient();
		alienClient.setPaymentBehavior(new KakaoPay());
		alienClient.setJinsangBehavior(new KondaeJinsang());
		
		Client[] clients = {humanClient, duckClient, alienClient};
		for(Client i: clients) {
			System.out.println("어서오세요.");
			i.speak();
			i.performJinsang();
			i.performPayment();
			System.out.println("");
		}
	}
}
