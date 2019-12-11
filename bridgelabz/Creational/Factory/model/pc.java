package com.bridgelabz.Creational.Factory.model;

public class pc extends Computer
{
	
	private String hdd;
	private String cpu;
	private String ram;
	
 public pc(String hdd,String cpu,String ram)
 {

	 this.hdd=hdd;
	 this.cpu=cpu;
	 this.ram=ram;
	
 }
 public String getHDD()
 {
	 return this.hdd;
 }
 
 public String getCPU()
  {
	 return this.cpu;
  }
 
 public String getRAM()
 {
	 return this.ram;
 }

}
