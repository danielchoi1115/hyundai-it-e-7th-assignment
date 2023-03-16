package com.kosa.strategy.payments;

public class KakaoPay implements PaymentBehavior{

	@Override
	public void pay() {
		System.out.println("카카오페이 되죠?");
		
	}

}
