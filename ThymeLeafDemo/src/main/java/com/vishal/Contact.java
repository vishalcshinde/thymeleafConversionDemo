package com.vishal;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Contact {
	String name;
	int age;
	@DateTimeFormat(pattern="ddMMMyyyy")
	Date date;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", age=" + age + ", date=" + date
				+ "]";
	}

	public void setAge(int age) {
		this.age = age;
	}
}
