package com.practice.devices;

public abstract class Device {
	String deviceName;
	String cpuName;
	int ramSize;
	double displaySize;
	double weightKg;
	boolean isOn;
	
	public Device(String deviceName, String cpuName, int ramSize, double displaySize, double weightKg) {
		this.deviceName = deviceName;
		this.cpuName = cpuName;
		this.ramSize = ramSize;
		this.displaySize = displaySize;
		this.weightKg = weightKg;
		this.isOn = false;
	}
	void printDeviceInfo() {
		String status;
		if (isOn) {
			status = "On";
		}
		else {
			status = "Off";
		}
		System.out.println(
			"장치명: " + deviceName + "\n" +
			"CPU: " + cpuName + "\n" +
			"RAM: " + ramSize + "GB\n" + 
			"디스플레이 크기: " + displaySize +  " inches\n" +
			"무게: " + weightKg + "kg\n" + 
			"상태: " + status
		);
	}
	boolean checkCommandIsValid(String requiredStatus) {
//		if requiredStatus == true, the device must be On.
		if (requiredStatus.equals("on") && !isOn) {
			System.out.println(this.getClass().getSimpleName() + "를(을) 먼저 켜야합니다!");
			return false;
		}
		else if (requiredStatus.equals("off") && isOn) {
			System.out.println(this.getClass().getSimpleName() + "가 이미 켜져 있습니다.");
			return false;
		}
		return true;
	}
	void turnOnDevice() {
		if (!checkCommandIsValid("off")) {
			return;
		}
		isOn = true;
		System.out.println(this.getClass().getSimpleName() + "이 부팅 되었습니다.");
	}
	
	void turnOffDevice() {
		if (!checkCommandIsValid("on")) {
			return;
		}
		System.out.println(this.getClass().getSimpleName() + "를(을) 종료합니다.");
		isOn = false;
	}
	
	void rebootDevice() {
		if (!checkCommandIsValid("on")) {
			return;
		}
		turnOffDevice();
		turnOnDevice();
	}
}
