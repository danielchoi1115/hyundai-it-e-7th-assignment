package com.tutorial.boundedparameters;

public class Compare<T extends Comparable<T>> {
	  private T data;

	  public Compare(T data) {
	    this.data = data;
	  }

	  public T getData() {
	    return this.data;
	  }

	  public void setData(T data) {
	    this.data = data;
	  }

	  public boolean isGreaterThan(T other) {
	    return this.data.compareTo(other) > 0;
	  }
	}