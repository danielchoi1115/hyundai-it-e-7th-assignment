package com.kosa.strategy.payments;

public class Cash implements PaymentBehavior{

	@Override
	public void pay() {
		System.out.println("돈으로 낼게요");
		
	}

}
