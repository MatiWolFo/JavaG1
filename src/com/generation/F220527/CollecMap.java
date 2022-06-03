package com.generation.F220527;

import java.util.ArrayList;
import java.util.HashMap;

public class CollecMap {
	@SuppressWarnings({ "rawtypes", "unused" })
	public static void main(String[] args) {
		//Map collections
		//'K'ey pairs <-> 'V'alue
		//then, create an instance, the HashMaps do not work with 'index []', but with keys 'K'
		//HashMap<K, V> map = new HashMap<K, V>();
		//the precious can be written as follows
		HashMap objHashMap = new HashMap();
		//to assign 'K' and 'V' to the map using 'put'
		objHashMap.put("Name", "Anya Forgar");
		objHashMap.put("Catchphrase", "Waku Waku");
		objHashMap.put("Age", "6");
		//print the new array
		//remember '\n' is a line break
		System.out.println("HashMap elements:\n" + objHashMap);
		//to get the wished 'v' using a 'get' and the 'K' value
		System.out.println(objHashMap.get("Age"));
		//to remove a 'V' by using 'remove' and the 'K' value
		objHashMap.remove("Catchphrase");
		System.out.println(objHashMap);
		//to print or show all the 'K's available
		System.out.println(objHashMap.keySet());
		//to print or show all the 'V's available
		System.out.println(objHashMap.values());
		//if you want to access many data inside a 'K', create an 'new' array
		ArrayList<String> vowels = new ArrayList<String>();
		//add values to the array
		vowels.add("a");
		vowels.add("e");
		vowels.add("i");
		vowels.add("o");
		vowels.add("u");
		//now, add the vowels array to the HashMap to the 'V' and print them
		objHashMap.put("Vowels", vowels);
		System.out.println(objHashMap);
		//if 'K' not found, null is to be returned
		System.out.println(objHashMap.get(vowels));
		//to loop through a HashMap using a 'for each'
		//to turn an Object into String
		for (Object keys : objHashMap.keySet()) {
			//System.out.println(keys);
			//System.out.println(objHashMap.get(keys));
			//or print the text fancier
			System.out.println("Key: " + keys + " / Value of the Key: " + objHashMap.get(keys));
		}
	}
}
