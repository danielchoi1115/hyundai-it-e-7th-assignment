package com.kosa.strategy.clients;
import com.kosa.strategy.payments.*;
import com.kosa.strategy.jinsangs.*;

public abstract class Client {
	PaymentBehavior paymentBehavior;
	JinsangBehavior jinsangBehavior;
	
	public abstract void speak();
	
	public void setPaymentBehavior(PaymentBehavior paymentBehavior) {
		this.paymentBehavior = paymentBehavior;
	}
	
	public void setJinsangBehavior(JinsangBehavior jinsangBehavior) {
		this.jinsangBehavior = jinsangBehavior;
	}
	public void performPayment() {
		paymentBehavior.pay();
	}
	public void performJinsang() {
		jinsangBehavior.doJinsang();
	}
	
}
