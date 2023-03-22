package com.tutorial.nestedclass;

public class Human {
	
    public void heartbeat() {
    	Heart heart = new Heart();
    	heart.heartbeat();
    }

    public class Heart {
        public void heartbeat() {
            System.out.println("Listen to ma Heart beat");
        }
    }
}
