package com.stackroute.datamunger.query;

public class Header {
	
	private String [] headers;

	/*
	 * This class should contain a member variable which is a String array, to hold
	 * the headers and should override toString() method as well.
	 */
	public String[] getHeaders() {
		return headers;
	}
	
	public String [] setHeaders(String [] headers) {
		return this.headers = headers;
	}

}
