package com.bridgelabz.Creational.SIngleton;

public class ThreadSafeSingleton
{
private static ThreadSafeSingleton obj;
private ThreadSafeSingleton()
{
	
}

public static synchronized ThreadSafeSingleton getInstance()
{ 
	if(obj==null)
	{
		obj=new ThreadSafeSingleton();
	}
	return obj;
}
}
