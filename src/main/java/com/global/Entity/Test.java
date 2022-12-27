package com.global.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Test {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String ipAddressTest;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Test(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Test [id=" + id + ", name=" + name + "]";
	}
	public String getIpAddressTest() {
		return ipAddressTest;
	}
	public void setIpAddressTest(String ipAddressTest) {
		this.ipAddressTest = ipAddressTest;
	}
	public Test(String ipAddressTest) {
		super();
		this.ipAddressTest = ipAddressTest;
	}
	
	

}
