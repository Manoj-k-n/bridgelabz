package com.bridgelab.Datastructure1;

import com.bridgelab.Datastructure.Base.Linkedlist;
import com.bridgelab.Utility.utility;

public class UnOrderList 
{
	public static void main(String[] args) throws Exception
	{
	Linkedlist<String> al=new Linkedlist <String> ();
	System.out.println("enter the file name");
	String file=utility.readingString();
	System.out.println("enter the word to find");
	String find=utility.readingString();
	String s[]=utility.readfile(file).split(" ");

	for(int i=0;i<s.length;i++)
	{
	al.add(s[i]);

	}

	if(al.search(s, find))
	{
	al.remove1(find);
	}
	else
	{
	al.add(find);
	}

	al.show();
	al.toFile();
	}
	}

