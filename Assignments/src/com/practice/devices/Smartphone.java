package com.practice.devices;

public class Smartphone extends Device {
	boolean onCall;
	public Smartphone(String deviceName, String cpuName, int ramSize, double displaySize, double weightKg) {
		super(deviceName, cpuName, ramSize, displaySize, weightKg);
	}
	
	void startCall(String phoneNumber) {
		if (!checkCommandIsValid("on")) {
			return;
		}
		if (onCall) {
			System.out.println("이미 통화중입니다.");
			return;
		}
		System.out.println(phoneNumber + "으로 전화합니다.");
		onCall = true;
	}
	void endCall() {
		if (!checkCommandIsValid("on")) {
			return;
		}
		else if (!onCall) {
			System.out.println("통화중이 아닙니다");
			return;
		}
		onCall = false;
		System.out.println("전화 종료.");
	}
	public void fold() {
		System.out.println("접는 중...");
		System.out.println("부서졌습니다.");
	}
}
