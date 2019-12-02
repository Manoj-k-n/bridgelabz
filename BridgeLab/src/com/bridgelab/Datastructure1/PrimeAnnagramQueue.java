/********************************************************************************************
 * Purpose   :creating  Primeno and find aanagram and store in QueueList              
 * 
 * @author   :Manoj k n 
 * @version  :1.0
 * @date     :21-11-2019
 * @Filename :PrimeAnnagramQueue             
 ********************************************************************************************/
package com.bridgelab.Datastructure1;

import com.bridgelab.Datastructure.Base.Linkedlist;
import com.bridgelab.Datastructure.Base.Queu;
import com.bridgelab.Utility.utility;

public class PrimeAnnagramQueue 
{
		public static void main(String[] args) 
		{
			Queu<Integer> qu = new Queu<Integer>();
			Linkedlist<Integer> ar = new Linkedlist<Integer>();
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
							ar.add(j);
					}
					for (int i = 0; i < ar.size(); i++) 
					{
						for (int j = i + 1; j < ar.size(); j++) 
						{
							if (utility.anagram(ar.get(i), ar.get(j))) {
								qu.enqueue(ar.get(i));
								qu.enqueue(ar.get(j));
							}
						}
					}
					
					qu.dispPrime();
				}

	}


