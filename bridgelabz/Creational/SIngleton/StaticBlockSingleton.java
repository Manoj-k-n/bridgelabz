package com.bridgelabz.Creational.SIngleton;

public class StaticBlockSingleton 
{
private static StaticBlockSingleton obj;

private StaticBlockSingleton()
{
	
}
static
{
	try {
	obj=new StaticBlockSingleton();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
	public static StaticBlockSingleton getInstance()
	{
		return obj;
	}
	}

