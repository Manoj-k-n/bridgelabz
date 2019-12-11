package com.bridgelabz.Creational.Factory.factorytest;
import com.bridgelabz.Creational.Factory.factory.ComputerFactory;
import com.bridgelabz.Creational.Factory.model.Computer;
public class test 
{
public static void main(String[] args)
{
	Computer c=ComputerFactory.get("PC","4GB","500GB","4.5HZ");
	Computer c1=ComputerFactory.get("SERVER","8GB","4000GB","5.5GH");
	System.out.println(c);
	System.out.println(c1);
}
}
