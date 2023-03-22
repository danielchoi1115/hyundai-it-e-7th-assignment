package com.tutorial.nestedclass;

public class HumanTestDrive {
    public static void main(String[] args) {
    	Human james = new Human();
    	james.heartbeat(); 
    	
    	Human.Heart heart = james.new Heart();
    	heart.heartbeat();
	}
}
