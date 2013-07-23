package org.jmanderson.ahs;

import java.lang.Throwable;

public class AppException extends Throwable {

	private Throwable e;

	public AppException(String s, Throwable e) {
		super(s);
		this.e = e;
	}

	public AppException(String s) {
		super(s);
		this.e = null;
	}

	public String getE() {
		return (e == null ? "" : e.toString());
	}

	public void printStackTrace() {
		e.printStackTrace();
	}
}
