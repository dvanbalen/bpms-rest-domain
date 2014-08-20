package com.redhat.consulting;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

@XmlRootElement(name="user")
@XmlAccessorType(XmlAccessType.FIELD)
public class User implements Serializable {
	
	private static final long serialVersionUID = 706790199819637988L;
	
	private String username;
	private String firstName;
	private String lastName;
	
	public User() {
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

}
