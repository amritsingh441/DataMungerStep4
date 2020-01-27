package com.stackroute.datamunger.query;

import java.util.Arrays;

public class DataTypeDefinitions {
	
	public DataTypeDefinitions(String[] dataTypes) {
		super();
		this.dataTypes = dataTypes;
	}

	@Override
	public String toString() {
		return "DataTypeDefinitions [dataTypes=" + Arrays.toString(dataTypes) + "]";
	}

	private String [] dataTypes;

	/*
	 * This class should contain a member variable which is a String array, to hold
	 * the data type for all columns for all data types and should override
	 * toString() method as well.
	 */
	public String[] getDataTypes() {
		return dataTypes;
	}
	
	public String[] setDataTypes(String [] dataTypes) {
		return this.dataTypes = dataTypes;
	}

}
