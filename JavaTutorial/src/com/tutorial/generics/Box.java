package com.tutorial.generics;

public class Box<T> {
	T t;
	
	void set(T t) {
		this.t = t;
	}
	
	T get() {
		return this.t;
	}
}
