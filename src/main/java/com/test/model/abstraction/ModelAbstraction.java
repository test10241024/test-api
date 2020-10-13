package com.test.model.abstraction;

import java.util.Date;

import com.test.utils.StringTool;

//
public class ModelAbstraction {

	private String id;
	private String name;
	private boolean state;
	private Date date;

	public ModelAbstraction() {
		this.id = StringTool.getId();
		this.name = StringTool.empty;
		this.date = new Date();
		this.state = false;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getState() {
		return state;
	}

	public void setState(Boolean state) {
		this.state = state;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
