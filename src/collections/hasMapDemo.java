package collections;//Map -hashmap, linkedhashmap, hashtable map is always in key and value format.

import java.util.HashMap;//insersion order is ascending {101=fal, 102=hitu, 103=Shrim, 104=hreem, 105=laxmi}
import java.util.Hashtable;//insersion order is descending {105=laxmi, 104=hreem, 103=Shrim, 102=hitu, 101=fal}
import java.util.Map.Entry;


public class hasMapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		//HashTable<Integer,String> hm = new HashTable<Integer,String>();
		hm.put(101, "fal");
		hm.put(102, "hitu");
		hm.put(103, "Shrim");
		hm.put(104, "hreem");
		hm.put(105, "laxmi");
		
		System.out.println(hm);
		
		for (Entry<Integer, String> h : hm.entrySet()) {
			System.out.println(h);
			
		}
		
		
		
	}

}
