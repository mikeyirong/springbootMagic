package com.mikespider.springbootMagic.entity;

public class Url {
	String name;
	String type;
     
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Url [name=" + name + ", type=" + type + "]";
	}
}
