package org.tcs.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class SampleTest {

	public static void main(String[] args) {
		
		  /*String s = "vanaja Sadasivam"; String[] split = s.split(" ");
		  
		  String firstName = split[0]; String lastName = split[1];
		  
		  Scanner sc = new Scanner(System.in); System.out
		  .println("Enter the Name to be reversed - Give any one value FirstName , Lastname or complete reverse"
		  ); String nameTobeReversed = sc.nextLine(); sc.close();
		  
		  if (nameTobeReversed.equalsIgnoreCase("firstname")) { char[] ch =
		  firstName.toCharArray(); for (int i = firstName.length() - 1; i >= 0; i--) {
		  System.out.print(ch[i]); } System.out.println(" " + lastName);
		  
		  } else if (nameTobeReversed.equalsIgnoreCase("lastname")) { char[] ch =
		  lastName.toCharArray(); System.out.print(firstName + " "); for (int i =
		  lastName.length() - 1; i >= 0; i--) { System.out.print(ch[i]); }
		  
		  } else if (nameTobeReversed.equalsIgnoreCase("Complete reverse")) {
		  System.out.println(lastName + " " + firstName); }
		  
		  else { System.out.
		  println("Input not match... Please give correct name which has to be reversed"
		  ); }*/
		 
		String text = "It doesn't matter how slowly you go as long as you dont't stop";

		String[] split = text.split(" ");

		Map<Character, Integer> mp = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < split.length; i++) {
			char[] charArray = split[i].toCharArray();
			System.out.println(split[i]);
			for (int j = 0; j < charArray.length; j++) {
				
				if (mp.containsKey(charArray[j])) {
					mp.put(charArray[j], mp.get(charArray[j]) + 1);
				} else {
					mp.put(charArray[j], 1); 
				}	
			}		
		}

		System.out.println("Size of the Map " + mp.size());

		int totalNumberOfChar = 0;
		
		
		Set<Entry<Character, Integer>> entrySet = mp.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {

			System.out.print(entry.getKey() + " -  ");
			System.out.println(entry.getValue() + " times");
			totalNumberOfChar = totalNumberOfChar + entry.getValue();

		}
		System.out.println("Total Number of Words" + totalNumberOfChar);

	}
}
