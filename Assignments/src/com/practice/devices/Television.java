package com.practice.devices;

public class Television extends Device {
	int channel;
	static int totalChannel = 10;
	public Television(String deviceName, String cpuName, int ramSize, double displaySize, double weightKg) {
		super(deviceName, cpuName, ramSize, displaySize, weightKg);
	}
	
	@Override
	void turnOnDevice() {
		if (!checkCommandIsValid("off")) {
			return;
		}
		isOn = true;
		channel = 1;
		System.out.println(this.getClass().getSimpleName() + "이 부팅 되었습니다.");
	}
	
	public void upChannel() {
		if (!checkCommandIsValid("on")) {
			return;
		}
		channel = (channel + 1) % totalChannel;
		printCurrentChannel();
	}
	public void downChannel() {
		if (!checkCommandIsValid("on")) {
			return;
		}
		channel -= 1;
		if (channel < 1) channel = totalChannel;
		printCurrentChannel();
	}
	
	public void printCurrentChannel() {
		if (!checkCommandIsValid("on")) {
			return;
		}
		System.out.println("현재 채널: " + channel);
	}
}
