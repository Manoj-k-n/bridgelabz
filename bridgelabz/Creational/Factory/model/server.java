package com.bridgelabz.Creational.Factory.model;

public class server extends Computer
{

private String cpu;
private String hdd;
private String ram;

public server(String cpu,String ram,String hdd)
{
	
	this.cpu=cpu;
	this.ram=ram;
	this.hdd=hdd;
}
public String getRAM()
{
	return this.ram;
}
public String getHDD()
{
	return this.hdd;
}

public String getCPU()
{
	return this.cpu;
}
}
