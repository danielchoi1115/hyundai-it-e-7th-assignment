package com.practice.devices;

public class InheritanceDemo {
	public static void main(String[] args) {
		Laptop laptop = new Laptop("Superlaptop", "i9-15900H", 32, 15.6, 1.4);
		laptop.turnOnDevice();
		laptop.printDeviceInfo();
		laptop.fold();
		System.out.println();
		
		Smartphone phone = new Smartphone("iPhone 20", "A30", 8, 5.5, 0.3);
		phone.turnOnDevice();
		phone.startCall("010-1234-5678");
		phone.endCall();
		phone.fold();
	}
}
