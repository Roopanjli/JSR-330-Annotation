package com.ruby.bean1;

import javax.inject.Named;

@Named("engine")
public class Engine
{
  private int id=234;
  private String model="Mobile";
@Override
public String toString() {
	return "Engine [id=" + id + ", model=" + model + "]";
}
  
}
