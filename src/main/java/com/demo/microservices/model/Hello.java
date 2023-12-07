package com.demo.microservices.model;

public class Hello {

    private Long counter;
    private String msg;
    
    public Hello(Long counter,String msg) {
    	super();
    	this.counter=counter;
    	this.msg=msg;
    }

	public Long getCounter() {
		return counter;
	}

	public void setCounter(Long counter) {
		this.counter = counter;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	

}
