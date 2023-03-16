package com.kosa.strategy.payments;

public class Runaway implements PaymentBehavior{

	@Override
	public void pay() {
		System.out.println("호다닥");
		
	}

}
