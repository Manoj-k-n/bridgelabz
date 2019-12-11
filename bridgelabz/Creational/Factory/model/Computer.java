package com.bridgelabz.Creational.Factory.model;

public abstract class Computer 
{
 public abstract String getCPU();
  public abstract String getHDD();
  public abstract String getRAM();
@Override
public String toString() {
	return "Computer [getCPU=" + getCPU() + ", getHDD=" + getHDD() + ", getRAM=" + getRAM() + "]";
}
 
}
