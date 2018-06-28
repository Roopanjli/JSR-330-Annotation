package com.ruby.bean2;

import javax.inject.Inject;
import javax.inject.Named;

import com.ruby.bean1.Engine;

@Named("vehi")
public class Vehicle {
	@Inject
private Engine eng;

	@Override
	public String toString() {
		return "Vehicle [eng=" + eng + "]";
	}
}
