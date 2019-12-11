package com.bridgelabz.Creational.Factory.factory;
import com.bridgelabz.Creational.Factory.model.Computer;
import com.bridgelabz.Creational.Factory.model.pc;
import com.bridgelabz.Creational.Factory.model.server;
public class ComputerFactory

{
	private ComputerFactory()
	{
		
	}
public static Computer get(String type,String ram,String cpu,String hdd)
{

	if("PC".equals(type))
	{
		return new pc(ram,cpu,hdd);
	}
	if("SERVER".equals(type))
	{
		return new server(ram,cpu,hdd);
	}
	else
	{
	return null;
	}
}
}
