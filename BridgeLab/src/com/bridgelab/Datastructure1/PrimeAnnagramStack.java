/********************************************************************************************
 * Purpose   :creating  Primeno and find aanagram and store in stackList              
 * 
 * @author   :Manoj k n 
 * @version  :1.0
 * @date     :21-11-2019
 * @Filename :PrimeAnnagramStack             
 ********************************************************************************************/
package com.bridgelab.Datastructure1;

import com.bridgelab.Datastructure.Base.Linkedlist;
import com.bridgelab.Datastructure.Base.Stack1;
import com.bridgelab.Utility.utility;

public class PrimeAnnagramStack 
{

	     public static void main(String[] args) {
			Stack1<Integer> stack = new Stack1<Integer>();
		   Linkedlist<Integer> al=new Linkedlist<Integer>();
				boolean b;
				for (int j = 2; j <= 1000; j++) 
				{
					b = true;
					for (int i = 2; i < j / 2; i++) 
					{
						if (j % i == 0) {
							b = false;
							break;
						}
					}
					if (b)
						al.add(j);
				}

				for (int i = 0; i < al.size(); i++) 
				{
					for (int j = i + 1; j < al.size(); j++) 
					{
						if (utility.anagram(al.get(i), al.get(j))) {
							stack.push(al.get(i));
							stack.push(al.get(j));	
						}
						
					}	
				}
				stack.disp();
			}

	}

