package com.practice.devices;

public class Laptop extends Device{
	public Laptop(String deviceName, String cpuName, int ramSize, double displaySize, double weightKg) {
		super(deviceName, cpuName, ramSize, displaySize, weightKg);
	}
	
	public void fold() {
		System.out.println("덮개를 닫는 중.");
		System.out.println("절전 모드로 전환합니다.");
	}
}
