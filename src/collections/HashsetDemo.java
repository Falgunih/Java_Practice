package collections;  //collection-----extends---------->Set --impliments->Hashset,LinkedHashset,Treeset

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

//set have unique value ,it does not have insertion order,
public class HashsetDemo {
	
	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Falguni");
		hs.add("Patel");
		hs.add("Selenium");
		hs.add("Classes");
		
		System.out.println(hs);
//		Iterator<String> it = hs.iterator();
//		while(it.hasNext()){
//			String ele = it.next();
//			System.out.println(ele);
		
		ArrayList<String> ar=new ArrayList<String>(hs);
		System.out.println(ar.get(1));//selenium
		//result is based on these result[Falguni, Selenium, Patel, Classes]
		
		
				
		
		
		
	}

	
}
