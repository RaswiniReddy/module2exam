package com.cg.schedulesessions.exceptions;

public class SessionNotFoundException extends RuntimeException{
	public SessionNotFoundException(String msg) {
		super(msg);
	}
}
