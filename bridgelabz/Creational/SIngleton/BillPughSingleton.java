package com.bridgelabz.Creational.SIngleton;

public class BillPughSingleton 
{
private BillPughSingleton()
{
	
}
private static class BillPughHelp
{
	 private static final BillPughSingleton obj=new BillPughSingleton();
}
public static BillPughSingleton getInstance()
{
	return BillPughHelp.obj;
}
}
