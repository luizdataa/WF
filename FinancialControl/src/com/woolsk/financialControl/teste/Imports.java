package com.woolsk.financialControl.teste;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Imports {

	private String tags = "http://www.w3.org/1999/xhtml" + "\n"
						+ "http://java.sun.com/jsf/facelets" + "\n"
						+ "http://java.sun.com/jsf/html" + "\n"
						+ "http://java.sun.com/jsf/core";

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}
	
}
