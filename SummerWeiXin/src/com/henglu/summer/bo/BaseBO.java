package com.henglu.summer.bo;

import java.io.Serializable;

public abstract class BaseBO implements Serializable {
	protected Object userObject;

	public Object getUserObject() {
		return userObject;
	}

	public void setUserObject(Object userObject) {
		this.userObject = userObject;
	}

}
